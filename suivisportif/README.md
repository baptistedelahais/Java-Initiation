# SuiviSportif

Mini application Java (Spring Boot + Tomcat embarqué) support de l'exercice de maintenance
de la formation "Initiation à Java" — INSEE.

## Lancer l'application

Prérequis : JDK 17 et Maven installés (`java -version`, `mvn -version`).

Depuis la racine du projet (là où se trouve `pom.xml`), ouvrez un terminal git bash et lancez : 


```
mvn spring-boot:run
```
vous devez vous trouver sur  ~/Documents/Projet/Java-Initiation/suivisportif (utiliser les commandes cd suivisportif ou cd .. au besoin)

Ou, dans votre IDE :
- **Eclipse** : clic droit sur le projet > Run As > Spring Boot App
- **VS Code** : bouton "Run" au-dessus de la méthode `main` dans `SuiviSportifApplication`

Une fois les logs affichant `Tomcat started on port(s): 8080`, ouvrez :

```
http://localhost:8080
```

Deux athlètes de démonstration (Alice, Bob) sont déjà présents avec quelques séances.

## Arborescence

```
suivisportif/
├── pom.xml
├── README.md
└── src/main/
    ├── java/fr/insee/formation/suivisportif/
    │   ├── SuiviSportifApplication.java   (point d'entrée)
    │   ├── model/                          (Athlete, Seance, exception)
    │   ├── service/                        (logique métier, données en mémoire)
    │   ├── web/                            (contrôleur / routes HTTP)
    │   └── init/                           (données de démo au démarrage)
    └── resources/
        ├── application.properties
        └── templates/accueil.html          (vue Thymeleaf)
```

## Arrêter l'application

`Ctrl+C` dans le terminal où `mvn spring-boot:run` tourne.
