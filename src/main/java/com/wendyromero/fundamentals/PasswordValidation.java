package com.wendyromero.fundamentals;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password;
        System.out.print("Ingrese la contraseña: ");
        password = scanner.nextLine();

        while (!password.equals("java123")) {

            System.out.println("Contraseña incorrecta.");

            System.out.print("Ingrese la contraseña: ");
            password = scanner.nextLine();

        }
        System.out.println("Contraseña correcta.");
        System.out.println("Bienvenida.");

        scanner.close();
    }
}
