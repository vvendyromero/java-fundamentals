package com.wendyromero.fundamentals;

public class SwitchExample {
public static void main(String[] args) {

    int opcion = 2;
    switch (opcion) {

        case 1:
            System.out.println("Seleccionaste la opcion 1.");
            break;

        case 2:
            System.out.println("Seleccionaste la opcion 2.");
            break;

        case 3:
            System.out.println("Seleccionaste la opcion 3.");
            break;

        default:
            System.out.println("Opcion no valida.");

    }

    System.out.println("Fin del programa.");
    }
}



