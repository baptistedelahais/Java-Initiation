package Zoo;

// Classe principale Main
public class Main {
    public static void main(String[] args) {
        // Création du zoo
        Zoo monZoo = new Zoo("Safari Land");

        // Création des animaux avec un âge maximum
        Animal lion = new Animal("Simba", "Lion", 3, 10);
        Animal elephant = new Animal("Dumbo", "Éléphant", 5, 15);
        Animal girafe = new Animal("Melman", "Girafe", 7, 12);

        // Ajout des animaux au zoo
        monZoo.ajouterAnimal(lion);
        monZoo.ajouterAnimal(elephant);
        monZoo.ajouterAnimal(girafe);

        // Affichage des animaux du zoo
        monZoo.afficherAnimaux();

        // Simulation du passage du temps (plusieurs années)
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Année " + (i + 1) + " ---");
            monZoo.faireVieillirTous();
            monZoo.afficherAnimaux();
        }
    }
}
