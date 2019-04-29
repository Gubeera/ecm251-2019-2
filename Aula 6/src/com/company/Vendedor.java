package com.company;

public class Vendedor extends Funcionario {
    public Vendedor(String nome){
        super(nome);
    }
    @Override
    public double comissao() {
        return 0.1*super.salario;
    }
}
