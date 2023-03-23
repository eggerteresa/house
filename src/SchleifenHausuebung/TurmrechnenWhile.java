package SchleifenHausuebung;

import java.util.Scanner;

public class TurmrechnenWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl fuer den Turm eingeben: ");

        int zahl = scanner.nextInt();
        System.out.println(zahl);

        int i = 2;
        int neuezahl =0;
        int j = 2;


        while (i!=10) {
            neuezahl = zahl*i;
            System.out.println(zahl + " * " + i + " = " + neuezahl);
            zahl =neuezahl;
            i++;
            if ( i == 10) {
                while (j!= 10) {

                    neuezahl = zahl/j;
                    System.out.println(zahl + " / " + j + " = " + neuezahl);
                    zahl =neuezahl;
                    j++;

                }
            }

        }


    }
}
