package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        while (true)
        {
        //crear menu
        crearMenu();
        //crear el switch
        int seleccionarMenu = leerNumero();
        switch (seleccionarMenu)
        {
            case 1:
                triangulo();
                break;

            case 2:
                rectangulo();
                break;

            case 3:
                cuadrado();
                break;

            case 4:
                pentagono();
                break;

            case 0:
                System.out.println("Hasta pronto");
                System.exit(0);
                break;

            default:
                System.out.println("Opcion no valida");

        }
        }

    }

    private static void pentagono()
    {
        System.out.println("""
                Ha elegido el pentagono
                Escriba el lado del pentagono: """);

        double ladoPentagono = leerNumero();

        System.out.println("Escriba el apotema: ");

        double apotemaPentagono = leerNumero();

        double perimetroPentagono = 5 * ladoPentagono;

        double areaPemtagono = (perimetroPentagono * apotemaPentagono)/2;

        System.out.println("El area del pentagono es: "  + areaPemtagono);
        System.out.println("El perimetro del pentagono es: "  + perimetroPentagono);



    }

    private static void cuadrado()
    {
        System.out.println("""
                Ha elegido el cuadrado
                Escriba el lado de el cuadrado""");

        double ladoCuadrado = leerNumero();

        double areaCuadrado = ladoCuadrado * ladoCuadrado;
        double perimetroCuadrado = 4 * ladoCuadrado;

        System.out.println("El area del cuadrado es: "+ areaCuadrado);
        System.out.println("El perimetro de cuadrado es: "+ perimetroCuadrado);
    }

    private static void rectangulo()
    {
        System.out.println("""
                Ha elegido el rectangulo
                Escriba el valor del primer lado (base) del rectangulo: """);

        double baseRectangulo = leerNumero();

        System.out.println("Escriba el valor de la altura");

        double alturaRectangulo = leerNumero();

        double areaRectangulo = baseRectangulo * alturaRectangulo;
        double perimetroRectangulo = baseRectangulo*2 + alturaRectangulo*2;
        System.out.println("El area del rectangulo es: " + areaRectangulo);
        System.out.println("El perimetro es: " + perimetroRectangulo);
    }

    private static void triangulo()
    {
        System.out.println("""
                Ha elegido el triangulo
                Escriba el valor del primer lado (base) del triángulo: """);

        double baseTriangulo = leerNumero();

        System.out.print("Escriba el valor de la altura: ");

        double alturaTriangulo = leerNumero();


        double areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
        double perimetroTriangulo = baseTriangulo * 3 ;

        System.out.println("El area de tu triangulo es: " + areaTriangulo);
        System.out.println("El perimetro de tu triangulo es: " + perimetroTriangulo);
    }

    private static int leerNumero()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void crearMenu()
    {
        System.out.println("""
                FIGURAS GEOMÉTRICAS
                1. Triángulo
                2. Rectángulo
                3. Cuadrado
                4. Pentágono
                0. Salir
                Escoja una opción:""");
    }
}
