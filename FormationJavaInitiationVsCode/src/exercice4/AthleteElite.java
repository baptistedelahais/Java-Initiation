package exercice4;

import java.util.Random;

public class AthleteElite extends Athlete {

    public AthleteElite(String nom) {
        super(nom);
    }

    @Override
    public void entrainement() {
        double chance = new Random().nextDouble(); // Valeur entre 0 et 1

        if (chance < 0.8) { // 80% de chance de réussir
            setForce(this.getForce() + 15);
            System.out.println(nom + " s'entraîne intensément et gagne 15 points de force !");
        } else { // 20% de risque de blessure
            seBlesse();
        }
    }

    @Override
    public void manger() {
        setForce(getForce() + 10);
        System.out.println(nom + " (Élite) mange et gagne 10 points de force !");
    }

    @Override
    public void repos() {
        setForce(getForce() + 10);
        System.out.println(nom + " (Élite) se repose et récupère 10 points de force.");
    }
}
