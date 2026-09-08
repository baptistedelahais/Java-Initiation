package fr.insee.formation.suivisportif.model;

import java.time.LocalDateTime;

public class Seance {

    private final String figure;   // ex : "Planche", "Front Lever"
    private final int dureeSecondes;
    private final LocalDateTime date;

    public Seance(String figure, int dureeSecondes) {
        if (figure == null || figure.trim().isEmpty()) {
            throw new IllegalArgumentException("La figure ne peut pas être vide !");
        }
        if (dureeSecondes < 0) {
            throw new IllegalArgumentException("La durée ne peut pas être négative !");
        }
        this.figure = figure;
        this.dureeSecondes = dureeSecondes;
        this.date = LocalDateTime.now();
    }

    public String getFigure() {
        return figure;
    }

    public int getDureeSecondes() {
        return dureeSecondes;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
