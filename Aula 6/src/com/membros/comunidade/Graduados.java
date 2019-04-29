package com.membros.comunidade;

public class Graduados extends MembrosDaComunidade {

    private String curso;

    public Graduados(String nome,String cpf,String curso){
        super(nome,cpf);
        this.curso = curso;
    }

    @Override
    public String getDados() {
        return super.getDados() + '\t' + curso;
    }
}
