package com.javajunit.examples.bdconexion.repository;

import com.javajunit.examples.bdconexion.repository.model.Movie;

import java.util.Collection;

/**
 * Interfaz que define los métodos para interactuar con el repositorio de películas.
 */
public interface MovieRepository {

    /**
     * Busca una película por su identificador único.
     *
     * @param id Identificador único de la película.
     * @return La película encontrada o null si no se encuentra.
     */
    Movie findById(Integer id);

    /**
     * Obtiene todas las películas del repositorio.
     *
     * @return Una colección de todas las películas.
     */
    Collection<Movie> findAll();

    /**
     * Guarda o actualiza una película en el repositorio.
     *
     * @param movie La película a guardar o actualizar.
     */
    void saveOrUpdate(Movie movie);
}

