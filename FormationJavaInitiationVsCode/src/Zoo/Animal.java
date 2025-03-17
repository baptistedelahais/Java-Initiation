package Zoo;


public class Animal {
    private String nom;
    private String espece;
    private int age;
    private int ageMax; // Âge maximum avant la mort

    // Constructeur
    public Animal(String nom, String espece, int age, int ageMax) {
        this.nom = nom;
        this.espece = espece;
        this.age = age;
        this.ageMax = ageMax;
    }

    // Méthode pour afficher les informations de l’animal
    public void presenter() {
        System.out.println("Je suis " + nom + ", un(e) " + espece + " de " + age + " an(s).");
    }

    // Méthode pour faire vieillir l’animal
    public boolean vieillir() {
        age++;
        if (age >= ageMax) {
            System.out.println(nom + " a atteint l'âge maximum et est mort...");
            return false; // Indique que l'animal doit être supprimé
        } else {
            System.out.println(nom + " a maintenant " + age + " an(s).");
            return true; // Indique que l'animal est toujours en vie
        }
    }

    // Getter pour le nom (utile pour afficher les messages dans Zoo)
    public String getNom() {
        return nom;
    }
}