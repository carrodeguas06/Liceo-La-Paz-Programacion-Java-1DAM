package com.liceolapaz.des.bcd;

public class Libro{
    String isbn;
    String titulo;
    String genero;
    int numPaginas;
    boolean cogido;

    public Libro(String isbn, String titulo, String genero, int numPaginas, boolean cogido) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.cogido = cogido;
    }


    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public boolean isCogido() {
        return cogido;
    }

    public void setCogido(boolean cogido) {
        this.cogido = cogido;
    }
}
