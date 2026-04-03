package org.lessons.java.animals;

public class Cane extends Animale {
    @Override
    public void verso(){
        System.out.println("Bau bau");
    }
    
    @Override
    public void mangia(){
        System.out.println("Il cane mangia il gatto");
    }
}
