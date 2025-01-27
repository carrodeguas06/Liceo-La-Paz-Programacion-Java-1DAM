package com.liceolapaz.des.bcd;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    private static int edadJugador;
    private static String posicionJugador;
    private static int [] estadisticas;
    private static String [] nombreEstadisticas;
    private static int puntosExtra = 0;
    public static void main(String[] args) {
        nombreEstadisticas = new String[7];
        nombreEstadisticas[1]= "Disparo"; nombreEstadisticas[2]= "Regate"; nombreEstadisticas[3]= "Pase"; nombreEstadisticas[4]= "Velocidad"; nombreEstadisticas[5]= "Defensa"; nombreEstadisticas[6]= "Portería";
        estadisticas = new int[7];
        while (true)
        {
            crearMenu();
            int opcion = escaner();
            switch (opcion)
            {
                case 1:
                    edadJugador();
                    break;

                case 2:
                    posicionJugador();
                    break;

                case 3:
                    estadisticasJugador();
                    break;

                case 4:
                    puntosExtraJugador();
                    break;

                case 5:
                    estadoJugador();
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    private static void estadoJugador() {
        int sumaEstadisticas = estadisticas[1] + estadisticas[2] + estadisticas[3] + estadisticas[4] + estadisticas[5] + estadisticas[6];
        int mediaHabilidades = sumaEstadisticas / 6;

        System.out.println("Edad: " + edadJugador);
        System.out.println("Posicion: " + posicionJugador);
        System.out.println("Disparo: " + estadisticas[1]);
        System.out.println("Regate: " + estadisticas[2]);
        System.out.println("Pase: " + estadisticas[3]);
        System.out.println("Velocidad: " + estadisticas[4]);
        System.out.println("Defensa: " + estadisticas[5]);
        System.out.println("Porteria: " + estadisticas[6]);
        System.out.println("Media Habilidades: " + mediaHabilidades);
    }

    private static void puntosExtraJugador() {
        if (puntosExtra == 0)
        {
            System.out.println("No tienes puntos extra");
        }
        else
        {
            System.out.println("""
                    SELECCIONE A QUE ESTADISTICA SUBIR LOS PUNTOS:
                    1. Disparo
                    2. Regate
                    3. Pase
                    4. Velocidad
                    5. Defensa
                    6. Porteria""");

            int opcion = escaner();
            if (opcion < 1 || opcion > 6)
            {
                System.out.println("Opcion no valida");
            }
            else if (estadisticas[opcion] >= 99)
            {
                System.out.println("No puedes subir más esta estadistica");
            }
            else
            {
                System.out.println("¿Cuanto quieres subir esta estadistica? Esta habilidad posee " + estadisticas[opcion]+ " puntos. Posees " + puntosExtra + "puntos extra");

                int cantidadSubir = escaner();

                if (cantidadSubir > puntosExtra)
                {
                    System.out.println("No posees tantos puntos extras");
                }
                else if (cantidadSubir <0 )
                {
                    System.out.println("No se pueden quitar puntos");
                }
                else if (cantidadSubir + estadisticas[opcion] > 99)
                {
                    System.out.println("No puedes subir esta estadistica tanto");
                }
                else
                {
                    estadisticas[opcion] = cantidadSubir + estadisticas[opcion];
                    puntosExtra = cantidadSubir - puntosExtra;
                    System.out.println("La nueva contidad es: " + nombreEstadisticas[opcion]+ "= " + estadisticas[opcion]);
                }

            }
        }

    }

    private static void estadisticasJugador() {
        int contador = 1;
        while (contador <=6)
        {
            int numeroEstadistica = estadisticasAleatorias();

            estadisticas[contador] = numeroEstadistica;
            System.out.println(nombreEstadisticas[contador]+ "= " + estadisticas[contador]);
            contador++;
        }
        puntosExtra = 50;
    }

    private static int estadisticasAleatorias() {
        Random estadistica = new Random();
        return estadistica.nextInt(99)+1;
    }

    private static void posicionJugador() {
        int posicion = posicionAleatoria();
        if (posicion == 0)
        {
            posicionJugador = "Portero";
        }

        else if (posicion == 1)
        {
            posicionJugador = "Defensa";
        }

        else if (posicion == 2)
        {
            posicionJugador = "Mediocentro";
        }

        else if (posicion == 3)
        {
            posicionJugador = "Delantero";
        }
        System.out.println("La posicion de tu jugador es: " + posicionJugador);
    }

    private static int posicionAleatoria() {
        Random posicion = new Random();
        return posicion.nextInt(4);
    }

    private static void edadJugador() {
        edadJugador = edadAleatoria();
        System.out.println("la edad del jugador es: " + edadJugador);
    }

    private static int edadAleatoria() {
        Random edad = new Random();
        return edad.nextInt(20)+16;
    }

    private static int escaner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void crearMenu() {
        System.out.println("""
                CREACIÓN JUGADOR
                1. Edad
                2. Posición
                3. Habilidades
                4. Puntos extras
                5. Mostrar jugador
                0. Salir
                Escoja una opción: """);
    }
}