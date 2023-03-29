//package Gerzic200323;
//
//import java.util.Scanner;
//
//public class TicTacToe { //könnte prüfungsangabe sein!!
//    public static void main(String[] args) {
//
//
//
//    }
//
//        public static void tictactoe() {
//
//            int[][] spielfeld = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
//
//            int zeile;
//          int spalte;
//            int aktuellerSpieler = 1;
//            int spielerGewonnen = 0;
//
//
//            int elementcounter = 0;
//
//
//            do {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Geben Sie an, in welcher Zeile Sie ihr Zeichen setzen wollen: (0 -2) ");
//                zeile = scanner.nextInt();
//                System.out.println("Geben Sie an, in welcher Spalte Sie Ihr ZEichen setzen wollen: (0-2)");
//                spalte = scanner.nextInt();
//
//                do {
//                    if (spielfeld[zeile][spalte] ==0) {
//                        spielfeld[zeile][spalte] = aktuellerSpieler;
//
//
//
//                }
//                    while ( true);
//
//
//
//            }
//            while (elementcounter <= 9);
//
//
////        System.out.println("Geben Sie O oder X ein. ");
////       String eintragen = scanner.next();
//
//
//            for (int[] a : spielfeld) {
//                for (int b : a) {
//                    System.out.println(spielfeld);
//                    elementcounter++;
//                }
//            }
//
//
//
//    }
//}
