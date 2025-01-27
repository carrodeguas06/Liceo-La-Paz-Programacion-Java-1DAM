package com.liceolapaz.des.bcd;

public class Libras extends Moneda{
    double cambio = 1.1029861;

    public Libras(double cantidad) {
        super(cantidad);
    }


    public double cantidadEnEuros()
    {   double resultado = 0;
        resultado =  this.cantidad * this.cambio;
        return resultado;
    }
}
