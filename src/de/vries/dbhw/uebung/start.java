package de.vries.dbhw.uebung;

import java.io.IOException;

public class start {
    public static void main(String[] args) throws IOException {
        Kino kino = KinoFactory.getKino();
        KinoDateiUtil.saveKino(kino);
    }
}
