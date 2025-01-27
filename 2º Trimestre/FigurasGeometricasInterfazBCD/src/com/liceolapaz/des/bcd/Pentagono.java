package com.liceolapaz.des.bcd;

public class Pentagono implements FiguraGeometrica {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        double area = (lado * apotema)/2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado * 5;
        return perimetro;
    }
}
