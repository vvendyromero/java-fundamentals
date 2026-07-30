package com.wendyromero.fundamentals;

public class AtmMenu {

    public static void main(String[] args) {

        int opcion = 3;

        switch (opcion) {

            case 1:
                System.out.println("Consultar saldo.");
                break;

            case 2:
                System.out.println("Retirar dinero.");
                break;

            case 3:
                System.out.println("Depositar dinero.");
                break;

            case 4:
                System.out.println("Transferir dinero.");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Gracias por usar el cajero.");
    }

}
