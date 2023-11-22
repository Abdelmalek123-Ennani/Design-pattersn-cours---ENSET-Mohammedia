package ma.abdelmalek;

import ma.abdelmalek.computer.*;
import ma.abdelmalek.computer.adapter.HdmiVgaAdapter;
import ma.abdelmalek.computer.adapter.HdmiVgaAdapterHeritage;

public class Main {
    public static void main(String[] args) {
        UnitCentre unitCentre = new UnitCentre();
        unitCentre.setVga(new Ecran());
        unitCentre.print("Bonjour");

        unitCentre.setVga(new VideoProjecteur());
        unitCentre.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        unitCentre.setVga(hdmiVgaAdapter);
        unitCentre.print("Bonjour GLSID Design pattern");


        unitCentre.setVga(new SuperVP());
        unitCentre.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        unitCentre.setVga(hdmiVgaAdapter1);
        unitCentre.print("Bonsoir");


        // Adaptateur basé sur l'héritage
        System.out.println("Adapter based on inheritance");
        HdmiVgaAdapterHeritage hdmiVgaAdapterHeritage = new HdmiVgaAdapterHeritage();
        unitCentre.setVga(hdmiVgaAdapterHeritage);
        unitCentre.print("Bonjour GLSID Design pattern");

    }
}