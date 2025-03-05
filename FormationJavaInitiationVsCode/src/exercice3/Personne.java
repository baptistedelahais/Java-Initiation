package exercice3;

public class Personne {
    // Attributs privés (Encapsulation)
    private String nom;
    private int age;

    // Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Setter pour le nom (avec validation)
    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            System.out.println("Erreur : Le nom ne peut pas être vide !");
        } else {
            this.nom = nom;
        }
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Setter pour l'âge (avec validation)
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : L'âge ne peut pas être négatif !");
        } else {
            this.age = age;
        }
    }

    // Méthode pour afficher les informations
    public void afficherInfo() {
        System.out.println("Nom : " + nom + ", Âge : " + age);
    }

    // Méthode pour fêter un anniversaire
    public void anniversaire() {
        age++;
        System.out.println("Joyeux anniversaire, " + nom + "! Vous avez maintenant " + age + " ans.");
    }
}