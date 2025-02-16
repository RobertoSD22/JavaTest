package com.javajunit.util_examples;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static com.javajunit.util_examples.DateUtilLeapYear.isLeapYear;
import static org.junit.Assert.*;

/**
 * Clase para determinar si un a&ntilde;o es bisiesto o no, debemos seguir las siguientes reglas:
 * Todos los a&ntilde;os divisibles por 400 son bisiestos (1600, 2000, 2400)
 * Todos los a&ntilde;os divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
 * Todos los a&ntilde;os divisibles por 4 son bisiestos (1996, 2004, 2012)
 * Todos los a&ntilde;os que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)
 * Está clase fue creada a patir de la métodología TDD (Test Driven Development).
 */
@SuppressWarnings("deprecation")
public class DateUtilLeapYearTest {

    /**
     * Prueba para verificar que se devuelve true cuando el a&ntilde;o es divisible por 400.
     */
    @Test
    public void returnTrueWhenYearIsDivisibleBy400() {

        assertThat(isLeapYear(1600), CoreMatchers.is(true));
        assertThat(isLeapYear(2000), CoreMatchers.is(true));
        assertThat(isLeapYear(2400), CoreMatchers.is(true));
    }

    /**
     * Prueba para verificar que se devuelve false cuando el a&ntilde;o es divisible por 100 pero no por 400.
     */
    @Test
    public void returnFalseWhenYearIsDivisibleBy100ButNotBy400() {

        assertThat(isLeapYear(1700), CoreMatchers.is(false));
        assertThat(isLeapYear(1800), CoreMatchers.is(false));
        assertThat(isLeapYear(1900), CoreMatchers.is(false));
    }

    /**
     * Prueba para verificar que se devuelve true cuando el a&ntilde;o es divisible por 4 pero no por 100.
     */
    @Test
    public void returnTrueWhenYearIsDivisibleBy4ButNotBy100() {

        assertThat(isLeapYear(1996), CoreMatchers.is(true));
        assertThat(isLeapYear(2004), CoreMatchers.is(true));
        assertThat(isLeapYear(2008), CoreMatchers.is(true));
    }

    /**
     * Prueba para verificar que se devuelve false cuando el a&ntilde;o no es divisible por 4.
     */
    @Test
    public void returnFalseWhenYearIsNotDivisibleBy4() {

        assertThat(isLeapYear(2017), CoreMatchers.is(false));
        assertThat(isLeapYear(2018), CoreMatchers.is(false));
        assertThat(isLeapYear(2019), CoreMatchers.is(false));
    }
}