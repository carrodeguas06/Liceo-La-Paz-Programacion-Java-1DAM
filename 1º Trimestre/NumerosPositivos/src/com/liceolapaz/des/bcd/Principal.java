package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Principal {
static int contador = 0;
    public static void main(String[] args)
    {

        System.out.println("Introduzca 10 numeros enteros positivos:");

        int [] numeros = new int[10];
        while (contador < 10)
        {
            int numero = leerNumero();
            if (numero < 0)
            {
                System.out.println("Los numeros deven ser positivos");
            }
            else if (numero > 0)
            {
                numeros[contador] = numero;
                contador++;
            }
        }

        System.out.print("Los numeros al reves son: ");
        
        contador = 9;
        while (contador >= 0)
        {
            System.out.print(numeros[contador] + " ");
            contador= contador -1;
        }

    }

    private static int leerNumero()
    {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }
}