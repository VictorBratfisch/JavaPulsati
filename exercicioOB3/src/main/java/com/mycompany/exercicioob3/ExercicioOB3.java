package com.mycompany.exercicioob3;

public class ExercicioOB3 {

    public static void imprimeMsg(mamiferos m){
        System.out.println("Essa espécie tem "+m.getMamas()+" mamas e a cor do pelo é "+m.getPelos());
    }
    public static void main(String[] args) {
       cachorro objC = new cachorro();
       macaco objM = new macaco();
       homem objH = new homem();
       objC.setMamas("8");
       objM.setMamas("2");
       objH.setMamas("2");
       objC.setPelos("Branco");
       objM.setPelos("Marrom");
       objH.setPelos("Preto");
       imprimeMsg(objC);
       imprimeMsg(objM);
       imprimeMsg(objH);
    }
}
