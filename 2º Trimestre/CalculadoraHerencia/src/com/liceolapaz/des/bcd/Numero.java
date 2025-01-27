package com.liceolapaz.des.bcd;

public interface Numero {
    Numero sumar(Numero operando);
    Numero restar(Numero operando);
    Numero multiplicar(Numero operando);
    Numero dividir(Numero operando);
    String mostrar();
}
