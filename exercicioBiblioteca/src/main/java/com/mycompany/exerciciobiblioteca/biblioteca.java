package com.mycompany.exerciciobiblioteca;

public class biblioteca extends item {      
    @Override
    public void alugarItem() {
        System.out.println(getTitulo()+" foi alugado");
    }
    @Override
    
    public void devolverItem(){
        System.out.println(getTitulo()+" foi devolvido");
    }

    @Override
    public void imprime() {
    }
}
