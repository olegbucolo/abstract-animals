import org.lessons.java.animals.Animale;
import org.lessons.java.animals.Cane;
import org.lessons.java.animals.Passerotto;

public class App {
    public static void main(String[] args) throws Exception {

        Animale a1 = new Cane();
        Animale a2 = new Passerotto();

        a1.dormi();
        a1.verso();

        a2.dormi();
        a2.mangia();
    }
}
