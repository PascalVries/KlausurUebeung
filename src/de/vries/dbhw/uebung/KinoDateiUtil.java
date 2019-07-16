package de.vries.dbhw.uebung;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KinoDateiUtil {


    public Kino loadKino() throws IOException {
        Kino kino = new Kino();
        Pattern p = Pattern.compile("(.+)---([0-9]+)");
        Path path = Paths.get("daten.txt");
        System.out.println(path);
        List<String> content = Files.readAllLines(path);
        for (String filmString:content) {
            Matcher m = p.matcher(filmString);
            m.matches();
            String titel = m.group(1);
            int dauer = Integer.parseInt(m.group(2));
            kino.addFilm(new Film(dauer,titel));
        }
        return kino;
    }

    public static void saveKino(Kino kino){
        List<Film> filme = kino.getFilmNachLaenge();
        Film kurz = kino.getKuerzesterFilm();
        Film lang = kino.getLaengsterFilm();
        String filmLine = "%25s %1s %5s\n";
        for (Film film:filme) {
            System.out.printf(filmLine, film.getTitel() , " : " , film.getZeit());
        }
        System.out.println("Informationen");
        System.out.println("Längste Spieldauer  : " + lang.getTitel() +" (" + lang.getZeit()+")");
        System.out.println("Kürzeste Spieldauer : " + kurz.getTitel() +" (" + kurz.getZeit()+")");
        System.out.println("Durchschnittliche Spieldauer : " + kino.getDurchschnittlicheDauer());
    }
}
