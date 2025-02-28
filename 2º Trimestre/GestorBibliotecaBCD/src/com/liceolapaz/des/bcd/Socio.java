package com.liceolapaz.des.bcd;

public class Socio {

    String nombre;
    String apellido1;
    String apellido2;
    String dni;
    String fechaNacimiento;
    String email;
    Libro libro;
    int numSocio;
    int contadorLibros;
    Libro[] listaLibrosSocio = new Libro[5];

    public Socio(String nombre, String apellido1, String apellido2, String dni, String email, String fechaNacimiento, int numSocio, int contadorLibrosSocio)
    {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.numSocio = numSocio;
        this.contadorLibros = contadorLibrosSocio;
    }

    public Socio(String nombre, String apellido1, String apellido2, String dni, String email, String fechaNacimiento, int numSocio, int contadorLibrosSocio, Libro[] listaLibrosSocio, Libro libro)
    {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.numSocio = numSocio;
        this.contadorLibros = contadorLibrosSocio;
        this.listaLibrosSocio = listaLibrosSocio;
        this.libro = libro;
    }


    public String getNombre()
    {
        return nombre;
    }

    public String getApellido1()
    {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public Libro[] getListaLibrosSocio()
    {
        libro = listaLibrosSocio[contadorLibros];
        return listaLibrosSocio;
    }

    public void anhadirLibro(Libro libro) {
        this.libro = libro;
        if (contadorLibros < 5)
        {
            listaLibrosSocio[contadorLibros] = libro;
            contadorLibros++;
        }
        else
        {
            System.out.println("No puedes tener más libros");
        }
    }

    public void retirarLibro(Libro libro, int localizacionLibro)
    {
        if (contadorLibros == 0)
        {
            listaLibrosSocio[localizacionLibro] = null;
            contadorLibros--;

            for (int i = localizacionLibro; i < 5; i++)
            {
                if (i==4)
                {
                    listaLibrosSocio[i] = null;
                }
                else
                {
                    listaLibrosSocio[i] = listaLibrosSocio[i+1];
                }
            }
        }
    }
}