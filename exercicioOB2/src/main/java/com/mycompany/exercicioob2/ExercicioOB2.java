package com.mycompany.exercicioob2;

public class ExercicioOB2 {

    public static void imprimeMsg(conta c){
        System.out.println("Número da conta: "+c.getNumero()+"   Cliente: "+c.getCliente()+"   Saldo: "+c.getSaldo());
    }
    public static void main(String[] args) {
        contaEspecial objConta = new contaEspecial();
        objConta.setNumero("1234");
        objConta.setCliente("Nero");
        objConta.setSaldo(5000);
        imprimeMsg(objConta);
    }
}
