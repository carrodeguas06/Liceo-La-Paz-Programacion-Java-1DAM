package com.liceolapaz.www.bcd;

import java.util.Scanner;

public class Principal {
    private static final int ANHO_ACTUAL = 2024 ;
    // preguntar edad
    public static void main(String[] args) {
        pedirAnho();

        int anho = leerAnho();
        escribirMensaje(anho);}



    private static void pedirAnho() {
        System.out.print("Introduce tu año de nacimiento: ");
    }



    private static void escribirMensaje(int anho) {
        String mensaje = "";
        if (anho > ANHO_ACTUAL) {
            mensaje = "No puedes nacer en el futuro";}

        else if (ANHO_ACTUAL - anho > 150) {
            mensaje = "Deverias estar muerto";
        }

        else if (ANHO_ACTUAL - anho >= 18) {
            mensaje = "Puedes pasar";
        }

        else if (ANHO_ACTUAL - anho < 18) {
            mensaje = "No puedes pasar";
        }
        System.out.println(mensaje);
    }

    private static int leerAnho() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }
}