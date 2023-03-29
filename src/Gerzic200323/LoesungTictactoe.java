package Gerzic200323;

import java.util.Scanner;

public class LoesungTictactoe {
    public static void main(String[] args) {
        ticTacToeMoeglicheLoesung2();


    }

    public static void ticTacToeMoeglicheLoesung2() {
        char[][] board = new char[3][3]; // 2D-erledigt.Array zur Darstellung des Spielbretts
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X'; // starte mit Spieler X

        // Initialisiere das Brett mit Leerzeichen
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        // Schleife bis zum Spielende
        while (true) {
            // Zeige den aktuellen Zustand des Bretts an
            System.out.println("Aktueller Zustand des Bretts:");
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    System.out.print(board[row][col] + " | ");
                }
                System.out.println();
            }

            // Fordere den Benutzer auf, seinen Zug einzugeben
            System.out.print("Spieler " + currentPlayer + ", gib die Zeile ein (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Spieler " + currentPlayer + ", gib die Spalte ein (0-2): ");
            int col = scanner.nextInt();

            // Aktualisiere das Brett mit dem Zug des Benutzers
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
            } else {
                System.out.println("Dieses Feld ist bereits belegt, versuche es erneut.");
                continue;
            }

            // Überprüfe, ob das Spiel beendet ist
            boolean gameIsOver = false;
            // Überprüfe Zeilen auf Gewinn
            for (int i = 0; i < board.length; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                    gameIsOver = true;
                }
            }

            // Überprüfe Spalten auf Gewinn
            for (int i = 0; i < board[0].length; i++) {
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                    gameIsOver = true;
                }
            }
            // Überprüfe Diagonalen auf Gewinn
            if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
                    (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
                gameIsOver = true;
            }

            // Überprüfe auf Unentschieden
            boolean isTie = true;
            for (row = 0; row < board.length; row++) {
                for (col = 0; col < board[row].length; col++) {
                    if (board[row][col] == ' ') {
                        isTie = false;
                        break;
                    }
                }

                // Zeige das endgültige Brett an
                System.out.println("Endgültiger Zustand des Bretts:");
                for (row = 0; row < board.length; row++) {
                    for (col = 0; col < board[row].length; col++) {
                        System.out.print(board[row][col] + " ");
                    }
                    System.out.println();
                }

                // Beende das Spiel, falls es vorbei ist
                if (gameIsOver) {
                    System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                    break;
                } else if (isTie) {
                    System.out.println("Das Spiel ist unentschieden.");
                    break;
                }

                // Wechsle zum nächsten Spieler
                currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
            }

        }
    }
}
