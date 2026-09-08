package fr.insee.formation.suivisportif.web;

import fr.insee.formation.suivisportif.service.SuiviSportifService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SuiviSportifController {

    private final SuiviSportifService service;

    public SuiviSportifController(SuiviSportifService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String accueil(Model model) {
        model.addAttribute("athletes", service.listerAthletes());
        return "accueil"; // correspond à src/main/resources/templates/accueil.html
    }

    @PostMapping("/athlete")
    public String ajouterAthlete(@RequestParam String nomAthlete) {
        service.ajouterAthlete(nomAthlete);
        return "redirect:/";
    }

    @PostMapping("/seance")
    public String ajouterSeance(@RequestParam String nom,
                                 @RequestParam String figure,
                                 @RequestParam int duree) {
        service.enregistrerSeance(nom, figure, duree);
        return "redirect:/";
    }

    // Affiche automatiquement le message de toute exception métier (RuntimeException)
    // levée depuis le service, sur la page d'accueil, au lieu d'une erreur 500 brute.
    // Déjà en place : vous n'avez rien à modifier ici pour les futurs tickets.
    @ExceptionHandler(RuntimeException.class)
    public String gererErreurMetier(RuntimeException e, Model model) {
        model.addAttribute("athletes", service.listerAthletes());
        model.addAttribute("erreur", e.getMessage());
        return "accueil";
    }
}

