package com.javajunit.examples.bdconexion.repository;

import com.javajunit.examples.bdconexion.repository.model.Genre;
import com.javajunit.examples.bdconexion.repository.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Implementación del repositorio de películas utilizando JdbcTemplate.
 */
public class MovieRepositoryImpl implements MovieRepository {

    private final JdbcTemplate jdbcTemplate;

    /**
     * Constructor de la clase MovieRepositoryImpl.
     *
     * @param jdbcTemplate el JdbcTemplate para interactuar con la base de datos
     */
    public MovieRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Busca una película por su ID.
     *
     * @param id el ID de la película a buscar
     * @return la película encontrada
     */
    @Override
    public Movie findById(Integer id) {
        RowMapper<Movie> movieMapper = getMovieRowMapper();
        Object[] args = {id};
        return jdbcTemplate.queryForObject("select * from movies where id = ? ", args, movieMapper);
    }

    /**
     * Recupera todas las películas.
     *
     * @return una colección de todas las películas
     */
    @Override
    public Collection<Movie> findAll() {
        RowMapper<Movie> movieMapper = getMovieRowMapper();
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    /**
     * Guarda o actualiza una película.
     *
     * @param movie la película a guardar o actualizar
     */
    @Override
    public void saveOrUpdate(Movie movie) {
        jdbcTemplate.update("insert into movies (name, minutes, genre) values (?,?,?)",
                movie.getName(), movie.getMinutes(), movie.getGenre().toString());
    }

    /**
     *
     * @return un RowMapper para objetos Movie
     */
    private static RowMapper<Movie> getMovieRowMapper() {
        return new RowMapper<Movie>() {
            @Override
            public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Movie(
                        rs.getString("name"),
                        rs.getInt("id"),
                        rs.getInt("minutes"),
                        Genre.valueOf(rs.getString("genre"))
                );
            }
        };
    }
}
