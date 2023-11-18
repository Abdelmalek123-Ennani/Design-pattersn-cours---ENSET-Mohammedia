package ma.abdelmalek.state;

public class AvionImpl implements Avion {

    protected State state;

    public AvionImpl() {
        state = new EtatEnPiste(this);
    }
    @Override
    public void sortirDuGarage() {
        state.executeSortirDuGarage();
    }

    @Override
    public void entrerGarage() {
        state.executeEntrerGarage();
    }

    @Override
    public void decoller() {
       state.executeDecoller();
    }

    @Override
    public void atterir() {
       state.executeAterir();
    }

    @Override
    public void doActivity() {
       state.executeDoActivity();
    }


}
