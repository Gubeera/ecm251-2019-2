package com.membros.comunidade;

public class MembrosDaComunidade {
    protected String nome;
    protected String cpf;

    public MembrosDaComunidade(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public MembrosDaComunidade(){}

    public String getDados(){
        return nome + '\t' + cpf;
    }
}
