package com.liceolapaz.des.bcd;


import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        System.out.println("""
                SELECCIONE UNA OPCIÓN
                1-INTRODUCIR FECHA
                0-SALIR""");
        int opcion = teclado();
        switch(opcion)
        {
            case 1:
                fecha();
                break;

            case 0:
                System.out.println("Hasta pronto:)");
                System.exit(0);

            default:
                System.out.println("Numero no valido");
        }
}

    private static void fecha() {
        System.out.println("Introduce un dia del mes: ");

        int dia = teclado();

        if (dia < 1) {
            System.out.println("Dia no valido");
        } else if (dia > 31) {
            System.out.println("Dia no valido");
        } else {
            String[] Meses = new String[13];
            System.out.println("Introduce un mes: ");

            int mes = teclado();

            if (mes < 1)
            {
                System.out.println("Este mes no existe");
            }
            else if (mes > 12)
            {
                System.out.println("Este mes no existe");
            }
            else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 9 || mes == 11)
            {
                Meses[0] = "No hay";
                Meses[1] = "Enero";
                Meses[2] = "Febrero";
                Meses[3] = "Marzo";
                Meses[4] = "Abril";
                Meses[5] = "Mayo";
                Meses[6] = "Junio";
                Meses[7] = "Julio";
                Meses[8] = "Agosto";
                Meses[9] = "Septiembre";
                Meses[10] = "Octubre";
                Meses[11] = "Noviembre";
                Meses[12] = "Diciembre";

                System.out.println("Introduce un año: ");

                int anho = teclado();

                if (anho != 0) {
                    System.out.println("La fecha de: " + dia + " de " + Meses[mes] + " del año " + anho + " es correcta");
                } else {
                    System.out.println("El año tiene que ser distinto a 0");
                }

            } else if (mes == 4 || mes == 6 || mes == 8 || mes == 10 || mes == 12) {
                Meses[0] = "No hay";
                Meses[1] = "Enero";
                Meses[2] = "Febrero";
                Meses[3] = "Marzo";
                Meses[4] = "Abril";
                Meses[5] = "Mayo";
                Meses[6] = "Junio";
                Meses[7] = "Julio";
                Meses[8] = "Agosto";
                Meses[9] = "Septiembre";
                Meses[10] = "Octubre";
                Meses[11] = "Noviembre";
                Meses[12] = "Diciembre";

                if (dia == 31) {
                    System.out.println(Meses[mes] + " no tiene 31 dias");
                } else {
                    System.out.println("Introduce un año: ");

                    int anho = teclado();

                    if (anho != 0) {
                        System.out.println("La fecha de: " + dia + " de " + Meses[mes] + " del año " + anho + " es correcta");
                    } else {
                        System.out.println("El año tiene que ser distinto a 0");
                    }
                }
            } else if (mes == 2) {
                Meses[0] = "No hay";
                Meses[1] = "Enero";
                Meses[2] = "Febrero";
                Meses[3] = "Marzo";
                Meses[4] = "Abril";
                Meses[5] = "Mayo";
                Meses[6] = "Junio";
                Meses[7] = "Julio";
                Meses[8] = "Agosto";
                Meses[9] = "Septiembre";
                Meses[10] = "Octubre";
                Meses[11] = "Noviembre";
                Meses[12] = "Diciembre";

                if (dia > 29) {
                    System.out.println(Meses[mes] + "no puede tener más de 29 dias");
                } else {
                    System.out.println("Introduce un año: ");

                    int anho = teclado();

                    if (anho != 0) {
                        if (dia == 29) {
                            if (anho % 4 == 0 && anho % 100 != 0 || anho % 400 == 0) {
                                System.out.println("La fecha de: " + dia + " de " + Meses[mes] + " del año " + anho + " es correcta");
                            } else {
                                System.out.println("Este año no es bisiesto");
                            }
                        } else {
                            System.out.println("La fecha de: " + dia + " de " + Meses[mes] + " del año " + anho + " es correcta");
                        }
                    } else {
                        System.out.println("El año tiene que ser distinto a 0");
                    }
                }
            }
        }
    }

    private static int teclado()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}