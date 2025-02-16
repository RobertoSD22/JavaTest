package com.javajunit.examples.bdconexion.service;

import com.javajunit.examples.bdconexion.repository.MovieRepository;
import com.javajunit.examples.bdconexion.repository.model.Genre;
import com.javajunit.examples.bdconexion.repository.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase MovieService.
 */
public class MovieServiceTest {

    private MovieService movieService;

    /**
     * Configuración inicial para las pruebas.
     *
     * @throws Exception si ocurre un error durante la configuración
     */
    @Before
    public void setUp() throws Exception {

        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie("Dark Knight",1, 12, Genre.ACTION),
                        new Movie("Memento",2, 11, Genre.THRILLER),
                        new Movie("There´s Something About Mary",3, 12, Genre.COMEDY),
                        new Movie("Super 8",4, 14, Genre.THRILLER),
                        new Movie("Scream",5, 15, Genre.HORROR),
                        new Movie("Home Alone",6, 12, Genre.COMEDY),
                        new Movie("Matrix",7, 12, Genre.ACTION)
                )
        );

        movieService = new MovieService(movieRepository);
    }

    /**
     * Prueba para verificar que se devuelven las películas por género.
     */
    @Test
    public void returnMoviesByGenre() {

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        List<Integer> movieIds = getIds(movies);

        assertEquals(new ArrayList<>(Arrays.asList(3, 6)), movieIds);
    }

    /**
     * Prueba para verificar que se devuelven las películas por duración en minutos.
     */
    @Test
    public void returnMoviesByMinutes() {

        Collection<Movie> movies = movieService.findMoviesByMinutes(12);
        List<Integer> movieIds = getIds(movies);

        assertEquals(new ArrayList<>(Arrays.asList(1, 3, 6, 7)), movieIds);
    }

    /**
     * Método auxiliar para obtener los IDs de una colección de películas.
     *
     * @param movies la colección de películas
     * @return una lista de IDs de las películas
     */
    private static List<Integer> getIds(Collection<Movie> movies) {
        //Lambda Normal
        //List<Integer> movieIds = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
        //Lambda Mejorada
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }
}