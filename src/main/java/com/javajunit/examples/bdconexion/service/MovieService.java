package com.javajunit.examples.bdconexion.service;

import com.javajunit.examples.bdconexion.repository.MovieRepository;
import com.javajunit.examples.bdconexion.repository.model.Genre;
import com.javajunit.examples.bdconexion.repository.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * La clase `MovieService` proporciona métodos para interactuar con el `MovieRepository`
 * y recuperar películas basadas en criterios específicos.
 */
public class MovieService {

    private MovieRepository movieRepository;

    /**
     * Constructor de la clase `MovieService`.
     *
     * @param movieRepository el repositorio de películas
     */
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    /**
     * Recupera todas las películas de un género específico.
     *
     * @param genre el género de las películas a recuperar
     * @return una colección de películas del género especificado
     */
    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream().
                filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    /**
     * Recupera todas las películas con una duración específica en minutos.
     *
     * @param minutes la duración en minutos de las películas a recuperar
     * @return una colección de películas con la duración especificada
     */
    public Collection<Movie> findMoviesByMinutes(int minutes) {
        return movieRepository.findAll().stream().
                filter(movie -> movie.getMinutes() == minutes).collect(Collectors.toList());
    }
}
