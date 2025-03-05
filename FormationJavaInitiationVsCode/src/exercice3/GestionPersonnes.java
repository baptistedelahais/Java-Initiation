package exercice3;

import java.util.ArrayList;

public class GestionPersonnes {
    private ArrayList<Personne> listePersonnes;

    // Constructeur
    public GestionPersonnes() {
        listePersonnes = new ArrayList<>();
    }

    // Méthode pour ajouter une personne
    public void ajouterPersonne(Personne p) {
        listePersonnes.add(p);
    }

    // Méthode pour afficher toutes les personnes
    public void afficherToutesLesPersonnes() {
        for (Personne p : listePersonnes) {
            p.afficherInfo();
        }
    }

    // Méthode pour fêter un anniversaire à une personne spécifique
    public void feterAnniversaire(String nom) {
        for (Personne p : listePersonnes) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                p.anniversaire();
                return;
            }
        }
        System.out.println("Personne non trouvée !");
    }

    public static void main(String[] args) {
        GestionPersonnes gestion = new GestionPersonnes();

        // Création de quelques personnes
        Personne p1 = new Personne("Alice", 30);
        Personne p2 = new Personne("Bob", 25);
        Personne p3 = new Personne("Charlie", 40);
        // Ajout des personnes à la liste
        gestion.ajouterPersonne(p1);
        gestion.ajouterPersonne(p2);
        gestion.ajouterPersonne(p3);
        // Affichage des informations initiales
        System.out.println("\n📌 Liste des personnes :");
        gestion.afficherToutesLesPersonnes();
        // Fêter un anniversaire
        System.out.println("\n🎂 Anniversaire de Bob !");
        gestion.feterAnniversaire("Bob");
        // Affichage après l'anniversaire
        System.out.println("\n📌 Liste mise à jour :");
        gestion.afficherToutesLesPersonnes();
    }
}
