package com.liceolapaz.des.bcd;

import java.util.Scanner;

public class Principal
{
    static Socio[] listaSocios = new Socio[1000];
    static Libro[] listaLibros = new Libro[5000];

    static boolean tf;

    static int localizacionLibro;
    static int localizacionSocio;

    static int contador;
    static int contadorSocios = 0;
    static int contadorLibros = 0;

    static String isbn;
    static String titulo;
    static String genero;
    static int numPaginas;
    static boolean cogido;

    static Socio socio;
    static Libro libro;
    static int numero;
    static String nombre;
    static String apellido1;
    static String apellido2;
    static String dni;
    static String email;
    static String fechaNacimiento;
    static int numSocio;
    static int contadorLibrosSocio;
    static Libro[] listaLibrosSocio = new Libro[5];


    public static void main(String[] args)
    {
        while (true)
        {
            crearMenu();

            int opcion = leerNumero();

            switch(opcion)
            {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    if (contadorSocios == 999)
                    {
                        System.out.println("¡No se pueden almacenar más socios!");
                    }
                    else
                    {
                        System.out.println("Escriba su nombre: ");
                        nombre = leerTexto();

                        System.out.println("Escriba su apellido1: ");
                        apellido1 = leerTexto();

                        System.out.println("Escriba su apellido2: ");
                        apellido2 = leerTexto();

                        System.out.println("Escriba su dni: ");
                        dni = leerTexto();

                        System.out.println("Escriba su Email: ");
                        email = leerTexto();

                        System.out.println("Escriba su fecha de nacimiento siguiendo el siguiente estilo(01/01/2000): ");
                        fechaNacimiento = leerTexto();

                        System.out.println("Su numero de socio es: " + contadorSocios);

                        numSocio = contadorSocios;

                        contadorLibrosSocio = 0;

                        listaSocios[contadorSocios] = new Socio(nombre, apellido1, apellido2, dni, email, fechaNacimiento, numSocio, contadorLibrosSocio);

                        contadorSocios++;
                    }
                    break;


                case 2:
                    if (contadorLibros == 4999)
                    {
                        System.out.println("¡No se pueden almacenar más libros!");
                    }
                    else
                    {
                        System.out.println("Escriba el ISBN: ");
                        isbn = leerTexto();

                        System.out.println("Escriba el titulo: ");
                        titulo = leerTexto();

                        System.out.println("Escriba el genero: ");
                        genero = leerTexto();

                        System.out.println("Escriba el número de páginas del libro: ");
                        numPaginas = leerNumero();

                        cogido = false;

                        listaLibros[contadorLibros] =  new Libro(isbn, titulo, genero, numPaginas, cogido);

                        contadorLibros++;
                    }
                    break;

                case 3:

                    System.out.println("Escriba su número de socio: ");
                    numero = leerNumero();

                    for (int i = 0; i < contadorSocios; i++)
                    {
                        if (numero == listaSocios[i].numSocio)
                        {
                            socio = listaSocios[i];
                        }
                    }

                    if (socio == null)
                    {
                        System.out.println("No se encontro el socio");
                    }
                    else
                    {
                        System.out.println("Escriba el ISBN: ");

                        isbn = leerTexto();

                        libro = null;

                        for (contador = 0; contador < contadorLibros; contador++)
                        {
                            if (isbn.equals(listaLibros[contador].isbn))
                            {
                                libro = listaLibros[contador];
                                localizacionLibro = contador;
                            }
                        }
                        if (libro == null)
                        {
                            System.out.println("No existe ese libro");
                        }
                        else if (libro.cogido == true)
                        {
                            System.out.println("Este libro ya esta cogido");
                        }
                        else
                        {
                            libro.setCogido(true);
                            socio.anhadirLibro(libro);
                        }
                    }
                    break;


                case 4:
                    tf = false;

                    System.out.println("Escriba su número de socio: ");
                    numero= leerNumero();

                    for (contador = 0; contador < contadorSocios; contador++)
                    {
                        if (numero ==listaSocios[contador].numSocio)
                        {
                            socio = listaSocios[contador];
                            localizacionSocio = contador;
                        }
                    }

                    if (socio == null)
                    {
                        System.out.println("No se encontro el socio");
                    }
                    else if (socio.contadorLibros == 0)
                    {
                        System.out.println("Este socio no posee libros actualmente");
                    }
                    else
                    {
                        System.out.println("Escriba el ISBN: ");
                        isbn = leerTexto();

                        libro = null;

                        for (contador = 0; contador < contadorLibros; contador++)
                        {
                            if (isbn.equals(listaLibros[contador].isbn))
                            {
                                libro = listaLibros[contador];
                                localizacionLibro = contador;
                            }
                        }

                        if (libro == null)
                        {
                            System.out.println("No existe ese libro");
                        }

                        else
                        {
                            for (contador = 0; contador < listaSocios[localizacionSocio].contadorLibros; contador++)
                            {
                                if (listaSocios[localizacionSocio].listaLibrosSocio[contador] == libro)
                                {
                                    tf = true;
                                    localizacionLibro = contador;
                                }
                            }

                            if (tf == false)
                            {
                                System.out.println("El libro no lo posee este socio");
                            }

                            else
                            {
                                libro.setCogido(false);

                                libro = null;

                                socio.retirarLibro(libro, localizacionLibro);

                            }
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < contadorLibros; i++)
                    {
                        if (listaLibros[i].cogido == false)
                        {
                            System.out.println("ISBN: " +listaLibros[i].isbn +", "+"Titulo: " + listaLibros[i].titulo +", "+"Género: " +listaLibros[i].genero+", "+ "Número de paginas: "+listaLibros[i].numPaginas);
                        }
                    }
                    break;

                case 6:
                    for (int i = 0; i < contadorLibros; i++)
                    {
                        if (listaLibros[i].cogido == true)
                        {
                            System.out.println("ISBN: " +listaLibros[i].isbn +", "+"Titulo: " + listaLibros[i].titulo +", "+"Género: " +listaLibros[i].genero+", "+ "Número de paginas: "+listaLibros[i].numPaginas);
                        }
                    }
                    break;

                case 7:
                    System.out.println("Introduzca su numero de socio: ");

                    numero = leerNumero();

                    if (numero <= 0 || numero > contadorSocios)
                    {
                        for (contador = 0; contador < listaSocios[numero].contadorLibros; contador++)
                        {
                            System.out.println(listaSocios[numero].listaLibrosSocio[contador].isbn +", "+ listaSocios[numero].listaLibrosSocio[contador].titulo +", "+ listaSocios[numero].listaLibrosSocio[contador].genero +", "+ listaSocios[numero].listaLibrosSocio[contador].numPaginas);
                        }
                    }
                    else
                    {
                        System.out.println("No existe ese socio");
                    }
                    break;

                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        }
    }

    private static String leerTexto() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void crearMenu() {
        System.out.println("""
                GESTOR BIBLIOTECA
                1. Crear socio
                2. Crear libro
                3. Llevarse libro
                4. Devolver libro
                5. Mostrar libros disponibles
                6. Mostrar libros no disponibles
                7. Mostrar libros de un socio
                0. Salir
                Escoja una opción:""");
    }

}
