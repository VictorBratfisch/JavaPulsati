package com.mycompany.exerciciointerface3;

public class calculadoraImpl implements calculadora{
    
    private int valor;
    
    calculadoraImpl(){
        setValor(valorInicial);
    }

    @Override
    public void somar() {
        setValor(getValor() + 30);
    }

    @Override
    public void subtrair() {
        setValor(getValor() - 18);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void result() {
        System.out.println("O valor final é de: "+getValor());
    }
    
}
