package ma.abdelmalek.state;

public class EtatEnPiste extends State {

    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du garage je suis dans l'état En Piste");
    }

    @Override
    void executeEntrerGarage() {
        System.out.println("Transition d'état de En Piste => Garage");
        avion.state = new EtatAuGarage(avion);
    }

    @Override
    void executeDecoller() {
        System.out.println("Transition d'état de En Piste => Décollage");
        avion.state = new EtatEnLair(avion);
    }

    @Override
    void executeAterir() {
        System.out.println("Impossible je suis déja en piste");
    }

    @Override
    void executeDoActivity() {
        for (int i=0; i < 10 ; i++) {
            System.out.println("Activité de l'état en piste ....." + i);
        }
    }
}
