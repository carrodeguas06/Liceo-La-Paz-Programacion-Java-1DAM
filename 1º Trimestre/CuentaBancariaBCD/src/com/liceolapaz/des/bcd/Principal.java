package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Principal
{
    private static double saldoCuenta = 0;
    private static double saldoCuentaPremium = 0;
    public static void main(String[] args)
    {

        while (true)
        {
            //crearMenu
            crearMenu();
            //crear switch
            int numeroMenu = leerNumero();

            switch(numeroMenu) {

                case 1:
                    //Crear switch
                    crearSubmenu();
                    break;


                case 2:
                    ingresarDinero();
                    break;

                case 3:
                    retirarDinero();
                    break;

                case 4:
                    consultaSaldo();
                    break;

                case 0:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }


    }

    private static void consultaSaldo()
    {if (saldoCuenta == 0)
    {
        System.out.println("Su saldo es de " + saldoCuentaPremium + "€");
    }
    else if (saldoCuentaPremium == 0)
    {
        System.out.println("Su saldo es de " + saldoCuenta + "€");
    }
    }

    private static void retirarDinero()
    {System.out.println("¿Cuanto dinero desea retirar?: ");
        double dineroRetirado = leerNumero();
        if (saldoCuenta == 0)
        {
            saldoCuentaPremium = saldoCuentaPremium - dineroRetirado;
            System.out.println("Su nuevo saldo es de " + saldoCuentaPremium + "€");
        }
        else if (saldoCuentaPremium == 0)
        {
            saldoCuenta = saldoCuenta - dineroRetirado;
            System.out.println("Su nuevo saldo es de " + saldoCuenta + "€");
        }
    }

    private static void ingresarDinero()
    {
        System.out.println("¿Cuanto dinero desea ingresar?: ");
        double dineroIngresado = leerNumero();
        if (saldoCuenta == 0)
        {
            saldoCuentaPremium = saldoCuentaPremium + dineroIngresado;
            System.out.println("Su nuevo saldo es de " + saldoCuentaPremium + "€");
        } else if (saldoCuentaPremium == 0)
        {
            saldoCuenta = saldoCuenta + dineroIngresado;
            System.out.println("Su nuevo saldo es de " + saldoCuenta + "€");
        }
        ;
    }

    private static void crearSubmenu( )
    {
        System.out.println("""
                Tipo de cuenta
                 1. Cuenta normal
                 2. Cuenta Premium
                 0. Cancelar
                Escoja una opción: """);

        int submenu = leerNumero();
        switch(submenu)
        {
            case 1:
                System.out.println("Ha elegido cuenta normal");
                System.out.print("Escriba el saldo inicial: ");
                saldoCuenta = leerNumero();

                if (saldoCuenta<0)
                {
                    System.out.println("El saldo inicial no puede ser negativo");
                    break;
                }

                else
                {
                    System.out.println("Si ya tiene una cuenta premium se ha eliminado");
                    System.out.println("Su saldo es de: " + saldoCuenta + "€");
                    saldoCuentaPremium = 0;
                    break;
                }

            case 2:
                System.out.println("Ha elegido cuenta premium");
                System.out.print("Escriba el saldo inicial: ");
                saldoCuentaPremium = leerNumero();
                System.out.println("Si ya tiene una cuenta normal se ha eliminado");
                System.out.println("Su saldo es de: " + saldoCuentaPremium + "€");
                saldoCuenta = 0;
                break;

            case 0:
                break;

            default:
                System.out.println("Opcion no valida");
                break;

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
                BANCO
                 1. Crear cuenta
                 2. Ingresar dinero
                 3. Retirar dinero
                 4. Consultar saldo
                 0. Salir
                Escoja una opción: """);
    }
}
