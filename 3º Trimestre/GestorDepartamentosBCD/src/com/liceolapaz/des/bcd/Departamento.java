package com.liceolapaz.des.bcd;

public class Departamento
{
    private int idDepartamento;
    private String nombre;
    private String nombreCorto;
    private int planta;
    private String cifDirector;
    private String correo;

    public Departamento(int idDepartamento, String nombre, String nombreCorto, int planta, String cifDirector, String correo) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
        this.planta = planta;
        this.cifDirector = cifDirector;
        this.correo = correo;
    }


    public String toPrint() {
        return idDepartamento +";"+ nombre + ";" + nombreCorto + ";" + planta + ";" + cifDirector + ";" + correo;
    }
}
