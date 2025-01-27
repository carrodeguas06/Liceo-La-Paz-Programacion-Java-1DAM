package com.liceolapaz.dam.bcd;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir numeros al usuario
        pedirNumeros();
        // Crear variable a gusrdar numeros
        int [] numeros = new int[10];
        // Crear variable para contar numeros
        int contador = 0;
        // Mientras que el contador no nsea 10
        do{
            //leer el numero y gusrdarlo
           numeros[contador] = leerNumero();
            // incrementar el contador
            contador++;
        }while(contador < 10);
        // Sumar numeros y guardar resultados
       int resultado = sumarNumeros(numeros);
        // Mostrar el resultado
        System.out.println("La suma de los numeros introducidos es: " + resultado);
    }

    private static int sumarNumeros(int[] numeros) {
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        return resultado;
    }


    private static int leerNumero() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }

    private static void pedirNumeros() {
        System.out.println("Introduzca 10 numeros enteros:");
    }
}
