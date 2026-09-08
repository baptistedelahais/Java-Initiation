package fr.insee.formation.suivisportif.service;

import fr.insee.formation.suivisportif.model.Athlete;
import fr.insee.formation.suivisportif.model.Seance;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuiviSportifService {

    // Stockage en mémoire : pas de base de données pour cette appli de formation.
    // Les données sont réinitialisées à chaque redémarrage du serveur - c'est normal.
    private final List<Athlete> athletes = new ArrayList<>();

    public List<Athlete> listerAthletes() {
        return athletes;
    }

    public Athlete ajouterAthlete(String nom) {
        Athlete athlete = new Athlete(nom); // peut lever NomInvalideException
        athletes.add(athlete);
        return athlete;
    }

    public void enregistrerSeance(String nomAthlete, String figure, int dureeSecondes) {
        Athlete athlete = athletes.stream()
                .filter(a -> a.getNom().equalsIgnoreCase(nomAthlete))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Athlète inconnu : " + nomAthlete));
        athlete.ajouterSeance(new Seance(figure, dureeSecondes));
    }
}
