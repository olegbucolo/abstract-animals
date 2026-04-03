package org.lessons.java.animals;

public class Aquila extends Animale {
    @Override
    public void verso(){
        System.out.println("Aquileggiamento");
    }
    
    @Override
    public void mangia(){
        System.out.println("L'aquila mangia il coniglio");
    }
}
