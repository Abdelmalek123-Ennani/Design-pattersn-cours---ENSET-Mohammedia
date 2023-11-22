package ma.abdelmalek;

public class Main {
    public static void main(String[] args) {
        Directory directory=new Directory();
        directory.addComposant(new File());
        for(Composant c : directory.getComposants()){
            c.open();
        }
    }
}