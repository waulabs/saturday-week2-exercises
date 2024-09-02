package org.alvarowau.exercise1;

/**
 * Ejercicio Práctico: Calculadora Simple (15 minutos)
 * Crea un programa de calculadora simple con métodos para sumar, restar, multiplicar y dividir.
 * Descripción de la Tarea:
 * Define cuatro métodos: add, subtract, multiply, y divide.
 * Cada método debe aceptar dos parámetros enteros y devolver el resultado.
 * En el método main, demuestra el uso de cada método de la calculadora llamándolos con entradas de muestra.
 * Desafíos Adicionales (si el tiempo lo permite):
 * Validación de Entradas: Modifica los métodos para validar las entradas (por ejemplo, verifica que no sean números negativos).
 * Operaciones con Punto Flotante: Sobrecarga los métodos para manejar operaciones de punto flotante aceptando parámetros double.
 * Recuerda probar tus métodos exhaustivamente para asegurarte de que manejen todas las entradas esperadas e inesperadas de manera adecuada. ¡Buena suerte!
 */
public class Exercise1 {
    public static void main(String[] args) {
        // Ejemplos de números double
        double number1 = 10.5;
        double number2 = 5.2;
        double number3 = -3.0;
        double number4 = 0.0;

        // Ejemplos de números int
        int intNumber1 = 10;
        int intNumber2 = 5;
        int intNumber3 = -3;
        int intNumber4 = 0;

        // Demostración del uso de cada método con double
        System.out.println("Suma (double): " + add(number1, number2));
        System.out.println("Resta (double): " + subtract(number1, number2));
        System.out.println("Multiplicación (double): " + multiply(number1, number2));
        System.out.println("División (double): " + divide(number1, number2));

        // Demostración del uso de cada método con int
        System.out.println("Suma (int): " + add(intNumber1, intNumber2));
        System.out.println("Resta (int): " + subtract(intNumber1, intNumber2));
        System.out.println("Multiplicación (int): " + multiply(intNumber1, intNumber2));
        System.out.println("División (int): " + divide(intNumber1, intNumber2));

        // Prueba de validación (no debería permitir números negativos)
        System.out.println("Intentando sumar un número negativo (double): " + add(number1, number3));
        System.out.println("Intentando sumar un número negativo (int): " + add(intNumber1, intNumber3));

        // Prueba de división por cero
        System.out.println("División por cero (double): " + divide(number1, number4));
        System.out.println("División por cero (int): " + divide(intNumber1, intNumber4));
    }

    // Método para manejar mensajes de error por números negativos
    private static void printError() {
        System.out.println("Error: No se permiten números negativos.");
    }

    // Método para manejar mensajes de error por división por cero
    private static void printDivisionByZeroError() {
        System.out.println("Error: No se puede dividir por cero.");
    }

    // Métodos de la calculadora para double
    private static double add(double number1, double number2) {
        if (notNegatives(number1, number2)) {
            return number1 + number2;
        } else {
            printError();
            return Double.NaN;
        }
    }

    private static double subtract(double number1, double number2) {
        if (notNegatives(number1, number2)) {
            return number1 - number2;
        } else {
            printError();
            return Double.NaN;
        }
    }

    private static double multiply(double number1, double number2) {
        if (notNegatives(number1, number2)) {
            return number1 * number2;
        } else {
            printError();
            return Double.NaN;
        }
    }

    private static double divide(double number1, double number2) {
        if (notNegatives(number1, number2)) {
            if (number2 == 0) {
                printDivisionByZeroError();
                return Double.NaN;
            }
            return number1 / number2;
        } else {
            printError();
            return Double.NaN;
        }
    }

    // Métodos de la calculadora para int
    private static int add(int number1, int number2) {
        if (notNegatives(number1, number2)) {
            return number1 + number2;
        } else {
            printError();
            return Integer.MIN_VALUE;
        }
    }

    private static int subtract(int number1, int number2) {
        if (notNegatives(number1, number2)) {
            return number1 - number2;
        } else {
            printError();
            return Integer.MIN_VALUE;
        }
    }

    private static int multiply(int number1, int number2) {
        if (notNegatives(number1, number2)) {
            return number1 * number2;
        } else {
            printError();
            return Integer.MIN_VALUE;
        }
    }

    private static int divide(int number1, int number2) {
        if (notNegatives(number1, number2)) {
            if (number2 == 0) {
                printDivisionByZeroError();
                return Integer.MIN_VALUE;
            }
            return number1 / number2;
        } else {
            printError();
            return Integer.MIN_VALUE;
        }
    }

    // Método para verificar si los números no son negativos (para double)
    private static boolean notNegatives(double number1, double number2) {
        return number1 >= 0 && number2 >= 0;
    }

    // Método para verificar si los números no son negativos (para int)
    private static boolean notNegatives(int number1, int number2) {
        return number1 >= 0 && number2 >= 0;
    }
}

