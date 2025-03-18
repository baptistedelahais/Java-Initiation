package exercice4;

import java.util.Random;

public class Athlete implements Entrainable {
    protected String nom;
    private int force;
    private Random random = new Random(); // Générateur aléatoire
    // Constructeur avec vérification du nom

    public Athlete(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new NomInvalideException("Le nom d'un athlète ne peut pas être vide ou null !");
        }
        this.nom = nom;
        this.force = 50;
    }

    @Override
    public void entrainement() {
        double chance = random.nextDouble(); // Valeur entre 0 et 1

        if (chance < 0.7) { // 70% de chance de réussite
            setForce(this.force + 10);
            System.out.println(nom + " s'entraîne avec succès et gagne 10 points de force !");
        } else { // 30% de chance de se blesser
            seBlesse();
        }
    }

    public void manger() {
        setForce(this.force + 5);
        System.out.println(nom + " mange et gagne 5 points de force !");
    }

    public void repos() {
        setForce(this.force + 5);
        System.out.println(nom + " se repose et récupère 5 points de force.");
    }

    public void seBlesse() {
        setForce(this.force - 15);
        System.out.println(nom + " s'est blessé et perd 30 points de force !");
    }

    public void afficherInfos() {
        System.out.println(nom + " a une force de " + force);
    }

    // Getters et Setters pour assurer la validité de la force
    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        if (force < 0) {
            this.force = 0;
        } else if (force > 100) {
            this.force = 100;
        } else {
            this.force = force;
        }
    }
}
