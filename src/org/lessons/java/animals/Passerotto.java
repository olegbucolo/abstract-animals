package org.lessons.java.animals;

public class Passerotto extends Animale {
    @Override
    public void verso(){
        System.out.println("Cinguettio");
    }
    
    @Override
    public void mangia(){
        System.out.println("Il passerotto mangia il seme");
    }
}
