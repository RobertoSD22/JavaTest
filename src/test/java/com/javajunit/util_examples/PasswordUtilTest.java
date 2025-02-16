package com.javajunit.util_examples;

import org.junit.Test;

import static com.javajunit.util_examples.PasswordUtil.SecurityLevel.WEAK;
import static com.javajunit.util_examples.PasswordUtil.SecurityLevel.MEDIUM;
import static com.javajunit.util_examples.PasswordUtil.SecurityLevel.STRONG;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase PasswordUtil.
 */
public class PasswordUtilTest {

    /**
     * Prueba para verificar que la contraseña es débil cuando tiene menos de 8 caracteres.
     */
    @Test
    public void weakWhenHasLessThan8Letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("1234abc"));
    }

    /**
     * Prueba para verificar que la contraseña es débil cuando solo tiene letras.
     */
    @Test
    public void weakWhenHasLessOnlyLetters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    /**
     * Prueba para verificar que la contraseña es de nivel medio cuando tiene letras y números.
     */
    @Test
    public void mediumWhenHasLettersAndNumbers(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcdefgh123"));
    }

    /**
     * Prueba para verificar que la contraseña es fuerte cuando tiene letras, números y símbolos.
     */
    @Test
    public void strongWhenHasLettersNumbersAndSymbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abcdefgh123*!"));
    }
}

