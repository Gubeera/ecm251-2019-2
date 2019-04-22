package com.membros.comunidade;

public class Aluno extends MembrosDaComunidade {
    private String ra;
    @Override
    public Aluno(String nome,String cpf,String RA){
        super(nome,cpf);
        this.ra=RA;
    }

    @Override
    public String getDados() {
        return super.getDados() + '\t' + ra;
    }
}
