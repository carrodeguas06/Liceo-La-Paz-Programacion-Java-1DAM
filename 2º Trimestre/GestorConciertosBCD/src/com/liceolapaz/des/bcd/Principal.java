package com.liceolapaz.des.bcd;

import java.util.Objects;
import java.util.Scanner;

public class Principal
{
    static Asistentes[] listaAsistentes = new Asistentes[25000 + 1000];

    static Asistentes asistente;

    static int opcion;

    static int contadorAsiento = 1;
    static int contadorFilas = 1;

    static int precioGrada = 25;
    static int precioPiePista = 50;
    static int precioPiePistaBackstage = 100;

    static String nombre;
    static String apellidos;
    static String dni;
    static String email;
    static int diaFecha;
    static int mesFecha;
    static int anhoFecha;
    static Entradas entrada;

    static int tipoEntrada;

    static int codigo;
    static int precio;
    static int fila;
    static int asiento;
    static boolean pieDePista;
    static boolean backstage;

    static int cGrada;
    static int cPiePista;
    static int cBackstage;

    static int contador;

    public static void main(String[] args)
    {
        while (true)
        {
            crearMenu();

            opcion = leerNumero();

            switch(opcion)
            {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    menuTipoEntrada();

                    tipoEntrada = leerNumero();

                    if (tipoEntrada == 2)
                    {
                        backstage = false;
                        System.out.println("""
                                Acceso a backstage
                                1. Si
                                2. No""");

                        int subOpcion = leerNumero();

                        switch (subOpcion)
                        {
                            case 1:
                                backstage = true;
                                break;

                            case 2:
                                backstage = false;
                                break;

                            default:
                                error();
                        }
                    }
                    else if (tipoEntrada == 0)
                    {
                        break;
                    }
                    else
                    {
                        error();
                        break;
                    }

                    switch (tipoEntrada)
                    {
                        case 1:
                            System.out.println("El precio es " + precioGrada + "€");
                            break;

                        case 2:


                            if (backstage)
                            {
                                if (cBackstage == 100)
                                {
                                    System.out.println("No se pueden pedir mas entradas de backstage");
                                    break;
                                }
                                else
                                {
                                    System.out.println("El precio es " + precioPiePistaBackstage + "€");
                                    break;
                                }
                            }
                            else if (!backstage)
                            {
                                System.out.println("El precio es " + precioPiePista + "€");
                                break;
                            }

                    }
                    System.out.println("""
                            Confirmar compra
                            1. Si
                            2. No
                            POR DEFECTO SE CONFIRMARÁ LA COMPRA: """);

                    opcion = leerNumero();

                    if (opcion == 2)
                    {
                        break;
                    }

                    solicitarDatos();
                    break;


                case 2:
                    System.out.println("Escriba su email: ");

                    String mail = leerTexto();

                    int posicion = -1;

                    for (int i = 0; i < 26000; i++)
                    {
                        if (listaAsistentes[i] == null) {
                            continue;
                        }
                        if (mail.equals(listaAsistentes[i].getEmail()))
                        {
                            posicion = i;
                            System.out.println(posicion);
                            break;
                        }
                    }
                    if (posicion == -1)
                    {
                        System.out.println("No existe este email");
                    }
                    else
                    {
                        System.out.println(listaAsistentes[posicion].getNombre()+" " +listaAsistentes[posicion].getApellidos() + ", " + listaAsistentes[posicion].getDni() + ", " + listaAsistentes[posicion].getEmail()  +", " + listaAsistentes[posicion].crearFecha()) ;
                    }
                    break;

                case 3:
                    for ( contador= 0; contador < cGrada+cPiePista; contador++);
                    {
                        System.out.println(listaAsistentes[contador].getNombre()+" "+listaAsistentes[contador].getApellidos()+", "+listaAsistentes[contador].getDni()+", "+ listaAsistentes[contador].getEmail()+", "+listaAsistentes[contador].crearFecha()) ;
                    }
                    break;

                case 4:
                    System.out.println("Entradas grada: " + (listaAsistentes.length - 1000 - cGrada ));
                    System.out.println("Entradas pie de pista: " + (listaAsistentes.length - 25000 - cPiePista));
                    System.out.println("Entradas backstage: " + (100- cBackstage));
            }
        }
    }

    private static void solicitarDatos()
    {
        System.out.println("Escriba su nombre: ");
        nombre = leerTexto();

        System.out.println("Escriba su apellidos: ");
        apellidos = leerTexto();

        System.out.println("Escriba su dni: ");
        dni = leerTexto();

        System.out.println("Escriba su email: ");
        email = leerTexto();

        boolean correoRepetido = false;

        for (int contador = 0; contador < cGrada+cPiePista; contador++)
        {
            if (Objects.equals(listaAsistentes[contador].getEmail(), email))
            {
                correoRepetido = true;
            }
        }

        if (correoRepetido)
        {
            System.out.println("Este correo ya ha sido usado");
        }
        else
        {
            System.out.println("Escriba el dia de su fecha de nacimiento: ");
            diaFecha = leerNumero();

            System.out.println("Escriba el mes de fecha de nacimiento: ");
            mesFecha = leerNumero();

            System.out.println("Escriba el año de fecha de nacimiento: ");
            anhoFecha = leerNumero();

            if ((2025 - anhoFecha) <= 18)
            {
                System.out.println("Al ser menor no puedes comprar la entrada");
            }
            else
            {
                if (tipoEntrada==1)
                {
                    codigo = cGrada + cPiePista;
                    precio = precioGrada;
                    fila = contadorFilas;
                    asiento = contadorAsiento;
                    if (contadorAsiento == 1000)
                    {
                        contadorFilas ++;
                        contadorAsiento = 0;
                    }
                    pieDePista = false;
                    backstage = false;
                    contadorAsiento ++;

                    entrada = new Entradas(codigo, precio, fila, asiento, pieDePista, backstage);
                    cGrada++;
                }
                else if (tipoEntrada==2)
                {
                    if (backstage) {
                        codigo = cGrada + cPiePista;
                        precio = precioPiePistaBackstage;
                        fila = 0;
                        asiento = 0;
                        pieDePista = true;
                        backstage = true;

                        entrada = new Entradas(codigo, precio, fila, asiento, pieDePista, backstage);
                        cPiePista++;
                        cBackstage++;

                    } else {
                        codigo = cGrada + cPiePista;
                        precio = precioPiePista;
                        fila = 0;
                        asiento = 0;
                        pieDePista = true;
                        backstage = false;

                        entrada = new Entradas(codigo, precio, fila, asiento, pieDePista, backstage);
                        cPiePista++;
                    }
                }
            }

            asistente = new Asistentes(nombre, apellidos, dni, email, diaFecha, mesFecha, anhoFecha, entrada);

            listaAsistentes[cGrada+cPiePista] = asistente;

        }
    }

    private static String leerTexto() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void menuTipoEntrada() {
        System.out.println("""
                Elija su tipo de entrada
                1. Entrada en grada
                2. Entrada a pie de pista
                0. Salir
                Elija su tipo de entrada: """);
    }

    private static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void crearMenu() {
        System.out.println("""
                GESTOR CONCIERTOS
                1. Reservar entrada
                2. Mostrar entrada
                3. Lista entradas vendidas
                4. Mostrar número de entradas disponibles
                0. Salir
                Escoja una opción: """);
    }

    private static void error()
    {
        System.out.println("Opcion no valida");
    }
}
