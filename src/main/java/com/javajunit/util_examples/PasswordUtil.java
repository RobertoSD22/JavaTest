package com.javajunit.util_examples;

/**
 * Clase que proporciona métodos para evaluar la seguridad de una contraseña.
 */
public class PasswordUtil {

    /**
     * Enum que representa los niveles de seguridad de una contraseña.
     */
    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    /**
     * Evalúa la seguridad de una contraseña dada.
     *
     * @param password la contraseña a evaluar
     * @return el nivel de seguridad de la contraseña
     */
    public static SecurityLevel assessPassword(String password) {

        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
