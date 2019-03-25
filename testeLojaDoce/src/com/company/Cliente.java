package com.company;

public class Cliente {
    private String nome;
    private String ra;
    private boolean funcionario;
    private boolean visitante;


    public Cliente(String nome){
        this.nome = nome;
        this.visitante = true;
    }
    public Cliente(String nome, boolean funcionario){
        this.nome = nome;
        if (funcionario)
            this.funcionario = funcionario;
        else
            visitante = true;
    }
    public Cliente(String nome,String ra){
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public boolean isFuncionario() {
        return funcionario;
    }

    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }

    public boolean isVisitante() {
        return visitante;
    }

    public void setVisitante(boolean visitante) {
        this.visitante = visitante;
    }
}
