package com.mycompany.exerciciometodos;

public class ExercicioMetodos {

    public static void main(String[] args) {
        sedan objSedan = new sedan();
        suv objSuv = new suv();
        
        objSedan.setPotencia(170);
        objSedan.acelera();
        objSedan.mostrar();
        
        objSuv.setPotencia(200);
        objSuv.acelera();
        objSuv.mostrar();
    }
}
