package com.javajunit.util_examples;

import java.time.Year;

/**
 * Clase que proporciona métodos para determinar si un año es bisiesto.
 */
public class DateUtilLeapYear {

    /**
     * Determina si el año dado es bisiesto.
     *
     * @param year el año a evaluar
     * @return true si el año es bisiesto, false en caso contrario
     */
    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }
}