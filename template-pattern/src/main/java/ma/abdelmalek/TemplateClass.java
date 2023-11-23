package ma.abdelmalek;

public abstract class TemplateClass {
    public double templateMethode(){
        int a = etape1();
        double somme = 0;
        for (int i = 0; i < a; i++) {
            somme += etape2();
        }

        return somme;
    }

    protected abstract int etape1();
    protected abstract int etape2();


}
