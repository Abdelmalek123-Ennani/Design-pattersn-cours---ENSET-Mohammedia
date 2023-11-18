package ma.abdelmalek.state;

public abstract class State {
    protected AvionImpl avion;
    public State(AvionImpl avion) {
        this.avion = avion;
    }
    abstract  void executeSortirDuGarage(); // Opération de transition d'état
    abstract void executeEntrerGarage();   // Opération de transition d'état
    abstract void executeDecoller();       // Opération de transition d'état
    abstract void executeAterir();         // Opération de transition d'état
    abstract void executeDoActivity();     // Activité
}
