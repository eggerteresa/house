package Gerzic;

import java.util.Scanner;

public class Schleifen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine positive ganze Zahl eingeben: ");
        int zahl = scanner.nextInt();

        int i = 1;
        int summe = 0;

       while ( i <= zahl ) {
            summe = summe + i;
            i++;
        }
        System.out.println("Die Summe aller Zahlen von 1 bis " + zahl + " ist " + summe);
    }
}
