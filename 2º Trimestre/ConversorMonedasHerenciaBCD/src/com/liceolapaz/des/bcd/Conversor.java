package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        while (true)
        {
            crearMenu();
            int opcion = leernumero();

            if (opcion >= 1 && opcion <= 3)
            {

                pedirEuros();
                double euros = leerEuros();
                Moneda cantidad = null;
                double resultado = 0;
                switch(opcion)
                {
                    case 1:
                        cantidad = new Dolares(euros);
                        resultado = crearRespuesta(cantidad);
                        System.out.println("Tienes "+ resultado + " dolares");
                        break;


                    case 2:
                        cantidad = new Libras(euros);
                        resultado = crearRespuesta(cantidad);
                        System.out.println("Tienes "+ resultado + " libras");
                        break;


                    case 3:
                        cantidad = new Yenes(euros);
                        resultado = crearRespuesta(cantidad);
                        System.out.println("Tienes "+ resultado + " yenes");
                        break;


                    default:
                        System.out.println("Opcion no valida");
                }


            }
            else if (opcion == 0)
            {
                 System.out.println("Hasta pronto");
                 System.exit(0);
                 break;
            }
            else
            {
                System.out.println("Opcion no valida");
            }

        }
    }

    private static double crearRespuesta(Moneda cambio) {
        return cambio.cantidadEnEuros();
    }

    private static double leerEuros() {
        Scanner euros = new Scanner(System.in);
        return euros.nextDouble();
    }

    private static void pedirEuros() {
        System.out.print("Escriba la cantidad de euros: ");
    }

    private static int leernumero() {
        Scanner menu = new Scanner(System.in);
        return menu.nextInt();
    }

    private static void crearMenu() {
        System.out.println("""
                CONVERSOR DE MONEDAS
                1. Dólares
                2. Libras
                3. Yens
                0. Salir
                Escoja una opción:""");
    }
}
