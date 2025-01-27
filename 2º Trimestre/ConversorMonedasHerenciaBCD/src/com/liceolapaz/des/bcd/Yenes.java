package com.liceolapaz.des.bcd;

public class Yenes extends Moneda {
    double cambio = 0.00779327499;

    public Yenes(double cantidad) {
        super(cantidad);
    }


    public double cantidadEnEuros()
    {   double resultado = 0;
        resultado =  this.cantidad * this.cambio;
        return resultado;
    }
}
