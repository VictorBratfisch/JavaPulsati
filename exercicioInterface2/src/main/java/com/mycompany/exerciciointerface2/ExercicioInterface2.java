package com.mycompany.exerciciointerface2;

public class ExercicioInterface2 {

    public static void main(String[] args) {
       carro objCarro = new carro();
       bicicleta objBike = new bicicleta();
       caminhao objCam = new caminhao();
       
       objCarro.acelerar();
       objCarro.frear();
       objCarro.verificar();
       
       objBike.acelerar();
       objBike.frear();
       objBike.verificar();
       
       objCam.acelerar();
       objCam.frear();
       objCam.verificar();
    }
}
