package ma.abdelmalek;

import java.util.Random;

public class Proxy implements Standard{

    private StandardImpl1 target = new StandardImpl1();

    @Override
    public void process() {
        System.out.println("Vérification du context de sécurité");
        boolean b = new Random().nextBoolean();
        if (b) {
            System.out.println("Avant l'appel");
            target = new StandardImpl1();
            target.process();
            System.out.println("après l'appel");
        } else {
            throw new RuntimeException("Forbidden 403");
        }
    }
}
