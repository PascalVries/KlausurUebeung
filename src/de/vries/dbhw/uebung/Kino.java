package de.vries.dbhw.uebung;

import java.util.ArrayList;
import java.util.List;

public class Kino {
    private List<Film> filme;

    public Kino() {
        this.filme = new ArrayList<Film>();
    }

    public void addFilm(Film film) {
        filme.add(film);
    }

    public Film getKuerzesterFilm() {
        Film shortFilm = null;
        for (Film film : filme) {
            if (shortFilm == null) {
                shortFilm = film;
            }
            if (film.getZeit() < shortFilm.getZeit()) {
                shortFilm = film;
            }
        }
        return shortFilm;
    }

    public Film getLaengsterFilm() {
        Film longFilm = null;
        for (Film film : filme) {
            if (longFilm == null) {
                longFilm = film;
            }
            if (film.getZeit() > longFilm.getZeit()) {
                longFilm = film;
            }
        }
        return longFilm;
    }

    public double getDurchschnittlicheDauer() {
        double laenge = 0;
        for (Film film : filme) {
            laenge += film.getZeit();
        }
        laenge = laenge / filme.size();
        return laenge;
    }

    public List<Film> getFilmNachLaenge() {

        return sortFilme();
    }

    private List<Film> sortFilme() {
        filme.sort((o1, o2) -> {
            if (o1.getZeit() < o2.getZeit()) {
                return -1;
            }
            if (o1.getZeit() > o2.getZeit()) {
                return 1;
            } else return o2.getTitel().compareTo(o1.getTitel());
        });
        return filme;
    }
}

