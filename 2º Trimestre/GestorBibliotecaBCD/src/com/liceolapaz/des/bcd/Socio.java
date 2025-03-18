package com.liceolapaz.des.bcd;

public class Socio {

    String nombre;
    String apellido1;
    String apellido2;
    String dni;
    String fechaNacimiento;
    String email;
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


    public void anhadirLibro(Libro libro) {
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