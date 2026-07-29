package com.wendyromero.fundamentals;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        double c = 10;
        double d = 3;

        System.out.println(c / d);

        System.out.println(10 / 3);

        System.out.println(10.0 / 3);

        System.out.println(10 / 3.0);

        System.out.println(10.0 / 3.0);

        int numero = 18;

        System.out.println("Número: " + numero);
        System.out.println("¿Es divisible entre 2? " + (numero % 2 == 0));
        System.out.println("¿Es divisible entre 3? " + (numero % 3 == 0));
        System.out.println("¿Es divisible entre 5? " + (numero % 5 == 0));

        System.out.println(10 > 3);
        System.out.println(10 < 3);
        System.out.println(10 >= 10);
        System.out.println(10 <= 9);
        System.out.println(10 == 10);
        System.out.println(10 != 10);

        int edad = 27;
        boolean tieneLicencia = true;

        System.out.println(edad >= 18 && tieneLicencia);
        System.out.println(edad >= 18 && false);
        System.out.println(edad < 18 && tieneLicencia);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(!true);
        System.out.println(!false);

        boolean esMayorDeEdad = true;

        System.out.println(!esMayorDeEdad);
    }
}
