package com.liceolapaz.des.bcd;

public class Empleados
{
    private String DNI, nombre, primerApellido, segundoApellido, fechaNacimiento, DNIJefe;
    private double salario;
    private int departamento ;

    public Empleados(String DNI, String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, String DNIJefe, double salario, int departamento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.DNIJefe = DNIJefe;
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return  "DNI=" + DNI + '\n' +
                "Nombre= " + nombre + '\n' +
                "Primer apellido= " + primerApellido + '\n' +
                "Segundo apellido= " + segundoApellido + '\n' +
                "Fecha de nacimiento= " + fechaNacimiento + '\n' +
                "DNI Jefe= " + DNIJefe + '\n' +
                "Salario= " + salario + '\n' +
                "Numero de departamento= " + departamento;
    }
}
