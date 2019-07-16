package de.vries.dbhw.uebung;

public class start {
    public static void main(String[] args) {
        Kino kino = KinoFactory.getKino();
        KinoDateiUtil.saveKino(kino);
    }
}
