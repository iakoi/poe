package fr.poe.dictee;

public class Dictee {

    public static void main(String[] args) {

        Voiture v1 = new Voiture();
        v1.marque = new String("Opel");
        v1.volant = new Volant();
        v1.volant.matiere = "cuir";

        // création de la voiture
        Voiture v2 = new Voiture();
        v2.afficherDetails();
        String marque = "Toyota";

        // création du volant
        Volant volantEnCuir = new Volant();
        String matiereVolant = "cuir";
        volantEnCuir.matiere = matiereVolant;

        // création des roues
        Roue roue1 = new Roue();
        Roue roue2 = new Roue();
        Roue[] tableauDeRoues = new Roue[2];
        tableauDeRoues[0] = roue1;
        tableauDeRoues[1] = roue2;

        // valorisation des attributs de l'objet v2 de type Voiture
        v2.marque = marque;
        v2.volant = volantEnCuir;
        v2.roues = tableauDeRoues;


    }
}
