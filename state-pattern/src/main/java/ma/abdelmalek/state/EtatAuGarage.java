package ma.abdelmalek.state;

public class EtatAuGarage extends State{

    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Transition d'état de Garage => Piste");
        avion.state = new EtatEnPiste(avion);
    }

    @Override
    void executeEntrerGarage() {
        System.out.println("Impossible, je suis déja au garage");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller, je suis au garage");
    }

    @Override
    void executeAterir() {
        System.out.println("Impossible d'éttérir, je suis dèja au garage");
    }

    @Override
    void executeDoActivity() {
        for (int i=0; i < 10 ; i++) {
            System.out.println("Activité de l'état au Garage ...." + i);
        }
    }
}
