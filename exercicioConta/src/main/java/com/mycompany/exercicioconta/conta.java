package com.mycompany.exercicioconta;

public abstract class conta {
    private String nomeTitular;
    private double saldo;
    private int numConta;
      
    public abstract void deposito(double valor);
    
    public abstract boolean saque(double valor);
    
    public abstract void transf(conta pagar, conta receber, double valor);

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    void imprime() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
