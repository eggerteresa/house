package Gerzic200323;

import java.util.Scanner;

public class TicTacToe { //könnte prüfungsangabe sein!!
    public static void main(String[] args) {

        String[][] werteintragen = new String[3][3];

        int elementcounter = 0;


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie an, in welcher Zeile Sie ihr Zeichen setzen wollen: (0 -2)");
            String zeile  = scanner.next();
            System.out.println("Geben Sie an, in welcher Spalte Sie Ihr ZEichen setzen wollen: (0-2)");
            String spalte = scanner.next();

        }
        while ( elementcounter < werteintragen.length );




//        System.out.println("Geben Sie O oder X ein. ");
//       String eintragen = scanner.next();


        for (String[] a : werteintragen) {
            for (String b : a) {
                System.out.println(werteintragen);
                elementcounter++;
            }
        }





    }
}
