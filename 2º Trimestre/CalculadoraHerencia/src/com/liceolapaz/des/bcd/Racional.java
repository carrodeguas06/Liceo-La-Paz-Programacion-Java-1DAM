package com.liceolapaz.des.bcd;

public class Racional implements Numero {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public Numero sumar(Numero operando)
    {
        Numero resultado = null;

        if (operando instanceof Racional)
        {
            Racional r = (Racional) operando;
            int nuevoNumerador = this.numerador*r.denominador+this.denominador*r.numerador;
            int nuevoDenominador = this.denominador*r.denominador;
            resultado = new Racional (nuevoNumerador, nuevoDenominador);
            return resultado;
        }
        else
        {
            System.out.println("El numero no es valido");
        }
        return null;
    }

    @Override
    public Numero restar(Numero operando) {
        Numero resultado = null;

        if (operando instanceof Racional)
        {
            Racional r = (Racional) operando;
            int nuevoNumerador = this.numerador*r.denominador-this.denominador*r.numerador;
            int nuevoDenominador = this.denominador*r.denominador;
            resultado = new Racional (nuevoNumerador, nuevoDenominador);
            return resultado;
        }
        else
        {
            System.out.println("El numero no es valido");
        }
        return null;
    }

    @Override
    public Numero multiplicar(Numero operando) {
        Numero resultado = null;

        if (operando instanceof Racional)
        {
            Racional r = (Racional) operando;
            int nuevoNumerador = this.numerador*r.numerador;
            int nuevoDenominador = this.denominador*r.denominador;
            resultado = new Racional (nuevoNumerador, nuevoDenominador);
            return resultado;
        }
        else
        {
            System.out.println("El numero no es valido");
        }
        return null;
    }

    @Override
    public Numero dividir(Numero operando) {
        Numero resultado = null;

        if (operando instanceof Racional)
        {
            Racional r = (Racional) operando;
            int nuevoNumerador = this.numerador*r.denominador;
            int nuevoDenominador = this.denominador*r.numerador;
            if (nuevoDenominador == 0)
            {
                System.out.println("No se puede dividir entre 0");
            }
            else
            {
                resultado = new Racional (nuevoNumerador, nuevoDenominador);
                return resultado;
            }
        }
        else
        {
            System.out.println("El numero no es valido");
        }
        return null;
    }

    @Override
    public String mostrar() {
        return "" + this.numerador +"/"+ this.denominador;
    }
}
