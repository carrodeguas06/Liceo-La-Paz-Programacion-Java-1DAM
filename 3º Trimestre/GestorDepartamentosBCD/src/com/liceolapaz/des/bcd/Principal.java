package com.liceolapaz.des.bcd;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal
{
    static HashMap <Integer, Departamento> departamentos = new HashMap<>();
    public static void main(String[] args) 
    {
        while (true)
        {
            crearMenu();

            int opcion;
            try {
                opcion = leerNumero();
            }catch (InputMismatchException e)
            {
                System.out.println("Ingresa un numero entero");
                continue;
            }
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingresa la direccion del archivo: ");
                    String ruta = leerTexto();
                    importarArchivo(ruta);
                    break;

                case 2:
                    insertarDepartamento();
                    break;

                case 3:
                    modificarDepartamento();
                    break;

                case 4:
                    eliminarDepartamento();
                    break;

                case 5:
                    System.out.println("Ingresa la direccion del archivo: ");
                    String ruta2 = leerTexto();
                    guardar(ruta2);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    private static void guardar(String ruta2)
    {
        File archivo = new File(ruta2);
        if (!archivo.isFile())
        {
            System.out.println("El archivo no existe");
            return;
        }
        try {
            FileWriter fw = new FileWriter(ruta2);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String texto = "num_depto;nombre;nombre_corto;planta;cif_director;correo_e\n";

            for (Departamento departamento : departamentos.values())
            {
                texto += departamento.toPrint() + "\n";
            }
            pw.write(texto);
            pw.close();
            bw.close();
        }
        catch (IOException e)
        {
            System.out.println("Error al guardar el archivo");
        }
    }

    private static void eliminarDepartamento() {
        System.out.println("Ingresa el numero del departamento: ");
        int numDepartamento;
        try {
            numDepartamento = leerNumero();
        }catch (InputMismatchException e)
        {
            System.out.println("Tiene que ser un numero entero");
            return;
        }
        if (!departamentos.containsKey(numDepartamento))
        {
            System.out.println("El departamento no existe");
            return;
        }
        departamentos.remove(numDepartamento);
    }

    private static void modificarDepartamento()
    {
        System.out.println("Ingresa el numero del departamento: ");
        int numDepartamento;
        try {
            numDepartamento = leerNumero();
        }catch (InputMismatchException e)
        {
            System.out.println("Tiene que ser un numero entero");
            return;
        }
        if (!departamentos.containsKey(numDepartamento))
        {
            System.out.println("El departamento no existe");
            return;
        }

        System.out.println("Ingresa el nombre del departamento: ");
        String nombre = leerTexto();

        System.out.println("Ingresa el nombre corto del departamento: ");
        String nombreCorto = leerTexto();

        System.out.println("Ingresa la planta del departamento: ");
        int planta;
        try {
            planta = leerNumero();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Tiene que ser un numero entero");
            return;
        }

        System.out.println("Ingrese el dni del jefe del departamento: ");
        String dniJefe = leerTexto();

        System.out.println("Ingresa el correo del departamento: ");
        String correo = leerTexto();

        Departamento departamento = new Departamento(numDepartamento, nombre, nombreCorto, planta, dniJefe, correo);
        departamentos.replace(numDepartamento, departamento);
    }

    private static void insertarDepartamento()
    {
        System.out.println("Ingresa el numero del departamento: ");
        int numDepartamento;
        try {
            numDepartamento = leerNumero();
        }catch (InputMismatchException e)
        {
            System.out.println("Tiene que ser un numero entero");
            return;
        }

        System.out.println("Ingresa el nombre del departamento: ");
        String nombre = leerTexto();

        System.out.println("Ingresa el nombre corto del departamento: ");
        String nombreCorto = leerTexto();

        System.out.println("Ingresa la planta del departamento: ");
        int planta;
        try {
            planta = leerNumero();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Tiene que ser un numero entero");
            return;
        }

        System.out.println("Ingrese el dni del jefe del departamento: ");
        String dniJefe = leerTexto();

        System.out.println("Ingresa el correo del departamento: ");
        String correo = leerTexto();


        Departamento departamento = new Departamento(numDepartamento, nombre, nombreCorto, planta, dniJefe, correo);
        departamentos.put(numDepartamento, departamento);
    }

    private static void importarArchivo(String ruta)
    {
        File archivo = new File(ruta);
        if (!archivo.isFile())
        {
            System.out.println("El archivo no existe");
            return;
        }
        try {
            Scanner escaner = new Scanner(archivo);
            escaner.nextLine();

            while (escaner.hasNextLine())
            {
                String[] partes = escaner.nextLine().split(";");
                int numDepartamento;
                try {
                    numDepartamento = Integer.parseInt(partes[0]);
                }catch (NumberFormatException e)
                {
                    System.out.println("Tiene que ser un numero entero");
                    return;
                }
                String nombre = partes[1];
                String nombreCorto = partes[2];
                int planta;
                try {
                    planta = Integer.parseInt(partes[3]);
                }catch (NumberFormatException e)
                {
                    System.out.println("Tiene que ser un numero entero");
                    return;
                }
                String dniJefe = partes[4];
                String correo = partes[5];

                Departamento departamento = new Departamento(numDepartamento, nombre, nombreCorto, planta, dniJefe, correo);
                departamentos.put(numDepartamento, departamento);
            }
        }catch (IOException e)
        {
            System.out.println("No se puede leer el archivo");
        }
    }

    private static String leerTexto() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int leerNumero() {
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }

    private static void crearMenu() {
        System.out.println("GESTOR DEPARTAMENTOS\n" +
                "1. Importar departamentos\n" +
                "2. Añadir departamento\n" +
                "3. Modificar departamento\n" +
                "4. Eliminar departamento\n" +
                "5. Exportar departamentos\n" +
                "0. Salir\n" +
                "Escoja una opción: ");
    }
}