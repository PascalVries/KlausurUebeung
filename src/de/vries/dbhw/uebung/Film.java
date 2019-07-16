package de.vries.dbhw.uebung;

public class Film{
    private int zeit;
    private String titel;

    public Film(int zeit, String titel){
        this.zeit = zeit;
        this.titel = titel;
    }

    public int getZeit() {
        return zeit;
    }

    public String getTitel() {
        return titel;
    }

}
