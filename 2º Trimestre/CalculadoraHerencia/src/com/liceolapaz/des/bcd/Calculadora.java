package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {
        while (true)
        {
            crearMenu();
            int opcionMenu = leerNumero();
            if (opcionMenu == 0)
            {
                System.exit(0);
                break;
            }
            if (opcionMenu >= 1 && opcionMenu <= 4)
            {
                crearSubmenu();
                Numero operando1 = null;
                Numero operando2 = null;
                Numero resultado = null;
                int opcionSubmenu = leerNumero();
                switch (opcionSubmenu)
                {
                    case 1:
                        pedirValor1();
                        int valor1 = leerNumero();
                        pedirValor2();
                        int valor2 = leerNumero();

                        operando1 = new Entero(valor1);
                        operando2 = new Entero(valor2);
                        resultado = realizarOperacion(opcionMenu, operando1, operando2);

                        if (resultado != null)
                        {
                            System.out.println("El resultado es: " + resultado.mostrar());
                        }
                        else
                        {
                            System.out.println("Error al calcular el resultado");
                        }
                        break;

                    case 2:

                        System.out.print("Escribe el  numerador del primer racional: ");
                        int a = leerNumero();
                        System.out.print("Escribe el denominador del segundo racional: ");
                        int b = leerNumero();
                        if (b == 0){
                            System.out.print("Numero no valido");
                        }
                        else
                        {
                            System.out.print("Escribe el numerador del segundo racional: ");
                            int c = leerNumero();
                            System.out.print("Escribe el denominador del segundo racional: ");
                            int d = leerNumero();

                            if (d == 0)
                            {
                                System.out.print("Numero no valido");
                            }
                            else
                            {
                                operando1 = new Racional(a,b);
                                operando2 = new Racional(c,d);
                                resultado = realizarOperacion(opcionMenu, operando1, operando2);

                                if (resultado != null)
                                {
                                    System.out.println("El resultado es: " + resultado.mostrar());
                                }
                                else
                                {
                                    System.out.println("Error al calcular el resultado");
                                }
                                break;
                            }

                        }


                    case 3:

                        System.out.print("Escriba la parte real del primer operando: ");
                        int real1 = leerNumero();
                        System.out.print("Escriba la parte imaginaria del primer operando: ");
                        int imag1 = leerNumero();
                        System.out.print("Escriba la parte real del segundo operando: ");
                        int real2 = leerNumero();
                        System.out.print("Escriba la parte imaginaria del segundo operando: ");
                        int imag2 = leerNumero();

                        operando1 = new Complejo(real1, imag1);
                        operando2 = new Complejo(real2, imag2);
                        resultado = realizarOperacion(opcionMenu, operando1, operando2);

                        if (resultado != null)
                        {
                            System.out.println("El resultado es: " + resultado.mostrar());
                        }
                        else
                        {
                            System.out.println("Error al calcular el resultado");
                        }
                        break;

                    case 0:
                        break;
                }
            }
            else
            {
                System.out.println("Opción no válida");
            }
        }
    }


    private static Numero realizarOperacion(int opcionMenu,Numero operando1, Numero operando2) {
        switch (opcionMenu)
        {
            case 1:
                return operando1.sumar(operando2);

            case 2:
                return operando1.restar(operando2);

            case 3:
                return operando1.multiplicar(operando2);

            case 4:
                return operando1.dividir(operando2);

            default:
                return null;
        }
    }

    private static void pedirValor2() {
        System.out.print("Escriba el valor del segundo operando: ");
    }

    private static void pedirValor1() {
        System.out.print("Escriba el valor del primer operando: ");
    }

    private static void crearSubmenu() {
        System.out.println("""
                Tipo de números
                1. Números enteros
                2. Números racionales
                3. Números complejos
                0. Cancelar
                Escoja una opción: """);
    }

    private static int leerNumero() {
        Scanner numero = new Scanner(System.in);
        return numero.nextInt();
    }

    private static void crearMenu() {
        System.out.println("""
                CALCULADORA
                1. Suma
                2. Resta
                3. Producto
                4. División
                0. Salir
                Escoja una opción:""");
    }
}
