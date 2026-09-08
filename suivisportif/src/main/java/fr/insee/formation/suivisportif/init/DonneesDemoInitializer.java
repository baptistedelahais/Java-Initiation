package fr.insee.formation.suivisportif.init;

import fr.insee.formation.suivisportif.service.SuiviSportifService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Ajoute quelques athlètes et séances de démonstration au démarrage,
 * pour que l'appli ne soit pas vide quand les stagiaires la lancent
 * (comme une appli réelle sur laquelle on arrive avec des données déjà existantes).
 */
@Component
public class DonneesDemoInitializer implements CommandLineRunner {

    private final SuiviSportifService service;

    public DonneesDemoInitializer(SuiviSportifService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) {
        service.ajouterAthlete("Alice");
        service.enregistrerSeance("Alice", "Planche", 12);
        service.enregistrerSeance("Alice", "Planche", 16);
        service.enregistrerSeance("Alice", "Front Lever", 8);

        service.ajouterAthlete("Bob");
        service.enregistrerSeance("Bob", "One Arm Handstand", 5);
        service.enregistrerSeance("Bob", "Front Lever", 10);
    }
}
