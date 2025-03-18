package com.liceolapaz.des.bcd;

public class Asistentes
{
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private int diaFecha;
    private int mesFecha;
    private int anhoFecha;
    private String fechaNacimiento;
    private Entradas entrada;

    public Asistentes(String nombre, String apellidos, String dni, String email, int diaFecha, int mesFecha, int anhoFecha, Entradas entrada) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.email = email;
    this.diaFecha = diaFecha;
    this.mesFecha = mesFecha;
    this.anhoFecha = anhoFecha;
    this.entrada = entrada;
    }

    public String getDni()
    {
        return dni;
    }

    public String getApellidos()
    {
            return apellidos;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getEmail()
    {
        return email;
    }

    public String crearFecha()
    {
        fechaNacimiento = diaFecha + "/" + mesFecha + "/" + anhoFecha;
        return fechaNacimiento;
    }
}
