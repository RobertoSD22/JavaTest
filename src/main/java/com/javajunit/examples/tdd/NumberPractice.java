package com.javajunit.examples.tdd;

/**
 * Usando TDD (empieza por los tests), implementa una función que dado un número:
 * Si el número es divisible por 3, retorna “Fizz”
 * Si el número es divisible por 5, retorna “Buzz”
 * Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
 * En otro caso, retorna el mismo número
 */
public class NumberPractice {

    /**
     * Enum que representa los posibles resultados de la función.
     */
    public enum StringResult {
        FIZZ("Fizz"),
        BUZZ("Buzz"),
        FIZZBUZZ("FizzBuzz");

        private final String descripcion;

        StringResult(String descripcion) {
            this.descripcion = descripcion;
        }

        /**
         * Obtiene la descripción del resultado.
         *
         * @return la descripción del resultado
         */
        public String getDescripcion() {
            return descripcion;
        }
    }

    /**
     * Retorna una cadena basada en la divisibilidad del número dado.
     *
     * @param number el número a evaluar
     * @return "Fizz" si el número es divisible por 3, "Buzz" si es divisible por 5,
     * "FizzBuzz" si es divisible por ambos, o el número como cadena en otro caso
     */
    public String getStringByDivisibleNumber(int number) {
        String result = "";

        if (number % 3 == 0) result += "Fizz";
        if (number % 5 == 0) result += "Buzz";

        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
