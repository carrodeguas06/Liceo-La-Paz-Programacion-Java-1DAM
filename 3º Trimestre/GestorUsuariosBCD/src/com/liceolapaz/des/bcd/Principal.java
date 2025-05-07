package com.liceolapaz.des.bcd;


import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal
{
    static HashMap <Integer, Usuario> usuarios = new HashMap();
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
                System.out.println("Ingrese un número entero");
                continue;
            }

            switch(opcion)
            {

                case 0:
                    System.exit(0);
                    break;

                case 1:
                    importarUsuarios();
                    break;

                case 2:
                    anhadirUsuario();
                    break;

                case 3:
                    modificarUsuario();
                    break;

                case 4:
                    eliminarUsuario();
                    break;

                case 5:
                    exportarUsuarios();
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    private static void exportarUsuarios()
    {
        System.out.println("Ingrese la ruta del archivo: ");
        String ruta = leerTexto();
        File archivo = new File(ruta);

        if (!archivo.isFile())
        {
            System.out.println("Este archivo no existe");
        }

        try {
            FileWriter fw = new FileWriter(ruta);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.print("[");
            for (Usuario usuario : usuarios.values())
            {
                pw.print(usuario.toString() + "\n");
            }
            pw.print("]");
            pw.close();
            bw.close();
            fw.close();

        }catch (IOException e)
        {
            System.out.println("Error al escribir el archivo");
        }
    }

    private static void eliminarUsuario()
    {
        System.out.println("Ingresar el id del usuario: ");
        int id;
        try {
            id = leerNumero();
        }catch (InputMismatchException e)
        {
            System.out.println("Ingrese un numero entero");
            return;
        }
        if (!usuarios.containsKey(id))
        {
            System.out.println("El usuario no existe");
            return;
        }
        usuarios.remove(id);
    }

    private static void modificarUsuario()
    {
        System.out.println("Ingresar el id del usuario: ");
        int id;
        try {
            id = leerNumero();
        }catch (InputMismatchException e)
        {
            System.out.println("Ingrese un numero entero");
            return;
        }
        if (!usuarios.containsKey(id))
        {
            System.out.println("El usuario no existe");
            return;
        }
        System.out.println("Ingrese el email del usuario: ");
        String email = leerTexto();
        System.out.println("Ingrese el nombre del usuario: ");
        String firstName = leerTexto();
        System.out.println("Ingrese el apellido del usuario: ");
        String lastName = leerTexto();
        System.out.println("Ingrese el avatar del usuario: ");
        String avatar = leerTexto();

        Usuario usuario = new Usuario(id, email, firstName, lastName, avatar);
        usuarios.replace(id, usuario);
    }

    private static void anhadirUsuario()
    {
        System.out.println("Ingresar el id del usuario: ");
        int id;
        try {
            id = leerNumero();
        }catch (InputMismatchException e)
        {
            System.out.println("Ingrese un numero entero");
            return;
        }
        if (usuarios.containsKey(id))
        {
            System.out.println("El usuario ya existe");
            return;
        }
        System.out.println("Ingrese el email del usuario: ");
        String email = leerTexto();
        System.out.println("Ingrese el nombre del usuario: ");
        String firstName = leerTexto();
        System.out.println("Ingrese el apellido del usuario: ");
        String lastName = leerTexto();
        System.out.println("Ingrese el avatar del usuario: ");
        String avatar = leerTexto();

        Usuario usuario = new Usuario(id, email, firstName, lastName, avatar);
        usuarios.put(id, usuario);
    }

    private static void importarUsuarios()
    {
        System.out.println("Ingrese la ruta del archivo: ");
        String ruta = leerTexto();
        File archivo = new File(ruta);

        if (!archivo.isFile())
        {
            System.out.println("Este archivo no existe");
        }

        try {
            Scanner sc = new Scanner(archivo);
            sc.nextLine();
            sc.nextLine();
            while (sc.hasNextLine())
            {


                String idTexto = sc.nextLine();
                idTexto = idTexto.substring(10, idTexto.length()-1);
                int id;
                try {
                    id = Integer.parseInt(idTexto);
                }catch (NumberFormatException e)
                {
                    System.out.println("El id esta introducido erroneamente");
                    return;
                }

                String email = sc.nextLine();
                email = email.substring(14, email.length()-2);

                String firstName = sc.nextLine();
                firstName = firstName.substring(19, firstName.length()-2);

                String lastName = sc.nextLine();
                lastName = lastName.substring(18, lastName.length()-2);

                String avatar = sc.nextLine();
                avatar = avatar.substring(15, avatar.length()-1);

                sc.nextLine();
                sc.nextLine();

                Usuario usuario = new Usuario(id, email, firstName, lastName, avatar);
                usuarios.put(id, usuario);
            }
        }catch (FileNotFoundException e){}
    }

    private static String leerTexto()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void crearMenu()
    {
        System.out.println("GESTOR USUARIOS\n" +
                "1. Importar usuarios\n" +
                "2. Añadir usuario\n" +
                "3. Modificar usuario\n" +
                "4. Eliminar usuario\n" +
                "5. Exportar usuarios\n" +
                "0. Salir\n" +
                "Escoja una opción:");
    }
}
