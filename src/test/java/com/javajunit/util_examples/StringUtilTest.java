package com.javajunit.util_examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas unitarias para la clase StringUtil.
 */
public class StringUtilTest {

    /**
     * Prueba para verificar que la cadena se repite una vez.
     */
    @Test
    public void repeatStringOnce() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    /**
     * Prueba para verificar que la cadena se repite varias veces.
     */
    @Test
    public void repeatStringTimes() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    /**
     * Prueba para verificar que la cadena no se repite cuando el número de repeticiones es cero.
     */
    @Test
    public void repeatStringZeroTimes() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    /**
     * Prueba para verificar que se lanza una excepción IllegalArgumentException cuando el número de repeticiones es negativo.
     */
    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegativeTime() {
        String result = StringUtil.repeat("hola", -1);
    }
}