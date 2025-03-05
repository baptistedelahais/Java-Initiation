package exercice3;

public class TestPersonne {
    public static void main(String[] args) {
        // Création d'un objet de type Personne
        Personne personne1 = new Personne("Alice", 30);

        // Utilisation des méthodes
        personne1.afficherInfo(); // Affiche : Nom : Alice, Âge : 30
        personne1.anniversaire(); // Affiche : Joyeux anniversaire, Alice! Vous avez maintenant 31 ans.
    }
}