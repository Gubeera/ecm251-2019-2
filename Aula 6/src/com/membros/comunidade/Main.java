package com.membros.comunidade;

public class Main {

    static void mostrarDados(MembrosDaComunidade mdc){
        System.out.println(mdc.getDados());
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Adolfo","1","69");
        Graduados graduado = new Graduados("Jose","2","Advanced Computing");
        Funcionario funcionario = new Funcionario("Mineiro","50");
        mostrarDados(aluno);
        mostrarDados(graduado);
        mostrarDados(funcionario);
    }

}
