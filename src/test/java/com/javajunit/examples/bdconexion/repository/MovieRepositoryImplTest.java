package com.javajunit.examples.bdconexion.repository;

import com.javajunit.examples.bdconexion.repository.model.Genre;
import com.javajunit.examples.bdconexion.repository.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase MovieRepositoryImpl.
 */
public class MovieRepositoryImplTest {

    private MovieRepositoryImpl movieRepository;
    private DataSource dataSource;

    /**
     * Configuración inicial para las pruebas.
     *
     * @throws Exception si ocurre un error durante la configuración
     */
    @Before
    public void setUp() throws Exception {
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","sa","sa");
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test.sql"));
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        movieRepository = new MovieRepositoryImpl(jdbcTemplate);
    }

    /**
     * Prueba para cargar todas las películas.
     *
     * @throws SQLException si ocurre un error durante la consulta
     */
    @Test
    public void loadAllMovies() throws SQLException {
        Collection<Movie> movies = movieRepository.findAll();
        assertThat(movies, CoreMatchers.is(Arrays.asList(
                new Movie("Dark Knight",1, 12, Genre.ACTION),
                new Movie("Memento",2, 11, Genre.THRILLER),
                new Movie("Matrix",3, 12, Genre.ACTION)
        )));
    }

    /**
     * Prueba para cargar una película por su ID.
     */
    @Test
    public void loadMovieById() {
        Movie movieTwo = movieRepository.findById(2);
        assertThat(movieTwo, CoreMatchers.is(new Movie("Memento",2, 11, Genre.THRILLER)));
    }

    /**
     * Prueba para insertar una película.
     */
    @Test
    public void insertAMovie() {
        movieRepository.saveOrUpdate(new Movie("Super 8",12, Genre.THRILLER));
        Movie movieActual = movieRepository.findById(4);
        assertEquals(new Movie("Super 8", 4,12, Genre.THRILLER), movieActual);
    }

    /**
     * Limpieza después de las pruebas.
     *
     * @throws Exception si ocurre un error durante la limpieza
     */
    @After
    public void tearDown() throws Exception {
        try (Statement s = dataSource.getConnection().createStatement()) {
            s.execute("drop all objects delete files");
        }
        System.out.println("La base de datos ha sido eliminada");
    }
}