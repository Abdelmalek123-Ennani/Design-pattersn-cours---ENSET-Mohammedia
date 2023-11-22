package ma.abdelmalek.computer.adapter;

import ma.abdelmalek.computer.Hdmi;
import ma.abdelmalek.computer.TV;
import ma.abdelmalek.computer.Vga;

public class HdmiVgaAdapterHeritage extends TV implements Vga {
    @Override
    public void print(String message) {
        System.out.println("=========== Adapter ===========");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("========== / Adapter ===========");
    }
}
