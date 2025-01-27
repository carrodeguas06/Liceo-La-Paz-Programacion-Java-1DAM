package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Principal
{
        public static void main(String[] args)
    {
        while (true)
        {
            crearMenu();
            double area;
            double perimetro;

            int opcion = leerNumero();

            switch (opcion)
            {
                case 1:
                    Triangulo triangulo = pedirDatosTriangulo();

                    area = triangulo.calcularArea();

                    perimetro = triangulo.calcularPerimetro();

                    System.out.println("El area es de: " + area);
                    System.out.println("El perimetro es de: " + perimetro);
                    break;

                case 2:
                    Rectangulo rectangulo = pedirDatosRectangulo();

                    area = rectangulo.calcularArea();

                    perimetro = rectangulo.calcularPerimetro();

                    System.out.println("El area es de: " + area);
                    System.out.println("El perimetro es de: " + perimetro);
                    break;

                case 3:
                    Cuadrado cuadrado = pedirDatosCuadrado();

                    area = cuadrado.calcularArea();

                    perimetro = cuadrado.calcularPerimetro();

                    System.out.println("El area es de: " + area);
                    System.out.println("El perimetro es de: " + perimetro);
                    break;

                case 4:
                    Pentagono pentagono = pedirDatosPentagono();

                    area = pentagono.calcularArea();

                    perimetro = pentagono.calcularPerimetro();

                    System.out.println("El area es de: " + area);
                    System.out.println("El perimetro es de: " + perimetro);
                    break;


                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    private static Pentagono pedirDatosPentagono() {
        System.out.print("Ingrese la longitud del lado: ");
        double lado  = leerLado();

        System.out.println("Ingrese la longitud del apotema: ");
        double apotema  = leerLado();

        Pentagono pentagono = new Pentagono(lado, apotema);
        return pentagono;
    }

    private static Cuadrado pedirDatosCuadrado() {
        System.out.println("Ingrese la longitud del lado: ");
        double lado = leerNumero();
        double base = lado;

        Cuadrado cuadrado = new Cuadrado(lado, base);
        return cuadrado;
    }

    private static Rectangulo pedirDatosRectangulo() {
        System.out.print("Ingrese la longitud del lado: ");
        double lado  = leerLado();

        System.out.println("Ingrese la longitud de la base: ");
        double base  = leerLado();

        Rectangulo rectangulo = new Rectangulo(lado, base);
        return rectangulo;
    }

    private static Triangulo pedirDatosTriangulo() {

        System.out.print("Ingrese la longitud del lado 1: ");
        double lado1  = leerLado();

        System.out.print("Ingrese la longitud del lado 2: ");
        double lado2  = leerLado();

        System.out.print("Ingrese la longitud de la base: ");
        double lado3  = leerLado();

        System.out.print("Ingrese la altura: ");
        double altura  = leerLado();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3, altura);
        return triangulo;
    }

    private static double leerLado() {
        Scanner leer = new Scanner(System.in);
        return leer.nextDouble();
    }

    private static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void crearMenu() {
        System.out.println("""
                FIGURAS GEOMÉTRICAS
                1. Triángulo
                2. Rectángulo
                3. Cuadrado
                4. Pentágono
                0. Salir
                Escoja una opción: """);
    }
}
