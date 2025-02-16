package com.javajunit.examples.tdd;

import com.javajunit.examples.tdd.NumberPractice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Pruebas unitarias para la clase NumberPractice.
 */
public class NumberPracticeTest {

    private NumberPractice practice;

    /**
     * Configuración inicial para las pruebas.
     *
     * @throws Exception si ocurre un error durante la configuración
     */
    @Before
    public void beforeClass() throws Exception {
        practice = new NumberPractice();
    }

    /**
     * Prueba para verificar que se devuelve "Fizz" cuando el número es divisible por 3.
     */
    @Test
    public void returnFizzWhenNumberIsDivisibleBy3() {
        Assert.assertEquals(practice.getStringByDivisibleNumber(3), NumberPractice.StringResult.FIZZ.getDescripcion());
    }

    /**
     * Prueba para verificar que se devuelve "Buzz" cuando el número es divisible por 5.
     */
    @Test
    public void returnBuzzWhenNumberIsDivisibleBy5() {
        Assert.assertEquals(practice.getStringByDivisibleNumber(10), NumberPractice.StringResult.BUZZ.getDescripcion());
    }

    /**
     * Prueba para verificar que se devuelve "FizzBuzz" cuando el número es divisible por 3 y 5.
     */
    @Test
    public void returnFizzBuzzWhenNumberIsDivisibleBy3And5() {
        Assert.assertEquals(practice.getStringByDivisibleNumber(15), NumberPractice.StringResult.FIZZBUZZ.getDescripcion());
    }

    /**
     * Prueba para verificar que se devuelve el número cuando no es divisible por 3 o 5.
     */
    @Test
    public void returnNumberWhenIsNotDivisibleBy3Or5() {
        Assert.assertEquals(practice.getStringByDivisibleNumber(2), "2");
    }
}