package fr.insee.formation.suivisportif.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Athlete {

    private String nom;
    private int force = 50;
    private final List<Seance> seances = new ArrayList<>();

    public Athlete(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new NomInvalideException("Le nom de l'athlète ne peut pas être vide ou null !");
        }
        this.nom = nom;
    }

    public void ajouterSeance(Seance s) {
        seances.add(s);
        augmenterForce(2); // une séance de plus, un tout petit gain de force
    }

    private void augmenterForce(int gain) {
        this.force = Math.min(100, this.force + gain);
    }

    // Utilise un Stream pour retrouver la séance la plus longue sur une figure donnée
    public Optional<Seance> meilleureSeance(String figure) {
        return seances.stream()
                .filter(s -> s.getFigure().equalsIgnoreCase(figure))
                .max(Comparator.comparingInt(Seance::getDureeSecondes));
    }

    // Temps total toutes séances confondues (calculé mais pas encore affiché sur la page - voir Ticket 2)
    public int tempsTotalSecondes() {
        return seances.stream()
                .mapToInt(Seance::getDureeSecondes)
                .sum();
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public List<Seance> getSeances() {
        return seances;
    }
}
