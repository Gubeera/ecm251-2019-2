package com.company;

import auxiliar_database.UsuariosDAO;
import model.Usuario;
import utilities.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private UsuariosDAO usuariosDAO;
    private List<Usuario> users;
    public Aplicacao(){
        usuariosDAO = new UsuariosDAO(Constants.URL_MEU_BANCO);
        users = new ArrayList<>();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    String nome, email,senha;
                    System.out.println("Informe:");
                    nome = scanner.next();
                    email = scanner.next();
                    senha = scanner.next();
                    Usuario user = new Usuario(nome, email, senha);
                    usuariosDAO.insertUsuario(user);

                    break;
                case 2:
                    users = usuariosDAO.getAllUsuario();

            }
            if (op == 0)
                break;
        }while (true);
    }
    public void menu(){
        System.out.println("1 - Inserir os Usuarios");
        System.out.println("2 - Mostrar todos os Usuarios");
        System.out.println("3 - Buscar Usuarios");
        System.out.println("4 - Atualizar Usuarios");
        System.out.println("5 - Remover Usuarios");
        System.out.println("0 - Sair");

    }
}
