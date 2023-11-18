package ma.abdelmalek.state;

public interface Avion {
    void sortirDuGarage(); // Opération de transition d'état
    void entrerGarage();   // Opération de transition d'état
    void decoller();       // Opération de transition d'état
    void atterir();         // Opération de transition d'état
    void doActivity();     // Activité
}
