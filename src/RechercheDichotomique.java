import java.util.Arrays;

public class RechercheDichotomique {

    public static void main(String[] args) {
        int valeurRecherchee = 101;
        int indiceValeurRecherchee = -1;
        int[] tab = {2, 6, 18, 24, 90, 100, 101};
        int indiceDebut = 0;
        int indiceFin = tab.length - 1;
        boolean end = false;

        System.out.println("on recherche " + valeurRecherchee + " dans le tableau " + Arrays.toString(tab));

        while (!end) {
            int indiceMid;
            if (indiceFin == indiceDebut) {
                indiceMid = indiceDebut;
            } else {
                indiceMid = indiceDebut + ((indiceFin - indiceDebut) / 2);
            }

            int valueMid = tab[indiceMid];

            System.out.println("mid: " + indiceMid + ", indiceDebut: " + indiceDebut + ", indiceFin: " + indiceFin);

            if (valueMid == valeurRecherchee) {
                indiceValeurRecherchee = indiceMid;
                end = true;
            } else if (indiceFin == indiceDebut) {
                end = true;
            } else if (valeurRecherchee > valueMid) {
                indiceDebut = indiceMid + 1;
            } else {
                indiceFin = indiceMid - 1;
            }
        }

        if (indiceValeurRecherchee > -1) {
            System.out.println("valuer trouvée à l'indice: " + indiceValeurRecherchee + "(c'est " + tab[indiceValeurRecherchee] + ")");
        } else {
            System.out.println("la valeur " + valeurRecherchee + " n'est pas dans le tableau " + Arrays.toString(tab));
        }
    }
}
