package exercice4;

public class ProgrammeSportif {
    public static void main(String[] args) {
        try {
            Athlete ath = new Athlete("Jean");
            AthleteElite elite = new AthleteElite("Pierre");

            System.out.println("🔹 État initial :");
            ath.afficherInfos();
            elite.afficherInfos();

            System.out.println("\n🏋️‍♂️ Entraînement et nutrition :");
            ath.entrainement();
            ath.manger();
            elite.entrainement();
            elite.manger();

            System.out.println("\n😴 Temps de repos :");
            ath.repos();
            elite.repos();

            System.out.println("\n🔹 État final :");
            ath.afficherInfos();
            elite.afficherInfos();

            // Test avec un nom invalide
            // Athlete ath2 = new Athlete(""); // Provoquera une exception

        } catch (NomInvalideException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
