package com.company;
import personagens.Cliente;

public class Main {

    public static void main(String[] args) {
//        Cliente c1 = new Cliente("Teste 1");
//        System.out.println(c1);
//        personagens.Cliente c2;
//        c2 =new personagens.Cliente("Teste 2");
//        System.out.println(c2);
    //Comportamento Perigoso
        //Pacote da Classe
        Cliente c1 = new Cliente("C1");
        Cliente c2 = new Cliente("C2");
        System.out.println(c1);
        System.out.println(c2);
    }
}
