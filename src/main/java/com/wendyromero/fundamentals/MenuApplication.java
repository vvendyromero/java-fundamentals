package com.wendyromero.fundamentals;
import java.util.Scanner;

public class MenuApplication{
    public static void main(String[] args) {

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 3) {

                System.out.println("===== MENÚ =====");
                System.out.println("1. Saludar");
                System.out.println("2. Mostrar la hora");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Hola Wendy.");
                        break;

                    case 2:
                        System.out.println("Son las 10:00.");
                        break;

                    case 3:
                        System.out.println("Hasta luego.");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }


        }
        scanner.close();

    }

}