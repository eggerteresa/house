package SchleifenHausuebung;

import java.util.Scanner;

public class Turmrechnen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl fuer den Turm eingeben: ");
        int zahl = scanner.nextInt();
        System.out.println(zahl);

        int zahlneu = 0;


        for (int i = 2; i < 10; i++) {
             zahlneu = zahl * i;
            System.out.println(zahl + " * " + i + " = " + zahlneu);
            zahl = zahlneu; }

            for (int j = 2; j < 10; j++) {

                zahlneu = zahl / j;
                System.out.println(zahl + " / " + j + " =" + zahlneu);
                zahl = zahlneu;

            }
        }
    }






