package com.liceolapaz.dam.bcd;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir numero a buscar
        pedirNumeroABuscar();
        // Leer el numero a buscar y guardarlo
        int numeroABuscar = leerNumero();
        // Pedir el maximo de intentos
        pedirMaximosIntentos();

        // Leer el numero de intentos y guardarlo
        int maximoDeIntentos = leerNumero();
        // Guardar numero de intentosç
        int numeroDeIntentos = 0;
        // mientras no llegamos al numero de intentos
        while (numeroDeIntentos < maximoDeIntentos) {
            // generar un numero aleatorio y almacenarlo y guardarlo
            int numeroAleatorio = generarNumeroAleatorio(1, 10);
            // sumar un intento
            numeroDeIntentos++;
            // El numero generado es
            numeroGenerado(numeroAleatorio);
            // comprobar numero aleatorio
            comprobarNumeroAleatorio(numeroAleatorio, numeroABuscar, numeroDeIntentos, maximoDeIntentos);
            // si el numero aleatorio es le buscado; salir del bucle
            if(numeroAleatorio == numeroABuscar)
                break;
        }
    }

    private static void comprobarNumeroAleatorio(int numeroAleatorio, int numeroABuscar, int numeroDeIntentos, int maximoDeIntentos) {
        if (numeroAleatorio == numeroABuscar) {
            System.out.println("Se ha encontrado el número en " +numeroDeIntentos + " intento(s)");
        }else if (numeroDeIntentos == maximoDeIntentos) {
            System.out.println( "No se ha encontrado el numero en " +numeroDeIntentos + " intento(s)");
        }
    }

    private static void numeroGenerado(int numeroAleatorio) {
        System.out.println("El numero generado es: " + numeroAleatorio);
    }

    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static void pedirMaximosIntentos() {
        System.out.print("Ingresar el numero maximo de intentos: ");
    }

    private static int leerNumero() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();

    }

    private static void pedirNumeroABuscar() {
        System.out.print("Ingresa un número entero entre 1 y 10: ");
    }
}
