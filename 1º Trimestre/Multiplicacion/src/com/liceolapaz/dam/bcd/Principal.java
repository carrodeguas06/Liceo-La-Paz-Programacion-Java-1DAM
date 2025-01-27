package com.liceolapaz.dam.bcd;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Prguntar los numeros
        pedirNumeros();
        // Crear almacenaminto numeros
        int[] numeros = new int[10];
        int contador = 0;
        // Leer numeros
        do {
            // Crear contador
            numeros[contador] = leerNumeros();
            contador++;
            // Almacenar numeros contador
        }while (contador < 10);
        // Sumar numeros
    int sumaTotal = calcularSuma(numeros);

        // Imprimir resultado
        System.out.print("El resultado es: " + sumaTotal);

    }

    private static int calcularSuma(int[] numeros)
    {int total = 0;
        for (int i = 0; i < numeros.length; i++)
        {total = total + numeros[i];
        }
        return total;
    }

    private static int leerNumeros() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeros() {
        System.out.println("Ingrese 10 los numeros para el sumatorio: ");
    }
}
