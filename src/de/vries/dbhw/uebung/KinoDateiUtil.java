package de.vries.dbhw.uebung;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KinoDateiUtil {
    private String[] daten;

    public KinoDateiUtil(String[] daten){
        this.daten = daten;
    }

    public Kino loadKino(){
        Kino kino = new Kino();
        Pattern p = Pattern.compile("(.+)---([0-9]+)");
        for (String filmString:daten) {
            Matcher m = p.matcher(filmString);
            m.matches();
            String Titel = m.group(1);
            int Dauer = Integer.parseInt(m.group(2));
            kino.addFilm(new Film(Dauer,Titel));
        }
        return kino;
    }

    public static void saveKino(Kino kino){
        List<Film> filme = kino.getFilmNachLaenge();
        for (Film film:filme) {
            String filmLine = "%25s %1s %5s\n";
            System.out.printf(filmLine, film.getTitel() , " : " , film.getZeit());
        }
    }
}
