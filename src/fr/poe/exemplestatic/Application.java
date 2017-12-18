package fr.poe.exemplestatic;

public class Application {

    public static void main(String[] args) {
        Cercle c1 = new Cercle();
        c1.rayon = 4;

        Cercle c2 = new Cercle();
        c2.rayon = 2;

        System.out.println("La surface de c1 est " + c1.surface());
        System.out.println("La surface de c2 est " + c2.surface());
        System.out.println(Cercle.pi);

        Cercle.pi = 3;
        System.out.println(Cercle.pi);

        System.out.println("La surface de c1 est " + c1.surface());
        System.out.println("La surface de c2 est " + c2.surface());

    }
}
