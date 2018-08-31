package org.betavzw;

import java.util.ArrayList;

public class Film {
    private String filmNaam;
    private String regisseur;
    private String uitgave;
    private String acteurs;

    public Film(String filmNaam, String regisseur, String uitgave, String acteurs) {
        this.filmNaam = filmNaam;
        this.regisseur = regisseur;
        this.uitgave = uitgave;
        this.acteurs = acteurs;
    }

    public String getFilmNaam() {
        return filmNaam;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public String getUitgave() {
        return uitgave;
    }

    public String getActeurs() {
        return acteurs;
    }
}

