package ma.abdelmalek.state;

public class EtatEnLair extends State {
    public EtatEnLair(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortor du garage, je suis en Lair");
    }

    @Override
    void executeEntrerGarage() {
        System.out.println("Impossible d'entrer au garage, je suis en Lair");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller, je suis dèja en Lair");
    }

    @Override
    void executeAterir() {
        System.out.println("Transition d'état de en L'air => Piste");
        avion.state = new EtatEnPiste(avion);
    }

    @Override
    void executeDoActivity() {
        for (int i=0; i < 10 ; i++) {
            System.out.println("Activité de l'état en Lair ...." + i);
        }
    }
}
