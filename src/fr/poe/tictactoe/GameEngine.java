package fr.poe.tictactoe;

public class GameEngine {

    public static boolean isGameFinished(int[][] tab) {
        return isThereAWinner(tab) || ArrayUtils.isFull(tab);
    }

    public static boolean isThereAWinner(int[][] tab) {
        boolean thereIsAWinner = false;
        if (!ArrayUtils.isEmpty(tab)) {
            if ((tab[0][0] != 0 && tab[0][0] == tab[0][1] && tab[0][1] == tab[0][2]) ||
                    (tab[1][0] != 0 && tab[1][0] == tab[1][1] && tab[1][1] == tab[1][2]) ||
                    (tab[2][0] != 0 && tab[2][0] == tab[2][1] && tab[2][1] == tab[2][2]) ||
                    (tab[0][0] != 0 && tab[0][0] == tab[1][0] && tab[1][0] == tab[2][0]) ||
                    (tab[0][1] != 0 && tab[0][1] == tab[1][1] && tab[1][1] == tab[2][1]) ||
                    (tab[0][2] != 0 && tab[0][2] == tab[1][2] && tab[1][2] == tab[2][2]) ||
                    (tab[0][0] != 0 && tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2]) ||
                    (tab[2][0] != 0 && tab[2][0] == tab[1][1] && tab[1][1] == tab[0][2])) {
                thereIsAWinner = true;
            }
        }
        return thereIsAWinner;
    }

    public static int[][] newGame() {
        return new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    }


    public static void main(String[] args) {
        // test

        int[][] winningBoard = {{1, 1, 0}, {0, 1, 0}, {0, 0, 1}};

        System.out.println("has win ? " + GameEngine.isThereAWinner(winningBoard));
    }
}
