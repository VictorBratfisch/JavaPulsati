package com.mycompany.exerciciobiblioteca;

public class livro extends item {
    private int isbn;
    private int numPaginas;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void imprime() {
        System.out.println("Titulo: "+getTitulo()+"   Autor: "+getAutor()+"    Exemplares: "+getExemplares()+"    Número Isbn: "+getIsbn()+"     Número de Páginas: "+getNumPaginas());
    }

    @Override
    public void alugarItem() {
    }

    @Override
    public void devolverItem() {
    }
}
