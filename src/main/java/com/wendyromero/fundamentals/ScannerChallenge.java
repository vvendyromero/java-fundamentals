package com.wendyromero.fundamentals;

import java.util.Scanner;

public class ScannerChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.print("Cuantos aÑos tienes?");
        int edad = scanner.nextInt();

        scanner.nextLine(); // Limpia el Enter pendiente

        System.out.print("En qué ciudad vives?");
        String ciudad = scanner.nextLine();

        System.out.println();
        System.out.println("===== RESUMEN =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);

        scanner.close();



    }
}
