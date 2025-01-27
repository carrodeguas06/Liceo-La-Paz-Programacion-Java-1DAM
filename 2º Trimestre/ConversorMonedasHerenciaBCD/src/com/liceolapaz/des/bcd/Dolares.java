package com.liceolapaz.des.bcd;

public class Dolares extends Moneda {
    double  cambio = 0.883509299 ;

    public Dolares(double cantidad) {
        super(cantidad);
    }

    public double cantidadEnEuros()
    {   double resultado = 0;
        resultado =  this.cantidad * this.cambio;
        return resultado;
    }
}
