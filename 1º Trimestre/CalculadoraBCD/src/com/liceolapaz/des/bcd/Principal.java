package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {while (true)
    {
        //crear menu
        crearMenu();
        //crear el switch
        int numeroMenu = leerNumero();
        switch (numeroMenu)
        {
            case 1:
                System.out.println("""
                        Ha elegido la suma.
                        Escriba su primer operando: """);

                int primerOperandoSuma = leerNumero();

                System.out.println("Escriba el segundo operando: ");

                int segundoOperandoSuma = leerNumero();

                int resultadoSuma = primerOperandoSuma + segundoOperandoSuma;

                System.out.println("El resultado es " + resultadoSuma);
                break;


        case 2:
            System.out.println("""
                    Ha elegido la resta.
                    Escriba el primer operando: """);

            int primerOperandoResta = leerNumero();

            System.out.println("Escriba el segundo operando: ");

            int segundoOperandoResta = leerNumero();

            int resultadoResta = primerOperandoResta - segundoOperandoResta;

            System.out.println("El resultado es " + resultadoResta);
            break;


        case 3:
            System.out.println("""
                    Ha elegido el producto
                    Escriba el primer operando: """);

            int primerProducto = leerNumero();

            System.out.println("Escriba el segundo producto: ");

            int segundoProducto = leerNumero();

            int resultadoProducto = primerProducto * segundoProducto;

            System.out.println("El resultado es " + resultadoProducto);
            break;


        case 4:
            System.out.println("""
                    Ha elegido la división.
                    Escriba el primer operando: """);

            int primerDivisor = leerNumero();

            System.out.println("Escriba el segundo operando: ");

            int segundoDivisor = leerNumero();

            if (segundoDivisor == 0)
            {
                System.out.println("Esta operación no se puede realizar.");
                break;
            }
            else
            {
                double resultadoDivisor = (double) primerDivisor / segundoDivisor;

                System.out.println("El resultado es " + resultadoDivisor);
                break;
            }


            case 0:
                System.out.println("¡Hasta pronto!");
                System.exit(0);
                break;

            default:
                System.out.println("Esta opcion no es compatible");
                break;
        }
    }

    }

    {System.out.println("El resultado es no se puede mostrar.");

    }

    private static int leerNumero()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void crearMenu()
    {
        System.out.print("""
                CALCULADORA
                1. Suma
                2. Resta
                3. Producto
                4. División
                0. Salir
                Escoja una opción: """);
    }
}
