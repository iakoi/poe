package fr.poe.garage;

public class Application {

    public static void main(String[] args) {

        Voiture voiturePuissante;
        voiturePuissante = new Voiture("", "");
        voiturePuissante.marque = "Opel";
        voiturePuissante.modele = "Corsa";

        Voiture v2 = new Voiture("Toyota", "Auris");
        System.out.println(v2.marque);
        Moteur m1 = new Moteur();
        m1.puissance = 600;

        voiturePuissante.moteur = m1;

        Roue[] roues = new Roue[4];
        for (int i = 0; i <= 3; i++) {
            Roue roue = new Roue();
            roue.typePneu = "firestone";
            roues[i] = roue;

        }
        voiturePuissante.roues = roues;

        System.out.println(voiturePuissante.marque);

    }
}
