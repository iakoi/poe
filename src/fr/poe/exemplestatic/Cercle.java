package fr.poe.exemplestatic;

public class Cercle {
    static double pi = 3.1415;
    int rayon;

    public double surface() {
        return rayon * rayon * Cercle.pi;
    }
}
