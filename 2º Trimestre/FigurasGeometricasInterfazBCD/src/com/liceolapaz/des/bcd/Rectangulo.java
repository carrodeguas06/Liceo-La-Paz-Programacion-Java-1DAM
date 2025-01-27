package com.liceolapaz.des.bcd;

public class Rectangulo implements FiguraGeometrica {

    double lado;
    double base;

    public Rectangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }


    public double calcularArea() {
        double area = lado * base;
        return area;
    }


    public double calcularPerimetro() {
        double perimetro = (lado*2) + (2*base);
        return perimetro;
    }
}
