package com.liceolapaz.dam.bcd;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Escribir menu
        escribirMenu();
        // Pedir opcion
        pedirOpcion();
        // Leer opcion y gurdarla
        int opcion = leerOpcion();
        // Realizar accion correspondiente a la opcion elegida
        realizarOpcion(opcion);

    }

    private static void realizarOpcion(int opcion) {
        switch (opcion) {
            case 0:
                System.out.println("¡Hasta la proxima!");
                System.exit(0);
                break;

        case 1:
            System.out.println("Ha elegido la opcion 1");
            break;
            case 2:
                System.out.println("Ha elegido la opcion 2");
                break;
            case 3:
                System.out.println("Ha elegido la opcion 3");
        break;
        default:
            System.out.println("Opcion no valida");}
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Escoja una opcion: ");
    }

    private static void escribirMenu() {
        System.out.println("""
                MENU PRINCIPAL
                1.Opcion 1
                2.Opcion 2
                3.Opcion 3
                0.Salir""");
    }
}
