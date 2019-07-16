package de.vries.dbhw.uebung;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class start {
    public static void main(String[] args){
        Kino kino = null;
        try {
            kino = KinoFactory.getKino();
        } catch (FileNotFoundException | NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Some other file exception.");
            e.printStackTrace();
        }
        KinoDateiUtil.saveKino(kino);
    }
}
