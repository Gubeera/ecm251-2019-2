package com.membros.comunidade;

public class Empregado extends MembrosDaComunidade {

    private double salario;

    public Empregado(String nome,String cpf,double salario){
        super(nome,cpf);
        this.salario=salario;
    }

    @Override
    public String getDados() {
        return super.getDados() + '\t' + salario ;
    }
}
