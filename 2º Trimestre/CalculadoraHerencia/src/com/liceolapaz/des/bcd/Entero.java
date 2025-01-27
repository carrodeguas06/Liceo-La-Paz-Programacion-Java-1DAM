package com.liceolapaz.des.bcd;

public class Entero implements Numero {
    private int valor;

    public Entero(int valor)
    {
        this.valor = valor;
    }

    @Override
    public Numero sumar(Numero operando)
    {
        Numero resultado = null;
       if (operando instanceof Entero)
       {
           Entero op = (Entero) operando;
           int nuevoValor = this.valor + op.valor;
           resultado = new Entero(nuevoValor);
           return resultado;
       }

       else
       {
           System.out.println("El numero no es entero");
       }
       return null;
    }

    @Override
    public Numero restar(Numero operando)
    {
        Numero resultado = null;
        if (operando instanceof Entero)
        {
            Entero op = (Entero) operando;
            int nuevoValor = this.valor - op.valor;
            resultado = new Entero(nuevoValor);
            return resultado;
        }

        else
        {
            System.out.println("El numero no es entero");
        }
        return null;
    }

    @Override
    public Numero multiplicar(Numero operando)
    {
        Numero resultado = null;
        if (operando instanceof Entero)
        {
            Entero op = (Entero) operando;
            int nuevoValor = this.valor * op.valor;
            resultado = new Entero(nuevoValor);
            return resultado;
        }

        else
        {
            System.out.println("El numero no es entero");
        }
        return null;
    }

    @Override
    public Numero dividir(Numero operando)
    {
        Numero resultado = null;
        if (operando instanceof Entero)
        {
            Entero op = (Entero) operando;
            if (op.valor == 0)
            {
                System.out.println("No se puede dividir entre 0");
            }
            else
            {
                int nuevoValor = this.valor / op.valor;
                resultado = new Entero(nuevoValor);
            }

        }

        else
        {
            System.out.println("El numero no es entero");
        }
        return null;
    }

    @Override
    public String mostrar() {
        return "" + this.valor;
    }
}
