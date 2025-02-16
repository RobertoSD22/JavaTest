package com.javajunit.examples.bdconexion.repository.model;

import java.util.Objects;

/**
 * Clase que representa una película.
 */
public class Movie {

    /** Identificador único de la película. */
    private Integer id;

    /** Nombre de la película. */
    private String name;

    /** Duración de la película en minutos. */
    private int minutes;

    /** Género de la película. */
    private Genre genre;

    /**
     * Constructor de la clase Movie.
     *
     * @param name Nombre de la película.
     * @param minutes Duración de la película en minutos.
     * @param genre Género de la película.
     */
    public Movie(String name, int minutes, Genre genre) {
        this(name, null, minutes, genre);
    }

    /**
     * Constructor de la clase Movie.
     *
     * @param name Nombre de la película.
     * @param id Identificador único de la película.
     * @param minutes Duración de la película en minutos.
     * @param genre Género de la película.
     */
    public Movie(String name, Integer id, int minutes, Genre genre) {
        this.name = name;
        this.id = id;
        this.minutes = minutes;
        this.genre = genre;
    }

    /**
     * Obtiene el identificador único de la película.
     *
     * @return Identificador único de la película.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el identificador único de la película.
     *
     * @param id Identificador único de la película.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la película.
     *
     * @return Nombre de la película.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la película.
     *
     * @param name Nombre de la película.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la duración de la película en minutos.
     *
     * @return Duración de la película en minutos.
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Establece la duración de la película en minutos.
     *
     * @param minutes Duración de la película en minutos.
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * Obtiene el género de la película.
     *
     * @return Género de la película.
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Establece el género de la película.
     *
     * @param genre Género de la película.
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return minutes == movie.minutes && Objects.equals(id, movie.id) && Objects.equals(name, movie.name) && genre == movie.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, minutes, genre);
    }
}
