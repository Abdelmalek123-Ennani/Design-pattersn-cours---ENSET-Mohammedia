package ma.abdelmalek.computer;

public class Ecran implements Vga{
    @Override
    public void print(String message) {
        System.out.println("======== Ecran =======");
        System.out.println(message);
        System.out.println("======== Ecran =======");
    }
}
