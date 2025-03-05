package exercice4;

public class Athlete implements Entrainable {
    protected String nom;
    private int force;

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
        setForce(this.force + 10);
        System.out.println(nom + " s'entraîne et gagne 10 points de force !");
    }

    public void manger() {
        setForce(this.force + 5);
        System.out.println(nom + " mange et gagne 5 points de force !");
    }

    public void repos() {
        setForce(this.force + 5);
        System.out.println(nom + " se repose et récupère 5 points de force.");
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
