package com.mycompany.exerciciointerface;

public class estudante extends pessoa {
    private int IdEstudante;
    
    public void imprimirEstudante(){
        System.out.println("Nome: "+getNome()+"  Idade: "+getIdade()+"  Matrícula: "+getIdEstudante());
    }
    
    public int getIdEstudante() {
        return IdEstudante;
    }

    public void setIdEstudante(int IdEstudante) {
        this.IdEstudante = IdEstudante;
    }
}
