package ma.abdelmalek;

public interface Observable {
    void addObserver(ObserverImpl o);
    void removeObserver(ObserverImpl o);
    void notifyObservers();
}
