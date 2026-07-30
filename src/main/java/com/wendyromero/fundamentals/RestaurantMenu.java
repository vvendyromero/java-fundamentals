package com.wendyromero.fundamentals;

import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== RESTAURANTE =====");

        System.out.println("1. Hamburguesa");
        System.out.println("2. Pizza");
        System.out.println("3. Ensalada");
        System.out.println("4. Pasta");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        switch (opcion) {

            case 1:
                System.out.println("Has pedido una Hamburguesa.");
                break;
            case 2:
                System.out.println("Has pedido una Pizza.");
                break;

            case 3:
                System.out.println("Has pedido una Ensalada.");
                break;

            case 4:
                System.out.println("Has pedido una Pasta.");
                break;

                default:
                    System.out.println("Opción no disponible.");
                    break;
        }

        System.out.println("Gracias por visitarnos.");

        scanner.close();
    }
}
