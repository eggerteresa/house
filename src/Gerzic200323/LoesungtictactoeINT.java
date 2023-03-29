package Gerzic200323;

import java.util.Arrays;
import java.util.Scanner;

public class LoesungtictactoeINT {

    public static void main(String[] args) {
        ticTacToeMoeglicheLoesung1(); //Ich persoenlich finde dieser einfacher zu verstehen
        //ticTacToeMoeglicheLoesung2(); //wollte Ihnen Zeigen, dass sie auch mit CHAR oder STRING arbeiten koennen
    }

    public static void ticTacToeMoeglicheLoesung1() {
        //Eine andere moegliche Loesung des Spiels TicTactoe

        //Wir legen fuer jedes Feld in unserem TicTacToe fest,
        //dass die Belegung 0 = kein Spieler, 1 = Spieler X, 2 = Spieler O

        //Wir erzeugen ein zweidimensionales int-erledigt.Array um das Feld zu zeichnen und befuellen es mit 0,
        //sodass wir wissen, dass dieses Feld noch nicht von Spielern belegt wurde
        int[][] spielFeld = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        //Achtung: Das erste Feld spielFeld[] = ist die Zeile => also WAAGRECHT
        //Achtung: Das zweite Feld spielfeld[][] = ist die Spalte => also SENKRECHT

        //Hilfsvariable um den Gewinner spaeter zu ermitteln, wir initialisieren als Defaultwert 0, also kein Spieler hat gewonnen
        int spielerGewonnen = 0;
        int aktuellerSpieler = 1; //Spieler 1 = x, Spieler 2 = o -- default Spieler 1
        int zeile;
        int spalte;
        //Um das Spiel nach spaetestens 9 Zuegen zu beenden - also als Teil der Abbruchbedingung falls keiner gewinnt
        int spielCounter = 0;

        //Wir erzeugen einen Scanner fuer den Spielerinput ueber die Konsole
        Scanner input = new Scanner(System.in);

        do {
            //Nun lassen wir unsere Spieler Ihre Felder auswaehlen und holen uns den Input ueber Scanner
            //Das MUSS in der Schleife passieren, weil wir die Spieler ja so oft eingeben wollen, bis das Spiel vorbei ist und nicht nur einmal ;)
            System.out.println("Spieler " + aktuellerSpieler + " bitte gib eine Zeile 0 bis 2 an: ");
            zeile = input.nextInt();
            System.out.println("Spieler " + aktuellerSpieler + " bitte gib eine Spalte 0 bis 2 an: ");
            spalte = input.nextInt();

            do {
                //Falls das ausgewaehlte Feld noch leer ist, sprich es ist gleich 0, dann OK, dann darf er das Feld bespielen -> Raus aus Schleife
                if (spielFeld[zeile][spalte] == 0) {
                    //Dann das Feld auch gleich belegen mit dem aktuellen Spieler
                    spielFeld[zeile][spalte] = aktuellerSpieler;
                    break;
                }
                //Falls das ausgewaehlte Feld schon belegt ist, sprich es ist != 0 -> Dann erneut eingeben und anderes Feld waehlen
                System.out.println("=====!!!!!--- Tut mir leid, das aktuell gewaehlte Feld ist schon belegt ---!!!!!=====");
                System.out.println("=====!!!!!--- Sie muessen ein anderes Feld eingeben!");
                System.out.println("Bitte Spieler " + aktuellerSpieler + " erneut eine Zeile eingeben: ");
                zeile = input.nextInt();
                System.out.println("Bitte Spieler " + aktuellerSpieler + " erneut eine Spalte eingeben: ");
                spalte = input.nextInt();

            } while (true); //nicht schoene Bedingung aber fuer unseren Fall als Beispiel ists ok

            //Nun zeichnen wir das Feld in die Konsole
            for (int[] feld : spielFeld) { //ACHTUNG: wir gehen hier nicht jedes Feld extra durch, sondern nur die erste Dimension des Arrays!
                //..daher wird die Schleife auch nicht 9 Mal durchlaufen sondern nur 3 Mal !!!
                //..denn wir geben hier nur die drei ZEILEN aus
                //wollen wir jedes Feld durchgehen, müssten wir eine verschachtelte Schleife machen
                System.out.println(Arrays.toString(feld));
                System.out.println("-- -- --");
            }

            //Nun preufen wir das Feld Zeile fuer Zeile ob jemand Waagrecht gewonnen hat
            for (int i = 0; i <= 2; i++) {
                //Wir pruefen nun pro Iteration ob pro Zeile das erste Feld links gleich ist wie das mittlere Feld pro Zeile
                //UND ob das erste Feld in der gleichen Zeile auch gleich ist wie das letzte Feld in diese Zeile
                //Mit jeder Schleifen Iteration, preufen wir eine Zeile!
                if (spielFeld[i][0] == spielFeld[i][1] && spielFeld[i][0] == spielFeld[i][2]) {
                    //Sollte in einer Zeile immer das gleiche stehen, dann hat einer der Spieler nun gewonnen und wir
                    //muessen nur noch den Wert eines der Felder wo das zutrifft nun als Sieger bekanntgeben.
                    spielerGewonnen = spielFeld[i][0];
                }
            }

            //Nun pruefen wir das Feld Spalte fuer Spalte ob jemand Senkrecht gewonnen hat
            for (int i = 0; i <= 2; i++) {
                //Wir pruefen nun pro Iteration ob pro SPALTE das erste Feld links gleich ist wie das mittlere Feld pro SPALTE
                //UND ob das erste Feld in der gleichen SPALTE auch gleich ist wie das letzte Feld in diese SPALTE
                //Mit jeder Schleifen Iteration, preufen wir eine der drei SPALTEN von oben nach unten!
                if (spielFeld[0][i] == spielFeld[1][i] && spielFeld[0][i] == spielFeld[2][i]) {
                    //Sollte in einer SPALTE immer das gleiche stehen, dann hat einer der Spieler nun gewonnen und wir
                    //muessen nur noch den Wert eines der Felder wo das zutrifft nun als Sieger bekanntgeben.
                    spielerGewonnen = spielFeld[0][i];
                }
            }

            //Nun pruefen wir die Diagonale von links oben nach rechts unten, ob einer der Spieler hier gewonnen hat
            if (spielFeld[0][0] == spielFeld[1][1] && spielFeld[0][0] == spielFeld[2][2]) {
                //sollte ein Spieler alle drei in einer diagonale haben, dann ist das der Sieger
                spielerGewonnen = spielFeld[0][0];
            }

            //Nun pruefen wir die Diagonale von links UNTEN nach rechts OBEN, ob einer der Spieler hier gewonnen hat
            if (spielFeld[2][0] == spielFeld[1][1] && spielFeld[2][0] == spielFeld[0][2]) {
                //sollte ein Spieler alle drei in einer diagonale haben, dann ist das der Sieger
                spielerGewonnen = spielFeld[2][0];
            }

            //Am Ende des Zuges den Spieler wechseln
            if (aktuellerSpieler == 1) {
                aktuellerSpieler = 2;
            } else {
                aktuellerSpieler = 1;
            }

        } while (spielCounter <= 9 && spielerGewonnen == 0);

        //Finale Ausgabe des Siegers und preufen ob es nicht untentschieden war
        if (spielerGewonnen != 0) {
            System.out.println("=== Gratulation ===");
            System.out.println("Spieler " + spielerGewonnen + " hat das Spiel gewonnen!");
        } else {
            System.out.println("xxx Leider ein Unentschieden ooo");
        }
    }
}