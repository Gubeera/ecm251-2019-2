package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Scalco");
        Produto produto = new Produto(0,4.5,"Coxinha");
        Compra c1 = new Compra(1,cliente,produto);
        System.out.println(c1.pegarDetalhes());

        Compra c2 = new Compra(2,new Cliente("Roberto"),new Produto(2,4.5,"Café"));
        System.out.printf(c2.pegarDetalhes());

    }
}
