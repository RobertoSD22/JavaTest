package com.javajunit.examples.tdd;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que proporciona métodos para convertir números arábigos a números romanos.
 */
public class RomanNumerals {

    /**
     * Enum que representa los números romanos y sus valores correspondientes.
     */
    enum RomanNumeral {

        M(1000), CM(900), D(500), CD(400),
        C(100), XC(90), L(50), XL(40),
        X(10), IX(9), V(5), IV(4),
        I(1);

        private int value;

        /**
         * Constructor del enum RomanNumeral.
         *
         * @param value el valor del número romano
         */
        RomanNumeral(int value) {
            this.value = value;
        }

        /**
         * Obtiene el valor del número romano.
         *
         * @return el valor del número romano
         */
        public int getValue() {
            return value;
        }

        /**
         *
         * @return una lista de números romanos
         */
        public static List<RomanNumeral> getRomanNumerals() {
            return Arrays.asList(RomanNumeral.values());
        }
    }

    /**
     * Convierte un número arábigo a su representación en números romanos.
     *
     * @param n el número arábigo a convertir
     * @return la representación en números romanos del número dado
     * @throws IllegalArgumentException si el número no está en el rango (0, 4000)
     */
    public static String arabicToRoman(int n) {

        StringBuilder collator = new StringBuilder();
        List<RomanNumeral> romanNumerals = RomanNumeral.getRomanNumerals();

        // Valida que el número sea menor a 4000 debido a que el formato cambia
        if (n > 0 && n < 4000) {

            int i = 0;
            while (n > 0 && i < romanNumerals.size()) {
                RomanNumeral currentRoman = romanNumerals.get(i);
                if (n >= currentRoman.getValue()) {
                    n -= currentRoman.getValue();
                } else {
                    i++;
                }
            }

            return collator.toString();

        } else {
            throw new IllegalArgumentException(n + " no está en el rango (0, 4000)");
        }
    }
}