package com.javajunit.examples.tdd;

import com.javajunit.examples.tdd.RomanNumerals;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase RomanNumerals.
 */
public class RomanNumeralsTest {

    /**
     * Prueba para verificar que se devuelven los números romanos correctos.
     */
    @Test
    public void returnCorrectNumbers() {

        assertEquals(RomanNumerals.arabicToRoman(1), "I");
        assertEquals(RomanNumerals.arabicToRoman(15), "XV");
        assertEquals(RomanNumerals.arabicToRoman(51), "LI");
        assertEquals(RomanNumerals.arabicToRoman(70), "LXX");
        assertEquals(RomanNumerals.arabicToRoman(86), "LXXXVI");
        assertEquals(RomanNumerals.arabicToRoman(126), "CXXVI");
        assertEquals(RomanNumerals.arabicToRoman(2507), "MMDVII");
    }

    /**
     * Prueba para verificar que no se devuelven los números romanos incorrectos.
     */
    @Test
    public void returnIncorrectNumbers() {

        assertNotEquals(RomanNumerals.arabicToRoman(2), "X");
        assertNotEquals(RomanNumerals.arabicToRoman(34), "X");
        assertNotEquals(RomanNumerals.arabicToRoman(678), "X");
        assertNotEquals(RomanNumerals.arabicToRoman(2566), "X");
    }

    /**
     * Prueba para verificar que se lanza una excepción IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void returnIllegalArgumentException() {
        RomanNumerals.arabicToRoman(18763);
    }
}