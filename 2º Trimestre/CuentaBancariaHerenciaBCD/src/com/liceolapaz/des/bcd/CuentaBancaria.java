package com.liceolapaz.des.bcd;

import java.util.Scanner;

abstract public class CuentaBancaria
{
    public static double saldo;

    public static double dineroIntroducido;


    public static void ingresarDinero() {
        System.out.println("¿Cuanto dinero quieres ingresar?: ");

        dineroIntroducido = leerTeclado();

        if (dineroIntroducido <= 0)
        {
            System.out.println("No puedes ingresar dinero negativo");
        }
        else
        {
            saldo = saldo + dineroIntroducido;
            System.out.println("El nuevo saldo es: " + saldo);
        }
    }

    public static void retirarDinero() {
        System.out.println("¿Cuanto dinero quieres ingresar?: ");

        dineroIntroducido = leerTeclado();

        if (dineroIntroducido <= 0)
        {
            System.out.println("No puedes retirar dinero negativo");
        }
        else
        {
            saldo = saldo - dineroIntroducido;
            System.out.println("El nuevo saldo es: " + saldo);
        }
    }

    public static void consultarSaldo()
    {
        System.out.println("Su saldo es: " + saldo);
    }

    private static double leerTeclado() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }


}
