package de.vries.dbhw.uebung;

public class KinoFactory {
    public static Kino getKino(){
        String[] daten = {"Dr. Schiwago---300", "Ghostbusters---104", "Charade---99", "Toy Story---99", "Jenseits von Afrika---238", "Die tönende Wochenschau---15"};

        KinoDateiUtil factory = new KinoDateiUtil(daten);

        return  factory.loadKino();
    }
}
