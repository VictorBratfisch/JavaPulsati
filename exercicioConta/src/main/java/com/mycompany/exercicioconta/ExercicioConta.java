package com.mycompany.exercicioconta;

public class ExercicioConta {

    
    public static void imprimeConta(conta c){
    c.imprime();
    }
    public static void deposito(conta c){
    c.deposito();
    }
    public static void saque(conta c){
    c.saque();
    }
    public static void transferencia(conta c){
    c.transf();
    }
            
    public static void main(String[] args) {
    contaEspecial objE = new contaEspecial();
    contaPoupanca objP = new contaPoupanca();  
    
    objE.setNomeTitular("Nero");
    objE.setNumConta(1212);
    objE.setSaldo(5000);
    objE.setLimite(1500);
    
    objP.setNomeTitular("Hay");
    objP.setNumConta(2709);
    objP.setSaldo(10000);
    objP.setTaxaRendimento(0.3);
    
    objE.transf(objE, objP, 50);
    objP.transf(objP, objE, 200);
    
    System.out.println("Saldo de Nero: "+objE.getSaldo()+"    Saldo de Hay: "+objP.getSaldo());
    }
}
