package com.company;

public class Main{
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Lobo();
        animals[0].comer();
        //animals [1].comer(); //Da justa Causa!!! Não Fazer!(Caso o 1 nn esteja declarado da null pointer)
        animals[1] = new Lobo();
        animals[2] = new Lobo();
        //animals[4].comer(); //
        //for(int i = 0; i<animals.length; i++){
          //  animals[i].comer();
        //}
        for(Animal animal : animals){
            animal.comer();
        }
    }
}
