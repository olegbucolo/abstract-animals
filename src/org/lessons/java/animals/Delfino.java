package org.lessons.java.animals;

public class Delfino extends Animale {
    @Override
    public void verso(){
        System.out.println("Squittio");
    }
    
    @Override
    public void mangia(){
        System.out.println("Il delfino mangia il pesce");
    }
}
