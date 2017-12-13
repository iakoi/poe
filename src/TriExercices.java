import java.util.Arrays;

public class TriExercices {

    public static void main(String[] args) {
        int[] tab = {10, 2, 4, 6, 6, 16, 0, 0}; // entiers positifs;
        System.out.println(Arrays.toString(tab));

        trierParSelection(tab);

        System.out.println(Arrays.toString(tab));
    }

    private static void trierParSelection(int[] tab) {
        for (int indiceFinTableau = tab.length - 1; indiceFinTableau > 0; indiceFinTableau--) {
            int indicePlusGrandNombre;
            indicePlusGrandNombre = rechercherIndicePlusGrandNombre(tab, indiceFinTableau);
            inverserLesCasesDuTableau(tab, indicePlusGrandNombre, indiceFinTableau);
        }

    }

    /**
     * rechercher dans tableau l'indice du plus grand nombre en ne prenant
     * en compte que les case de 0 à 'unIndice'
     *
     * @param unTableau le tableau dans lequel chercher
     * @param unIndice  l'indice du tableau jusqu'auquel on recherche le plus grand nombre
     * @return l'indice du plus grand nombre ou -1 si non trouvé
     */
    private static int rechercherIndicePlusGrandNombre(int[] unTableau, int unIndice) {
        int indicePlusGrandNombreTrouve;
        if (unIndice < unTableau.length && unIndice > 0) {
            indicePlusGrandNombreTrouve = 0;
            for (int i = 1; i <= unIndice; i++) {
                if (unTableau[indicePlusGrandNombreTrouve] < unTableau[i]) {
                    indicePlusGrandNombreTrouve = i;
                }
            }
        } else {
            indicePlusGrandNombreTrouve = -1;
        }
        return indicePlusGrandNombreTrouve;
    }

    private static void inverserLesCasesDuTableau(int[] unTableau, int unIndice, int unAutreIndice) {
        int temp = unTableau[unIndice];
        unTableau[unIndice] = unTableau[unAutreIndice];
        unTableau[unAutreIndice] = temp;
    }
}
