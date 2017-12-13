

public class DemoRechercheDichotomique {

    public static void main(String[] args) {
        int[] tab = {0, 2, 5, 59, 79, 101, 102};
        int valeurRecherchee = 102;
        int indiceDebut = 0;
        int indiceFin = tab.length - 1;
        int indiceMid = (indiceFin + indiceDebut) / 2;

        while (tab[indiceMid] != valeurRecherchee && indiceFin >= indiceDebut) {
            if (tab[indiceMid] > valeurRecherchee) {
                // on ne s'interesse qu'à la partie gauche de l'espace de recherche
                indiceFin = indiceMid - 1;
            } else {
                // on ne s'interesse qu'à la partie gauche de l'espace de recherche
                indiceDebut = indiceMid + 1;
            }
            indiceMid = (indiceFin + indiceDebut) / 2;
        }
        if (tab[indiceMid] == valeurRecherchee) {
            System.out.println("la valeur à l'indice " + indiceMid + " vaut " + tab[indiceMid]);
        } else {
            System.out.println("404 not found");
        }
    }
}
