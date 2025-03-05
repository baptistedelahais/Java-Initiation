package exercice4;
public class AthleteElite extends Athlete {

    public AthleteElite(String nom) {
        super(nom);
    }

    @Override
    public void entrainement() {
        setForce(getForce() + 20);
        System.out.println(nom + " (Élite) s'entraîne et gagne 20 points de force !");
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
