package ma.abdelmalek.composants;

public abstract class Boisson {
    protected String description;

    public Boisson(){

    }

    public String getDescription() {
        return description;
    }

    public abstract double cout();
}
