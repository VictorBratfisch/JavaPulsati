package com.mycompany.exercicioob1;

public class ExercicioOB1 {

    public static void imprimeMsg(animal a){
        System.out.println(a.getNome()+" é da raça "+a.getRaca());
    }
    public static void main(String[] args) {
        cachorro objC = new cachorro();
        gato objG = new gato();
        objC.setNome("Tommy");
        objC.setRaca("Pastor Alemão");
        objG.setNome("Fred");
        objG.setRaca("Branco");
        imprimeMsg(objC);
        imprimeMsg(objG);
    }
}
