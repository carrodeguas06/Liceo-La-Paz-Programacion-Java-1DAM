package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args)
    {
        int tipoCuenta = 0;
        while (true)
        {
            crearMenu();


            int opcionMenu = leerMenu();

            switch(opcionMenu)
            {
                case 1:
                    System.out.println("""
                            Tipo de cuenta
                             1. Cuenta normal
                             2. Cuenta Premium
                             0. Cancelar
                            Escoja una opción:""");

                    tipoCuenta = leerMenu();

                    if (tipoCuenta == 0)
                    {
                        break;
                    }
                    else if (tipoCuenta == 1 )
                    {
                        System.out.println("Ha creado una cuenta normal");
                        CuentaPremium.saldo = 0;
                        break;
                    }
                    else if (tipoCuenta == 2 )
                    {
                        System.out.println("Ha creado una cuenta Premium");
                        CuentaNormal.saldo = 0;
                        break;
                    }
                    else if (tipoCuenta == 3 )
                    {
                        System.out.println("Opcion no valida");
                        break;
                    }

                case 2:
                    if (tipoCuenta == 0)
                    {
                        System.out.println("No existe ninguna cuenta");
                        break;
                    }
                    else if (tipoCuenta == 1 )
                    {
                        CuentaNormal.ingresarDinero();
                        break;
                    }
                    else if (tipoCuenta == 2 )
                    {
                        CuentaPremium.ingresarDinero();
                        break;
                    }

                case 3:
                    if (tipoCuenta == 0)
                    {
                        System.out.println("No existe ninguna cuenta");
                        break;
                    }
                    else if (tipoCuenta == 1 )
                    {
                        CuentaNormal.retirarDinero();
                        break;
                    }
                    else if (tipoCuenta == 2 )
                    {
                        CuentaPremium.retirarDinero();
                        break;
                    }


                case 4:
                    if (tipoCuenta == 0)
                    {
                        System.out.println("No existe ninguna cuenta");
                        break;
                    }
                    else if (tipoCuenta == 1 )
                    {
                        CuentaNormal.consultarSaldo();
                        break;
                    }
                    else if (tipoCuenta == 2 )
                    {
                        CuentaPremium.consultarSaldo();
                        break;
                    }

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    private static int leerMenu() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    private static void crearMenu() {
        System.out.println("""
                BANCO
                 1. Crear cuenta
                 2. Ingresar dinero
                 3. Retirar dinero
                 4. Consultar saldo
                 0. Salir
                Escoja una opción:""");
    }

}
