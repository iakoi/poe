import java.util.Arrays;

public class DemoTriSelection {

    public static void main(String[] args) {

        int[] tab = {10, 2, 4, 6, 6, 16, 0, 0}; // entiers positifs
        int laDernierePosition;

        System.out.println("le tableau à trier : \n" + Arrays.toString(tab));

        // on souhaite boucler tant que laDernierePosition n'est pas 0
        for (laDernierePosition = tab.length - 1; laDernierePosition >= 0; laDernierePosition--) {


            // rechercher le plus grand nombre ainsi que sa position dans tab
            int laPositionDuPlusGrandNombre = 0;
            int lePlusGrandNombre = tab[laPositionDuPlusGrandNombre];
            for (int i = 1; i <= laDernierePosition; i++) {
                if (tab[i] > lePlusGrandNombre) {
                    lePlusGrandNombre = tab[i];
                    laPositionDuPlusGrandNombre = i;
                }
            }
            System.out.println("la position du plus grand nombre est " + laPositionDuPlusGrandNombre);


            // inverser le plus grand trouvé avec le dernier élément du tableau
            int temp = tab[laDernierePosition];
            tab[laDernierePosition] = tab[laPositionDuPlusGrandNombre];
            tab[laPositionDuPlusGrandNombre] = temp;

            System.out.println(Arrays.toString(tab));
        }
    }
}
