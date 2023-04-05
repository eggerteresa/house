package Tictactoe;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {

        spielablauf();        // erstelle einen 2-D array, um das Tictactoe-Brett zu repräsentieren, 3 Spalten, 3 Zeilen
        //int [] [] array = new int [3] [3];


// initialisieren der Elemente im Array s.o.


    }

    // Schleife für aktuellen Zustand des Brettes
    public static void spielablauf() {


        int[][] array =
                {{0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}};

        System.out.println("Der aktuelle Spielstand ist: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        int zeile;
        int spalte;

        int spieler1 = 1;
        int spieler2 = 2;
        int counter = 1;



        // Methode gib Zeile und Spalte ein, überprüfen, ob ausgewähltes Feld bereits belegt ist


        while (counter <= 10) {
            int i =0;
            int j = 0;
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Geben Sie die Zeile an (0, 1, 2) ");

            zeile = scanner1.nextInt();
            System.out.println("Geben Sie die Spalte an (0, 1, 2) ");

            spalte = scanner1.nextInt();

            if (array[i][j] == array[0][0]) {
                if (counter%2!=0) {
                array[zeile][spalte] = spieler1;}
                if (counter%2==0){
                    array[zeile][spalte] = spieler2;}
                counter++;}


                if ( array[i][j] != array[0][0]) {
                    System.out.println("Wählen Sie ein anderes Feld aus, dieses ist schon belegt.");
                }

            for ( i = 0; i < array.length; i++) {
                for ( j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }


                    if (array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1) {
                        System.out.println(" Spieler 1 hat gewonnen");
                        break;
                    }
                    if (array[0][0] == 2 && array[1][1] == 2 && array[2][2] == 2) {
                        System.out.println(" Spieler 2 hat gewonnen");
                        break;
                    }

                    if (array[0][0] == 1 && array[1][0] == 1 && array[2][0] == 1) {
                        System.out.println(" Spieler 1 hat gewonnen");
                        break;
                    }
                    if (array[0][0] == 2 && array[1][0] == 2 && array[2][0] == 2) {
                        System.out.println(" Spieler 2 hat gewonnen");
                        break;
                    }

                    if (array[0][1] == 1 && array[1][1] == 1 && array[2][1] == 1) {
                        System.out.println(" Spieler 1 hat gewonnen");
                        break;
                    }
                    if (array[0][1] == 2 && array[1][1] == 2 && array[2][1] == 2) {
                        System.out.println(" Spieler 2 hat gewonnen");
                        break;
                    }

                    if (array[0][2] == 1 && array[1][2] == 1 && array[2][2] == 1) {
                        System.out.println(" Spieler 1 hat gewonnen");
                        break;
                    }
                    if (array[0][2] == 2 && array[1][2] == 2 && array[2][2] == 2) {
                        System.out.println(" Spieler 2 hat gewonnen");
                        break;
                    }

                    if (array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1) {
                        System.out.println(" Spieler 1 hat gewonnen");
                        break;
                    }

                if (array[0][0] == 2 && array[0][1] == 2 && array[0][2] == 2) {
                    System.out.println(" Spieler 1 hat gewonnen");
                    break;
                }
                if (array[1][0] == 1 && array[1][1] == 1 && array[1][2] == 1) {
                    System.out.println(" Spieler 1 hat gewonnen");
                    break;
                }
                if (array[1][0] == 2 && array[1][1] == 2 && array[1][2] == 2) {
                    System.out.println(" Spieler 2 hat gewonnen");
                    break;
                }
                if (array[2][0] == 1 && array[2][1] == 1 && array[2][2] == 1) {
                    System.out.println(" Spieler 1 hat gewonnen");
                    break;
                }
                if (array[2][0] == 2 && array[2][1] == 2 && array[2][2] == 2) {
                    System.out.println(" Spieler 2 hat gewonnen");
                    break;
                }
                else {
                    System.out.println("Das Spiel ist unentschieden!");}






            }
        }
    }


















