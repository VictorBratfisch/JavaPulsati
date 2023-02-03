package com.mycompany.exerciciobiblioteca;

public abstract class item {
    private String titulo;
    private String autor;
    private double exemplares;
    
    public abstract void imprime();

    public abstract void alugarItem();
    
    public abstract void devolverItem();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getExemplares() {
        return exemplares;
    }

    public void setExemplares(double exemplares) {
        this.exemplares = exemplares;
    }
}
