package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) {
        while (true)
        {
            //crear menu
            crearMenu();
            //Crear switch
            int numeroMenu = leerNumero();
            switch(numeroMenu)
            {
                case 1:
                    System.out.println("""
                            Ha elegido la opcion de Dólares
                            Escriba la cantidad de dinero: """);
                    double  cantidadDolar = leerNumero();
                    double dolaresEuros = 0.86;
                    double transformacion1 = cantidadDolar * dolaresEuros;
                    System.out.println("La cantidad en euros es: " + transformacion1);
                    break;

            case 2:
                System.out.println("""
                        Ha elegido la opcion de libras
                        Escriba la cantidad de dinero: """);
                double cantidadLibras = leerNumero();
                double librasEuros = 1.19 ;
                double transformacion2 = cantidadLibras * librasEuros;
                System.out.println("La cantidad en euros es: " + transformacion2);
                break;

            case 3:
                System.out.println("""
                        Ha elegido la opcion de Yens
                        Escriba la cantidad de dinero: """);
                double cantidadYens = leerNumero();
                double yensEuros = 0.0075;
                double transformacion3 = cantidadYens * yensEuros;
                System.out.println("La cantidad en euros es: " + transformacion3);
                break;

            case 0:
                System.out.println("¡Hasta pronto!");
                System.exit(0);
                break;

            default:
                System.out.println("Esta opcion no existe");
                break;
            }
        }
    }

    private static int leerNumero()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void crearMenu()
    {
        System.out.println("""
                CONVERSOR DE MONEDAS
                 1. Dólares
                 2. Libras
                 3. Yens
                 0. Salir
                Escoja una opción:""");
    }
}
