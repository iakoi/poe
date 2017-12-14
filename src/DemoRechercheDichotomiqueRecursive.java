import java.util.Arrays;

public class DemoRechercheDichotomiqueRecursive {

    public static void main(String[] args) {
        int[] tab = {0, 2, 5, 59, 79, 101, 102};
        int valeurRecherchee = 0;
        System.out.println(searchDicho(tab, valeurRecherchee));
    }

    public static int searchDicho(int[] tab, int element) {
        int indiceMid = (tab.length) / 2;
        if (tab.length <= 1 && tab[indiceMid] != element) {
            return -1;
        } else if (tab[indiceMid] == element) {
            System.out.println("trouvé");
            return element;
        } else if (tab[indiceMid] > element) {
            int[] leftPart = Arrays.copyOfRange(tab, 0, indiceMid);
            return searchDicho(leftPart, element);
        } else {
            int[] rightPart = Arrays.copyOfRange(tab, indiceMid, tab.length);
            return searchDicho(rightPart, element);
        }
    }
}
