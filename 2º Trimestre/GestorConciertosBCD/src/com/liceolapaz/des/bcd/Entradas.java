package com.liceolapaz.des.bcd;

public class Entradas
{
    private int codigo;
    private int precio;
    private int fila;
    private int asiento;
    private boolean pieDePista;
    private boolean backstage;

    public Entradas(int codigo, int precio, int fila, int asiento, boolean pieDePista, boolean backstage) {
        this.codigo = codigo;
        this.precio = precio;
        this.fila = fila;
        this.asiento = asiento;
        this.pieDePista = pieDePista;
        this.backstage = backstage;
    }

}
