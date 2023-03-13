package Gerzic;

import java.util.Scanner;

public class MonatTage {
    public static void main(String[] args) {

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Monatsname eingeben (umlaute ausgeschrieben): ");
        String monat = scanner.next();
        monat = monat.toLowerCase(); //wird sonst nicht gespeichert, variable muss wert neu übernehmen!

        int tage;

        switch (monat) { //geht auch: switch (monat.toLowerCase()) { wenn ich vorher nicht die kleinschreibung in der variable festlege. aber: ist dann nicht gespeichert in der variable sondern nur für switch ok
            case "jaenner":
            case "maerz":
            case "mai":
            case "august":
            case "oktober":
            case "dezember":
            case "juli":
                tage = 31;
                System.out.println("Das Monat " + monat + " hat " + tage + " Tage.");
                break;

            case "februar":
                tage = 28;
                System.out.println("Das Monat " + monat + " hat " + tage + " außer es ist ein Schaltjahr, dann hat es 29 Tage");
                break;

            case "april":
            case "juni":
            case "september":
            case "november":
                tage = 30;
                System.out.println("Das Monat " + monat + "hat " + tage + " Tage.");

                break; //wir benötigen dieses break eig nicht, weil das Programm nicht in eine andere Lösung reinfallen kann.

            default:
                System.out.println("Sie haben den Monat wohl falsch geschrieben. ");
        }
        */

monatstage();
    }


    public static void monatstage () {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bitte Monatsname eingeben (umlaute ausgeschrieben): ");
        String monat2 = scanner2.next();
        monat2 = monat2.toLowerCase(); //wird sonst nicht gespeichert, variable muss wert neu übernehmen!

        int tage;

        if (monat2.equals("jaenner") || monat2.equals("maerz") || monat2.equals("mai") ||monat2.equals("august") ||monat2.equals("oktober") ||monat2.equals("dezember") || monat2.equals("juli")) {
                    System.out.println("Das Monat " + monat2 + "hat 31 Tage. ");
        }
        else if (monat2.equals("februar")) {
            System.out.println("Das Monat " + monat2 + "hat 28 Tage.");
        }
        else System.out.println("Das Monat " + monat2 + "hat 30 Tage.") ;

    }
}
