package com.liceolapaz.des.bcd;

import java.util.Random;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        while (true)
        {
            //crear menu
            System.out.print("""
                    ADIVINA EL NÚMERO
                    1. Del 1 al 10 (3 intentos)
                    2. Del 1 al 50 (5 intentos)
                    0. Salir
                    Escoja una opción: """);
            //escnear teclado
            int opcionMenu = leerNumero();
            //crear opciones
            switch (opcionMenu) {
                case 1:
                    System.out.print("Ha elegido la opcion 1");
                    int numeroAleatorio = generarAleatorio1(1, 10);

                    casoUnoMenu(numeroAleatorio);
                    break;
                case 2:
                    System.out.println("Ha elegido la opcion 2");
                    int numeroAleatorio2 = generarAleatorio1(1, 50);

                    casoDosMenu(numeroAleatorio2);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opcion no permitida");

            }
        }
    }

    private static void casoDosMenu(int numeroAleatorio2) {int numeroIntentos = 0;
        int numeroIntentosMaxim = 5;
        while (numeroIntentos < numeroIntentosMaxim) {
            System.out.println("Seleccione un numero del 1 al 50:");
            int numeroSeleccionado = leerNumero();
            numeroIntentos++;
            if (numeroSeleccionado == numeroAleatorio2) {
                System.out.println("Has acertado, el numero aleatorio es: " + numeroAleatorio2);
                break;
            }
            else if (numeroIntentos == numeroIntentosMaxim) {
                System.out.println("Has perdido, el numero aleatorio es: " + numeroAleatorio2);
                break;
            }

            else if (numeroAleatorio2 < numeroSeleccionado) {
                System.out.println("El numero aleatorio es mas pequeño");
            }
            else {
                System.out.println("El numero aleatorio es mas grande");
            }
        }
    }


    private static int generarAleatorio1(int min, int max) {
        Random aleatorio = new Random();
        return aleatorio.nextInt(max - min) + min;
    }


    private static void casoUnoMenu(int numeroAleatorio) {
        int numeroIntentos = 0;
        int numeroIntentosMaxim = 3;
        while (numeroIntentos < numeroIntentosMaxim) {
            System.out.println("Seleccione un numero del 1 al 10:");
            int numeroSeleccionado = leerNumero();
            numeroIntentos++;
            if (numeroSeleccionado == numeroAleatorio) {
                System.out.println("Has acertado, el numero aleatorio es: " + numeroAleatorio);
                break;
            }
            else if (numeroIntentos == numeroIntentosMaxim) {
                System.out.println("Has perdido, el numero aleatorio es: " + numeroAleatorio);
                break;
            }

           else if (numeroAleatorio < numeroSeleccionado) {
                System.out.println("El numero aleatorio es mas pequeño");
            }
            else {
                System.out.println("El numero aleatorio es mas grande");
            }
        }
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}

