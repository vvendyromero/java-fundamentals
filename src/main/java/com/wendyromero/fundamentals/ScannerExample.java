package com.wendyromero.fundamentals;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + ", mucho gusto.");
        System.out.print("¿En que ciudad vives? ");
        String ciudad = scanner.nextLine();
        System.out.print("¿Cuantos años tienes? ");
        int edad = scanner.nextInt();
        scanner.close();

    }

}
