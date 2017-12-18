package fr.poe.garage;

public class Voiture {

    String marque;
    String modele;

    Moteur moteur;
    Roue[] roues;

    public Voiture(String uneMarque, String unModele) {
        marque = uneMarque;
        modele = unModele;
    }


}
