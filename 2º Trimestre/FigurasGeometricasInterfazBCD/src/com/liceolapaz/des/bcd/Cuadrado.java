package com.liceolapaz.des.bcd;

public class Cuadrado extends Rectangulo {

    double lado;

    public Cuadrado(double lado, double base) {
        super(lado, base);
        super.lado = lado;
        super.base = lado;
    }
}
