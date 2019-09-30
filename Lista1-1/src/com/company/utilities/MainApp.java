package com.company.utilities;

import com.company.dao.SingletonJogoDAO;
import com.company.model.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    private Scanner scan;
    private List<Jogo>jogos;

    public MainApp(){
        scan = new Scanner(System.in);
        jogos=new ArrayList<>();

    }
    private void menu() {
        System.out.println("1 - Exibir Todos");
        System.out.println("2 - Cadastrar Jogo");
        System.out.println("3 - Buscar por Jogo");
        System.out.println("4 - Buscar por Genero");
        System.out.println("5 - Buscar por Ano");
        System.out.println("6 - Atualizar por Nome");
        System.out.println("7 - Deletar por Id");
        System.out.println("0 - Sair");
    }

    public void mainLoop(){
        int op;
        while(true){
            menu();
            op = scan.nextInt();
            if(op==0)
                break;
            else
                avaliarOp(op);
        }
    }

    private void avaliarOp (int op){
        Jogo jogo = new Jogo();
        switch (op){
            //Buscar Todos
            case 1:
                jogos = SingletonJogoDAO.getInstance().getAllJogos();
                exibirJogos();
                break;
            case 2:
                System.out.println("Informe nome, genero, plataforma e ano:");
                jogo.nome = scan.next();
                jogo.genero = scan.next();
                jogo.plataforma = scan.next();
                jogo.lancamento = scan.next();
                SingletonJogoDAO.getInstance().insertJogo(jogo);
                break;
            case 3:
                System.out.println("Informe o nome: ");
                jogo.nome = scan.next();
                jogos = SingletonJogoDAO.getInstance().getAllJogosByName(jogo.nome);
                exibirJogos();
                break;
            case 4:
                System.out.println("Informe o genero: ");
                jogo.genero = scan.next();
                jogos = SingletonJogoDAO.getInstance().getAllJogosByType(jogo.genero);
                exibirJogos();
                break;
            case 5:
                System.out.println("Informe o Ano: ");
                jogo.lancamento = scan.next();
                jogos = SingletonJogoDAO.getInstance().getAllJogosByYear(jogo.lancamento);
                exibirJogos();
                break;
            case 6:
                System.out.println("Informe o nome:");
                jogo.nome = scan.next();
                jogos = SingletonJogoDAO.getInstance().getAllJogosByName(jogo.nome);
                if(jogos==null)
                    System.out.println("Jogo não cadastrado");
                else{
                    jogo=jogos.get(0);
                    System.out.println("Nome [" + jogo.nome + "]:");
                    jogo.nome = scan.next();
                    System.out.println("Genero [" + jogo.genero + "]:");
                    jogo.genero = scan.next();
                    System.out.println("Plataforma [" + jogo.plataforma + "]:");
                    jogo.plataforma = scan.next();
                    System.out.println("Lancamento [" + jogo.lancamento + "]:");
                    jogo.lancamento = scan.next();
                    SingletonJogoDAO.getInstance().updateJogo(jogo);

                }
            case 7:
                System.out.println("Informe o nome:");
                jogo.id = scan.nextInt();
                SingletonJogoDAO.getInstance().deleteById(jogo.id);
                break;
        }
    }

    private void exibirJogos() {
        for (Jogo jogo: jogos) {
            System.out.println(jogo);
        }
    }
}
