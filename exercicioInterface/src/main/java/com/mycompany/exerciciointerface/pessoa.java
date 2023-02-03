package com.mycompany.exerciciointerface;

public class pessoa {
    String nome;
    int idade;
    
    public void pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void imprimirPessoa(){
        System.out.println("Nome: "+getNome()+"  Idade: "+getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
