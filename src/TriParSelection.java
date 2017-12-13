import java.util.Arrays;

public class TriParSelection {

    public static void main(String[] args) {
        int[] tab = {0, 18, 2, 4, 1, 1,1,4,0,18};
        System.out.println(Arrays.toString(tab));

        for (int indiceFinTableau = tab.length - 1; indiceFinTableau > 0; indiceFinTableau--) {
            int indicePlusGrandNombre;
            indicePlusGrandNombre = rechercherIndicePlusGrandNombre(tab, indiceFinTableau);
            inverserLesCasesDuTableau(tab, indicePlusGrandNombre, indiceFinTableau);
        }

        System.out.println(Arrays.toString(tab));
    }

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
