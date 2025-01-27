package com.liceolapaz.des.bcd;

public class Complejo implements Numero{
    private int real;
    private int imaginaria;

    public Complejo(int real, int imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    @Override
    public Numero sumar(Numero operando) {
        Numero resultado = null;

        if (operando instanceof Complejo)
        {
            Complejo comp = (Complejo) operando;
            int nuevoReal = this.real + comp.real;
            int nuevaImaginaria = this.imaginaria + comp.imaginaria;
            resultado = new Complejo(nuevoReal, nuevaImaginaria);
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

        if (operando instanceof Complejo)
        {
            Complejo comp = (Complejo) operando;
            int nuevoReal = this.real - comp.real;
            int nuevaImaginaria = this.imaginaria - comp.imaginaria;
            resultado = new Complejo(nuevoReal, nuevaImaginaria);
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

        if (operando instanceof Complejo)
        {
            Complejo comp = (Complejo) operando;
            int nuevoReal = this.real * comp.real - this.imaginaria * comp.imaginaria;
            int nuevaImaginaria = this.real * comp.imaginaria + this.imaginaria * comp.real;
            resultado = new Complejo(nuevoReal, nuevaImaginaria);
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

        if (operando instanceof Complejo)
        {
            Complejo comp = (Complejo) operando;
            int nuevoReal = (this.real * comp.real + this.imaginaria * comp.imaginaria) / (comp.real * comp.real) + (comp.imaginaria * comp.imaginaria);
            int nuevaImaginaria =  (this.real * comp.imaginaria - this.imaginaria * comp.real) / (comp.real * comp.real) + (comp.imaginaria * comp.imaginaria) ;
            if ((comp.real * comp.real) + (comp.imaginaria * comp.imaginaria) == 0)
            {
                System.out.println("El numero no es valido");
            }
            else
            {
                resultado = new Complejo(nuevoReal, nuevaImaginaria);
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
        return "" + this.real +" + "+ this.imaginaria + "i";
    }
}
