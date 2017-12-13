import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {


        System.out.println(4 % 3);

        int a = 1;
        int b = 2;
        a = b; // a->2, b->2
        a = a + 1; // a->3, b->2
        b = a++; // a->4, b->3
        b = ++a; // a->5, b->5


        int indice = 0; // on initialise i à 0
        while (indice < 10) { // tant que i est inférieur à 10
            System.out.println(indice + " ne vaut pas 10");
            indice = indice + 1; // on incrémente i de 1
        }
        System.out.println(indice); // "10"

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ne vaut pas 10");
        }

        int i = 0;
        do {
            i++;
        }
        while (i < 10);

        int tableauEntier[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int current : tableauEntier) {
            System.out.println(current);
        }


        List<String> villes = new ArrayList<>();

        switch(4) {
            default:
            case 3:
                break;
        }

        villes.add("Rennes");
        villes.add("Brest");
        System.out.println(villes.get(0)); // "Rennes"
        System.out.println(villes.size()); // 2

        // i n'est plus accessible ici


        int addition = 2 + 3;

    }

    public static int addition(int unEntier, int unAutreEntier) {
        return unEntier + unAutreEntier;
    }
}
