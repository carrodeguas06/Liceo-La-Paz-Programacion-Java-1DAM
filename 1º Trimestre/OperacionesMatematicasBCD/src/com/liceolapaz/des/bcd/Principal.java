package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Principal
{
    private static double resultadoPotencia;
    public static void main(String[] args)
    {
        while (true)
        {
            crearMenu();
            int opcionMenu = leerTeclado();
            switch (opcionMenu)
            {
                case 1:
                    potencia();
                    break;

                case 2:
                    raiz();
                    break;

                case 3:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    private static void raiz()
    {
        System.out.println("""
                Ha elegido la raiz
                Ingrese la base de la raiz:""");
        double baseRaiz = leerTeclado();
        System.out.println("Ahora escriba la raiz:");
        double resultadoRaizCuadrada = Math.sqrt(baseRaiz);
        System.out.println("El resultado es " + resultadoRaizCuadrada);

    }
    private static void potencia()
    {

        System.out.println("""
                Ha elegido la potencia
                Ingrese la base de la potencia:""");
        System.out.println("Ingrese la base");
        double basePotencia = leerTeclado();

        System.out.println("Ahora ingrese el exponente");
        resultadoPotencia = Math.pow(basePotencia, basePotencia);
        System.out.println("El resultado es: " + resultadoPotencia);
    }

    private static int leerTeclado()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void crearMenu()
    {
        System.out.println("""
                POTENCIAS Y RAICES CUADRADAS
                1. Potencia
                2. Raíz cuadrada
                3. Salir
                Escoja una opción: """);
    }
}
