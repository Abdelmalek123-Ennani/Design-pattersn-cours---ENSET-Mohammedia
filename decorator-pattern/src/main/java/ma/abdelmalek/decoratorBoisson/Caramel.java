package ma.abdelmalek.decoratorBoisson;

import ma.abdelmalek.composants.Boisson;

public class Caramel extends DecoratorBoisson {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }

    @Override
    public double cout() {
        return 0.8 + boisson.cout();
    }
}
