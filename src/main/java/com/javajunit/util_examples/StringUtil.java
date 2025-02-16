package com.javajunit.util_examples;

/**
 * Clase que proporciona métodos para manipular cadenas de texto.
 */
public class StringUtil {

    /**
     * Método para generar una cadena concateada en base al número de veces que se le pide reptir
     * @param str cadena que se va a concatenar
     * @param times número de veces que se concatena
     * @return String cadena concatenada
     */
    public static String repeat(String str, int times) {

        if (times < 0) {
            throw new IllegalArgumentException("no está permitido que el número de veces sea negativo");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < times; i++) {
            result.append(str);
        }

        return result.toString();
    }
}
