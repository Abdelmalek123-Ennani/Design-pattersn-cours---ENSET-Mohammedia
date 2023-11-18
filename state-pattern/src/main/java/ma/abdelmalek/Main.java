package ma.abdelmalek;

import ma.abdelmalek.state.Avion;
import ma.abdelmalek.state.AvionImpl;

public class Main {
    public static void main(String[] args) {
        Avion avion = new AvionImpl();
        avion.doActivity();
        System.out.println("--------------------------");
        avion.sortirDuGarage();
        System.out.println("--------------------------");
        avion.doActivity();
        System.out.println("--------------------------");
        avion.entrerGarage();
        System.out.println("--------------------------");
        avion.doActivity();
        System.out.println("--------------------------");
        avion.decoller();
        avion.atterir();
        avion.sortirDuGarage();
        System.out.println("--------------------------");
        avion.doActivity();
        avion.decoller();
        avion.doActivity();
        avion.entrerGarage();
        avion.decoller();

    }
}