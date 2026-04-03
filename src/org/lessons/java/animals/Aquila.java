package org.lessons.java.animals;

public class Aquila extends Animale implements Volante{
    @Override
    public void verso(){
        System.out.println("Aquileggiamento");
    }
    
    @Override
    public void mangia(){
        System.out.println("L'aquila mangia il coniglio");
    }

    @Override
    public void vola(){
        System.out.println("Sto volando");
    }
}
