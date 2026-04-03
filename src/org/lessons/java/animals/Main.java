package org.lessons.java.animals;

public class Main {

    public static void faiVolare(Volante animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuotatore animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Aquila a1 = new Aquila();
        Delfino d1 = new Delfino();
        Passerotto p1 = new Passerotto();
        Cane c1 = new Cane();

        faiVolare(a1);
        faiNuotare(d1);
        faiVolare(p1);
        faiNuotare(c1);
    }
}
