package de.vries.dbhw.uebung;

import java.io.IOException;

public class KinoFactory {
    public static Kino getKino() throws IOException {
        KinoDateiUtil factory = new KinoDateiUtil();
        return  factory.loadKino();
    }
}
