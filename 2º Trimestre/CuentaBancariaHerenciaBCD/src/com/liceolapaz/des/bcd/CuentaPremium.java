package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class CuentaPremium extends CuentaBancaria{
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
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
