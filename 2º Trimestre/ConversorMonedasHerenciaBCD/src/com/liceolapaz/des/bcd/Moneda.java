package com.liceolapaz.des.bcd;

public abstract class Moneda {
    double cantidad;
    private double cambio;

    public Moneda(double cantidad)
    {
        this.cantidad = cantidad;
    }

    public double cantidadEnEuros() {
        double resultado = 0;
        resultado =  this.cantidad * this.cambio;
        return resultado;
    }
}
