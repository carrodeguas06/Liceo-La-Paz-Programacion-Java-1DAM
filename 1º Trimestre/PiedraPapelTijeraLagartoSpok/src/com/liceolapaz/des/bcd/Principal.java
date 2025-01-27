package com.liceolapaz.des.bcd;

import java.util.Random;
import java.util.Scanner;

public class Principal {public static void main(String[] args)

{
    while (true)

    {
        crearMenu();
        int menu = escaner();
        switch(menu)

        {
            case 1:
                juego();
                break;


            case 0:
                System.out.println("Hasta pronto");
                System.exit(0);

            default:
                System.out.println("Número no válido");
                break;
        }
    }
}

    private static void juego()

    {
        while (true)

        {
            int seleccionMaquina = generarRespuesta();
            System.out.print("Escriba su jugada (piedra, papel, tijeras, lagarto, Spock): ");
            String seleccion = escanerseleccion();

            //piedra=0 papel=1 tijeras=2 lagarto=3 Spock=4
            if (seleccion.equals("piedra"))
            {
                if (seleccionMaquina == 0)
                {
                    System.out.println("Has empatado el ordenador eligio piedra");
                    break;
                }

                if (seleccionMaquina == 1)
                {
                    System.out.println("Has perdido el ordenador eligio papel");
                    break;
                }

                if (seleccionMaquina == 2)
                {
                    System.out.println("Has ganado el ordenador eligio tijeras");
                    break;
                }

                if (seleccionMaquina == 3)
                {
                    System.out.println("Has ganado el ordenador eligio lagarto");
                    break;
                }

                if (seleccionMaquina == 4)
                {
                    System.out.println("Has perdido el ordenador eligio spock");
                    break;
                }
            }

            if (seleccion.equals("papel"))
            {
                if (seleccionMaquina == 0)
                {
                    System.out.println("Has ganado el ordenador eligio piedra");
                    break;
                }

                if (seleccionMaquina == 1)
                {
                    System.out.println("Has empatado el ordenador eligio papel");
                    break;
                }

                if (seleccionMaquina == 2)
                {
                    System.out.println("Has perdido el ordenador eligio tijeras");
                    break;
                }

                if (seleccionMaquina == 3)
                {
                    System.out.println("Has perdido el ordenador eligio lagarto");
                    break;
                }

                if (seleccionMaquina == 4)
                {
                    System.out.println("Has ganado el ordenador eligio spock");
                    break;
                }
            }

            if (seleccion.equals("tijeras"))
            {
                if (seleccionMaquina == 0)
                {
                    System.out.println("Has perdido el ordenador eligio piedra");
                    break;
                }

                if (seleccionMaquina == 1)
                {
                    System.out.println("Has ganado el ordenador eligio papel");
                    break;
                }

                if (seleccionMaquina == 2)
                {
                    System.out.println("Has empatado el ordenador eligio tijeras");
                    break;
                }

                if (seleccionMaquina == 3)
                {
                    System.out.println("Has ganado el ordenador eligio lagarto");
                    break;
                }

                if (seleccionMaquina == 4)
                {
                    System.out.println("Has perdido el ordenador eligio spock");
                    break;
                }
            }

            if (seleccion.equals("lagarto"))
            {
                if (seleccionMaquina == 0)
                {
                    System.out.println("Has perdido el ordenador eligio piedra");
                    break;
                }

                if (seleccionMaquina == 1)
                {
                    System.out.println("Has ganado el ordenador eligio papel");
                    break;
                }

                if (seleccionMaquina == 2)
                {
                    System.out.println("Has perdido el ordenador eligio tijeras");
                    break;
                }

                if (seleccionMaquina == 3)
                {
                    System.out.println("Has empatado el ordenador eligio lagarto");
                    break;
                }

                if (seleccionMaquina == 4)
                {
                    System.out.println("Has ganado el ordenador eligio spock");
                    break;
                }
            }

            if (seleccion.equals("Spock"))
            {
                if (seleccionMaquina == 0)
                {
                    System.out.println("Has ganado el ordenador eligio piedra");
                    break;
                }

                if (seleccionMaquina == 1)
                {
                    System.out.println("Has perdido el ordenador eligio papel");
                    break;
                }

                if (seleccionMaquina == 2)
                {
                    System.out.println("Has ganado el ordenador eligio tijeras");
                    break;
                }

                if (seleccionMaquina == 3)
                {
                    System.out.println("Has perdido el ordenador eligio lagarto");
                    break;
                }

                if (seleccionMaquina == 4)
                {
                    System.out.println("Has empatadoo el ordenador eligio spock");
                    break;
                }
            }
            else
            {
                System.out.println("Jugada no permitida");
                break;
            }
        }
    }


    private static int generarRespuesta() {
        Random respuesta = new Random();
        return respuesta.nextInt(5);
    }

    private static String escanerseleccion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void crearMenu() {
        System.out.print("""
                PIEDRA PAPEL TIJERAS LAGARTO SPOCK
                1. Jugar
                0. Salir
                Escoja una opción:""");
    }

    private static int escaner() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}

