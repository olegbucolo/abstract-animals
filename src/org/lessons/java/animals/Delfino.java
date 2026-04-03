package org.lessons.java.animals;

public class Delfino extends Animale implements Nuotatore{
    @Override
    public void verso(){
        System.out.println("Squittio");
    }
    
    @Override
    public void mangia(){
        System.out.println("Il delfino mangia il pesce");
    }

    @Override
    public void nuota(){
        System.out.println("Sto nuotando");
    }
}
