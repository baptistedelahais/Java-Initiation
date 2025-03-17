package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private List<Animal> animaux;

    // Constructeur
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    // Méthode pour ajouter un animal au zoo
    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
        System.out.println(animal.getNom() + " a été ajouté au zoo " + nom + ".");
    }

    // Méthode pour afficher tous les animaux du zoo
    public void afficherAnimaux() {
        System.out.println("\nLes animaux du zoo " + nom + " :");
        if (animaux.isEmpty()) {
            System.out.println("Le zoo est vide...");
        } else {
            for (Animal animal : animaux) {
                animal.presenter();
            }
        }
    }

    // Méthode pour faire vieillir tous les animaux et enlever ceux qui meurent
    public void faireVieillirTous() {
        System.out.println("\nTous les animaux du zoo " + nom + " vieillissent...");

        // Nouvelle liste pour stocker les animaux survivants
        List<Animal> survivants = new ArrayList<>();

        // Boucle classique `for`
        for (int i = 0; i < animaux.size(); i++) {
            Animal animal = animaux.get(i);
            if (animal.vieillir()) {
                survivants.add(animal); // L'animal survit, on le garde
            }
        }

        // Mise à jour de la liste du zoo avec les survivants
        animaux = survivants;
    }
}