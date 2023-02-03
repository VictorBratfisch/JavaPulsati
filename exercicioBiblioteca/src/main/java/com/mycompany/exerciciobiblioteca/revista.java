package com.mycompany.exerciciobiblioteca;

public class revista extends item {
    private int numEdicao;

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    @Override
    public void imprime() {
        System.out.println("Titulo: "+getTitulo()+"   Autor: "+getAutor()+"    Exemplares: "+getExemplares()+"    Número Edição: "+getNumEdicao());
    }

    @Override
    public void alugarItem() {     
    }

    @Override
    public void devolverItem() {
    }   
}
