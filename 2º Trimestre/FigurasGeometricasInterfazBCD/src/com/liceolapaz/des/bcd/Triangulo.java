package com.liceolapaz.des.bcd;

public class Triangulo implements FiguraGeometrica
{

    private double lado1, lado2, lado3, altura;

    public Triangulo(double lado1, double lado2, double lado3, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    @Override
    public double calcularArea()
    {
        double nuevoValor = this.lado3 * this.altura /2;
       return nuevoValor;
        
    }

    @Override
    public double calcularPerimetro() {
        {
            double nuevoValor = this.lado3 + this.lado2 + this.lado1;
            return nuevoValor;
        }

    }
}
