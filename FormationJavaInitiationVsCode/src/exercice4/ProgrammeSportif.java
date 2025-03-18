package exercice4;

public class ProgrammeSportif {
    public static void main(String[] args) {
        try {
            Athlete ath = new Athlete("Jean");
            AthleteElite elite = new AthleteElite("Pierre");

            System.out.println("🔹 État initial :");
            ath.afficherInfos();
            elite.afficherInfos();

            int sessions = 0;

            // Tant que l'un des deux athlètes n'a pas 100 de force, ils continuent à
            // s'entraîner
            while (ath.getForce() < 100 || elite.getForce() < 100) {
                sessions++;
                System.out.println("\n🏋️‍♂️ Entraînement n°" + sessions + " :");

                if (ath.getForce() < 100) {
                    ath.entrainement();
                } else {
                    System.out.println(ath.nom + " a atteint 100 de force et ne s'entraîne plus !");
                }

                if (elite.getForce() < 100) {
                    elite.entrainement();
                } else {
                    System.out.println(elite.nom + " a atteint 100 de force et ne s'entraîne plus !");
                }
            }

            System.out.println("\n🍽️ Nutrition et repos :");
            ath.manger();
            elite.manger();
            ath.repos();
            elite.repos();

            System.out.println("\n🏆 Entraînement terminé en " + sessions + " sessions !");
            System.out.println("🔹 État final :");
            ath.afficherInfos();
            elite.afficherInfos();

        } catch (NomInvalideException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
