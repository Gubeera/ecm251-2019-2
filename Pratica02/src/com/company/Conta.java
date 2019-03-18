package com.company;

public class Conta {
    int numero;
    String titular;
    String cpf;
    double saldo;

    public void visualizarSaldo(){
        System.out.printf("A sua conta :" + numero + "contem Saldo R$: " + saldo);
    }
    public void depositar(double valorParaDepositar){
        saldo += valorParaDepositar;
    }
    public void sacar(double valorParaSacar){
        saldo -= valorParaSacar;
    }
    public void  transferirDinheiro(double valor,Conta beneficiada){
        sacar(valor);
        beneficiada.depositar(valor);
    }
}
