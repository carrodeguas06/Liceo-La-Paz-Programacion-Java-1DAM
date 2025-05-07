package com.liceolapaz.des.bcd;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class Principal
{
    static HashMap <String, Empleados> empleados = new HashMap<>();
    public static void main(String[] args) {
        while (true)
        {
            crearMenu();

            int opcion;
            try {
                opcion = leerNumero();
            }catch(InputMismatchException e)
            {
                System.out.println("Ingresa un numero entero");
                continue;
            }
            switch(opcion)
            {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Ingresa la ruta del fichero: ");
                    String ruta = leerTexto();
                    importarFichero(ruta);
                    break;

                case 2:
                    nuevoEmpleado();
                    break;

                case 3:
                    modificarEmpleado();
                    break;

                case 4:
                    eliminarEmpleado();
                    break;

                case 5:
                    listaEmpleados();
            }
        }
    }

    private static void listaEmpleados()
    {
        System.out.println("Ingresa la ruta del fichero: ");
        String ruta = leerTexto();

        File archivo = new File(ruta);
        if(!archivo.isFile())
        {
            System.out.println("No existe el fichero");
            return;
        }

        try {
            FileWriter fw = new FileWriter(ruta);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            LocalDateTime ldt = LocalDateTime.now();
            String linea;

            linea = "Fecha: " + ldt.getDayOfMonth() + "/" + ldt.getMonthValue() + "/" + ldt.getYear();
            pw.println(linea);
            linea = "Hora: " + ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();
            pw.println(linea);

            linea = "Numero de empleados: " + empleados.size();
            pw.println(linea);

            int contador = 0;
            for (Empleados empleado : empleados.values())
            {
                linea = "===============";
                pw.println(linea);

                contador++;
                linea = "Empleado " + contador;
                pw.println(linea);

                linea = "===============";
                pw.println(linea);

                linea = empleado.toString();
                pw.println(linea);

                linea = "===============";
                pw.println(linea);
            }
            pw.close();
            bw.close();
            fw.close();
        }catch (IOException e){}

    }

    private static void eliminarEmpleado()
    {
        System.out.println("Escriba el DNI del empleado que desea eliminar: ");
        String dni = leerTexto();
        if (!empleados.containsKey(dni))
        {
            System.out.println("El empleado no existe");
            return;
        }
        empleados.remove(dni);
    }

    private static void modificarEmpleado()
    {
        System.out.println("Ingrese el DNI del empleado: ");
        String dni = leerTexto();
        if (!empleados.containsKey(dni))
        {
            System.out.println("El empleado no existe");
            return;
        }

        System.out.println("Ingresa el nombre del empleado: ");
        String nombre = leerTexto();

        System.out.println("Ingresa el primer apellido del empleado: ");
        String apellido1 = leerTexto();

        System.out.println("Ingresa el segundo apellido del empleado: ");
        String apellido2 = leerTexto();

        if (apellido2.isEmpty())
        {
            apellido2 = null;
        }

        System.out.println("Escriba la fecha de nacimiento (aaaa/mm/dd): ");
        String fechaNacimiento = leerTexto();
        if (comprobarFecha(fechaNacimiento) == null)
        {
            System.out.println("El fecha de nacimiento no tiene el formato correcto");
            return;
        }

        System.out.println("Ingresa el salario del empleado: ");
        String salario = leerTexto();
        double salarioDouble;
        try {
            salarioDouble = Double.parseDouble(salario);
        }catch (NumberFormatException e)
        {
            System.out.println("El formato del salario no es valido");
            return;
        }

        System.out.println("Ingrese el numero del departamento del empleado: ");
        int departamento;
        try {
            departamento = leerNumero();
        }catch (InputMismatchException e)
        {
            System.out.println("El departamento tiene que ser un numero entrero: ");
            return;
        }
        System.out.println("Ingrese el DNI del jefe del empleado: ");
        String dniJefe = leerTexto();
        if (dniJefe.isEmpty())
        {
            dniJefe = null;
        }
        else
        {
            if (!comprobarDni(dniJefe))
            {
                System.out.println("El DNI no es correcto");
                return;
            }
        }
        Empleados empleado = new Empleados(dni, nombre, apellido1, apellido2, fechaNacimiento, dniJefe ,salarioDouble, departamento);
        empleados.replace(dni, empleado);
    }


    private static void nuevoEmpleado()
    {
        System.out.println("Ingrese el DNI del empleado: ");
        String dni = leerTexto();
        if (empleados.containsKey(dni))
        {
            System.out.println("El empleado ya existe");
            return;
        }
        if (!comprobarDni(dni))
        {
            System.out.println("El DNI no es correcto");
            return;
        }

        System.out.println("Ingresa el nombre del empleado: ");
        String nombre = leerTexto();

        System.out.println("Ingresa el primer apellido del empleado: ");
        String apellido1 = leerTexto();

        System.out.println("Ingresa el segundo apellido del empleado: ");
        String apellido2 = leerTexto();

        if (apellido2.isEmpty())
        {
            apellido2 = null;
        }

        System.out.println("Escriba la fecha de nacimiento (aaaa/mm/dd): ");
        String fechaNacimiento = leerTexto();
        if (comprobarFecha(fechaNacimiento) == null)
        {
            System.out.println("El fecha de nacimiento no tiene el formato correcto");
            return;
        }

        System.out.println("Ingresa el salario del empleado: ");
        String salario = leerTexto();
        double salarioDouble;
        try {
            salarioDouble = Double.parseDouble(salario);
        }catch (NumberFormatException e)
        {
            System.out.println("El formato del salario no es valido");
            return;
        }

        System.out.println("Ingrese el numero del departamento del empleado: ");
        int departamento;
        try {
            departamento = leerNumero();
        }catch (InputMismatchException e)
        {
            System.out.println("El departamento tiene que ser un numero entrero: ");
            return;
        }
        System.out.println("Ingrese el DNI del jefe del empleado: ");
        String dniJefe = leerTexto();
        if (dniJefe.isEmpty())
        {
            dniJefe = null;
        }
        else
        {
            if (!comprobarDni(dniJefe))
            {
                System.out.println("El DNI no es correcto");
                return;
            }
        }
        Empleados empleado = new Empleados(dni, nombre, apellido1, apellido2, fechaNacimiento, dniJefe ,salarioDouble, departamento);
        empleados.put(dni, empleado);
    }

    private static void importarFichero(String ruta)
    {
        File fichero = new File(ruta);
        try {
            Scanner escaner = new Scanner(fichero);
            if (!fichero.isFile())
            {
                System.out.println("El fichero no se puede leer");
                return;
            }

            escaner.nextLine();

            while (escaner.hasNextLine()) {
                String[] partes = escaner.nextLine().split(", ");
                    String dni = partes[0].substring(2, partes[0].length()-1);
                    if (!comprobarDni(dni))
                    {
                        System.out.println("El DNI no es correcto");
                        return;
                    }
                    String nombre = partes[1].substring(1, partes[1].length() - 1);
                    String apellido1 = partes[2].substring(1, partes[2].length()-1);
                    String apellido2 = partes[3].substring(1, partes[3].length()-1);
                    if (partes[3].equals("NULL"))
                    {
                        apellido2 = null;
                    }
                    String fechaNacimiento = partes[4].substring(1, partes[4].length()-1);
                    if (comprobarFecha(fechaNacimiento) == null)
                    {
                        System.out.println("El fecha de nacimiento no es correcto");
                        return;
                    }
                    double salario;
                    try {
                        salario = Double.parseDouble(partes[5].substring(1, partes[5].length()-1));
                    }catch (NumberFormatException e)
                    {
                        System.out.println("El formato del salario no es valido");
                        return;
                    }
                    int departamento;
                    try {
                        departamento = Integer.parseInt(partes[6]);
                    }catch (NumberFormatException e)
                    {
                        System.out.println("El formato del departamento tiene que ser un entero");
                        return;
                    }
                String dniJefe;
                if (partes[7].equals("NULL)"))
                {
                    dniJefe = null;
                }
                else
                {
                    dniJefe = partes[7].substring(1, partes[7].length()-2);
                    if (!comprobarDni(dniJefe))
                    {
                        return;
                    }
                }
                    Empleados empleado = new Empleados(dni, nombre, apellido1, apellido2, fechaNacimiento, dniJefe ,salario, departamento);
                    empleados.put(dni, empleado);
            }

            }catch (FileNotFoundException e)
        {
            System.out.println("El fichero no se ha encontrado");
        }
    }

    private static String leerTexto()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int leerNumero()
    {
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }

    private static void crearMenu()
    {
        System.out.println("GESTOR EMPLEADOS\n" +
                "1. Importar empleados\n" +
                "2. Añadir empleado\n" +
                "3. Modificar empleado\n" +
                "4. Eliminar empleado\n" +
                "5. Exportar empleados\n" +
                "0. Salir\n" +
                "Escoja una opción: ");
    }

    private static boolean comprobarDni(String dni)
    {
        if (dni.length() != 9) {
            System.out.println("Longitud incorrecta. Ej: 12345678Z");
            return false;
        }
        String parteNumerica = dni.substring(0, 8);
        try {
            int numero = Integer.parseInt(parteNumerica);
            char letra = dni.charAt(8);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letraCorrecta = letras.charAt(numero % letras.length());
            if (letraCorrecta != letra) {
                System.out.println("Formato de dni incorrecto, la letra esta mal. Ej: 12345678Z");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Formato de dni incorrecto, los números estan mal. Ej: 12345678Z");
            return false;
        }
        return true;
    }

    private static Date comprobarFecha(String fechaTexto)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/d");
        sdf.setLenient(false);
        try {
            return sdf.parse(fechaTexto);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto");
            return null;
        }
    }
}
