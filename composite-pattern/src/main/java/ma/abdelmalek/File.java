package ma.abdelmalek;

public class File extends Composant{
    public int data=0;
    @Override
    public void open() {
        System.out.println("This file is opened.");
    }
}