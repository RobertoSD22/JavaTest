# Java TDD Examples

Este proyecto contiene ejemplos de desarrollo guiado por pruebas (TDD) en Java, utilizando JUnit y Mockito.

## Descripción

El proyecto incluye varias clases de utilidad y ejemplos de implementación de TDD:

- **NumberPractice**: Implementa una función que retorna "Fizz", "Buzz" o "FizzBuzz" basado en la divisibilidad de un número.
- **RomanNumerals**: Proporciona métodos para convertir números arábigos a números romanos.
- **DateUtilLeapYear**: Determina si un año es bisiesto.
- **PasswordUtil**: Evalúa la seguridad de una contraseña.
- **StringUtil**: Proporciona métodos para manipular cadenas de texto.

## Requisitos

- Java 8 o superior
- Maven

## Instalación

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu_usuario/tu_repositorio.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd tu_repositorio
    ```
3. Compila el proyecto con Maven:
    ```sh
    mvn clean install
    ```

## Ejecución de Pruebas

Para ejecutar las pruebas unitarias, utiliza el siguiente comando:
```sh
mvn test## JUnit /Mockito
```

## Estructura del Proyecto

- src/main/java/com/javajunit/examples/tdd: Contiene las clases principales del proyecto.
- src/test/java/com/javajunit/examples/tdd: Contiene las pruebas unitarias para las clases principales.
- src/main/java/com/javajunit/util_examples: Contiene las clases de utilidades.
- src/test/java/com/javajunit/util_examples: Contiene las pruebas unitarias para las clases de utilidades.

## Tecnologías Utilizadas
- Java: Lenguaje de programación principal.
- JUnit: Framework para pruebas unitarias.

## Contribuciones
Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
3. Realiza tus cambios y haz commit (git commit -am 'Añadir nueva funcionalidad').
4. Sube tus cambios a tu fork (git push origin feature/nueva-funcionalidad).
5. Abre un Pull Request.