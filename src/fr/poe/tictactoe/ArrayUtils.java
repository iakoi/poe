package fr.poe.tictactoe;

public class ArrayUtils {


    public static boolean isEmpty(int[][] tab) {
        boolean isEmpty = true;
        for (int i = 0; i < tab.length && isEmpty; i++) {
            for (int j = 0; j < tab[i].length && isEmpty; j++) {
                if (tab[i][j] != 0) {
                    isEmpty = false;
                }
            }
        }
        return isEmpty;
    }

    public static String toString(int[][] tab) {
        String str = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                str += "[" + tab[i][j] + "]";
            }
            str += "\n";
        }
        return str;
    }


    public static boolean isFull(int[][] tab) {
        boolean isFull = true;
        for (int i = 0; i < tab.length && isFull; i++) {
            for (int j = 0; j < tab[i].length && isFull; j++) {
                if (tab[i][j] == 0) {
                    isFull = false;
                }
            }
        }
        return isFull;
    }
}
