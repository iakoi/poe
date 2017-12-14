package fr.poe.tictactoe;

import fr.poe.input.UserInteraction;

public class TicTacToe {

    public static void main(String[] args) {

        Player[] players = new Player[2]; // il y a deux joueurs

        String nomJoueur = UserInteraction.ask("Nom du joueur 1 ?");
        Player playerOne = new Player(nomJoueur, 1);

        String nomJoueur2 = UserInteraction.ask("Nom du joueur 2 ?");
        Player playerTwo = new Player(nomJoueur2, 2);

        players[0] = playerOne;
        players[1] = playerTwo;

        int[][] board = GameEngine.newGame();

        System.out.println("the game is ready!");
        System.out.println(ArrayUtils.toString(board));

        Player lastPlayer = null;
        while (GameEngine.isGameFinished(board) == false) {

            for (int i = 0; i < players.length && !GameEngine.isThereAWinner(board); i++) {
                lastPlayer = players[i];
                boolean hasPlayed = false;
                do {
                    int x = Integer.parseInt(UserInteraction.ask(lastPlayer.name + "! the x coordinate please:"));
                    int y = Integer.parseInt(UserInteraction.ask(lastPlayer.name + "! the y coordinate please:"));
                    if (board[x][y] == 0) {
                        board[x][y] = lastPlayer.token;
                        hasPlayed = true;
                    } else {
                        System.out.println("already played here, try elsewhere!");
                    }
                    System.out.println(ArrayUtils.toString(board));
                } while (!hasPlayed);
            }
        }

        // game is finished
        if (GameEngine.isThereAWinner(board)) {
            System.out.println(lastPlayer.name + " has won the game! Congrat' ;)");
        } else {
            System.out.println("And it's a draw game!");
        }

    }
}
