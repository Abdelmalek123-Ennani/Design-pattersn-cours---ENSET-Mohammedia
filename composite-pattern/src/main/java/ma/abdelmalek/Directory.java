package ma.abdelmalek;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Composant{
    private List<Composant> composants=new ArrayList<Composant>();
    public List<Composant> getComposants(){
        return composants;
    }
    public void addComposant(Composant composant){
        composants.add(composant);
    }
    @Override
    public void open() {
        System.out.println("Directory is opened.");
    }
}