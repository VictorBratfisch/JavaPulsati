package com.mycompany.exerciciobiblioteca;

public class ExercicioBiblioteca {

    public static void imprimeItem(item i){
        i.imprime();
    }
    public static void alugar(item i){
        i.alugarItem();
    }
    public static void devolver(item i){
        i.devolverItem();
    }
    public static void main(String[] args) {
        livro objL = new livro();
        revista objR = new revista();
        biblioteca objB = new biblioteca();
        biblioteca objB2 = new biblioteca();
        
        objL.setTitulo("É assim que acaba");
        objL.setAutor("Colleen Hoover");
        objL.setExemplares(1000000);
        objL.setIsbn(1212);
        objL.setNumPaginas(200);
        
        objR.setTitulo("Revista The Last of Us");
        objR.setAutor("Neil Druckmann");
        objR.setExemplares(500000);
        objR.setNumEdicao(1012);
        
        objB.setTitulo(objL.getTitulo());
        objB2.setTitulo(objR.getTitulo());

        
        imprimeItem(objL);
        imprimeItem(objR);
        imprimeItem(objB);
        
        alugar(objB);
         
        devolver(objB2);
    }
}
