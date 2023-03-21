package SchleifenUebungen;

import java.util.Scanner;

public class Summenbildung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein ");
        int zahl = scanner.nextInt();

        int i = 0;
        int summe = 0;


        while (i <= zahl) {
            summe = summe + i;
            i++;

            System.out.println(summe);

        }

        System.out.println("Die Summe der Zahlen von 1 bis "+ zahl +" ist " + summe);

    }

}
