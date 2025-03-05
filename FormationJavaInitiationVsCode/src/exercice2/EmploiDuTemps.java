package exercice2;

import java.util.ArrayList;

public class EmploiDuTemps {
    public static void main(String[] args) {
        // 1. Déclaration et initialisation du tableau des membres
        ArrayList<String> membres = new ArrayList<>();
        membres.add("Alice");
        membres.add("Bob");
        membres.add("Charlie");
        membres.add("David");
        membres.add("Eve");

        // 2. Affichage des membres
        System.out.println("Les membres de l'équipe sont :");
        for (String membre : membres) {
            System.out.println(membre);
        }

        // 3. Vérifier si "Alice" est dans l'équipe
        if (membres.contains("Alice")) {
            System.out.println("Alice est dans l'équipe.");
        } else {
            System.out.println("Alice n'est pas dans l'équipe.");
        }

        // 4. Ajouter un nouveau membre
        String nouveauMembre = "Leon";
        membres.add(nouveauMembre);

        // 5. Afficher la nouvelle liste des membres
        System.out.println("\nMise à jour de l'équipe :");
        for (String membre : membres) {
            System.out.println(membre);
        }

        // 6. Afficher le nombre total de membres
        System.out.println("L'équipe compte maintenant " + membres.size() + " membres.");

    }
}
