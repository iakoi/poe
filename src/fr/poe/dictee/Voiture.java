package fr.poe.dictee;

public class Voiture {
    String marque;
    Volant volant;
    Roue[] roues;

    public void afficherDetails() {
        System.out.println("marque : " + marque);
        System.out.println("volant : " + volant.matiere);
    }

}
