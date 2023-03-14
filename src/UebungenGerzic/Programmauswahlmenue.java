package UebungenGerzic;

import java.util.Scanner;

public class Programmauswahlmenue {
    public static void main(String[] args) {

        // Nummer 1 und 3 noch offen!!!!


        int eingabe = 0;


        while (eingabe != 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Waehlen Sie bitte  eine Option indem Sie die Zahl der Option eingeben: ");
            System.out.println("1. Umgekehrte Stringausgabe");
            System.out.println("2. Pruefen ob eine Zahl gerade oder ungerade ist");
            System.out.println("3. Vokale zaehlen");
            System.out.println("4. Fakultaet berechnen");
            System.out.println("5. Exit");
            eingabe = scanner.nextInt();

            switch (eingabe) {


                case 1: // Wort Buchstaben umdrehen
                    System.out.println("Geben Sie eine Zeichenfolge ein: ");
                    Scanner scanner2 = new Scanner(System.in);
                    String zeichenfolge = scanner.nextLine();
                    int laenge = zeichenfolge.length();
                    System.out.println(laenge);
                    int i = 0;
                    for (i = laenge - 1; i >= 0; i--) {
                        System.out.println(zeichenfolge.charAt(i));
                    }

                    break;

                case 2:
                    System.out.println("Geben Sie eine ganze Zahl ein:");
                    int pruefzahl = scanner.nextInt();
                    int pruefung = pruefzahl % 2;
                    if (pruefung == 0) {
                        System.out.println("Die Zahl ist gerade.");
                    } else System.out.println("Die Zahl ist nicht gerade.");


                    break;

                case 3:      // Vokale zählen
                    System.out.println("Geben Sie einen Satz ein: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String satz = scanner1.next();

                    int anzahlVokale = satz.length();
                    System.out.println(anzahlVokale);

                    //anzahlVokale =
                    // satz.contains('a', 'e', 'i', 'o', 'u');

                    break;

                case 4:  //Fakultät von n
                    System.out.println("Geben Sie eine positive ganze Zahl ein: ");
                    Scanner scanner3 = new Scanner(System.in);
                    double zahl1 = scanner.nextDouble();
                    System.out.println(zahl1);


                    double fakultaet = 0;
                    double zahl2 = 1;

                    for (int a =1; a <= zahl1; a++) {
                        zahl2 = zahl2 * a;

                    }
                    System.out.println("Die Fakultät von " + zahl1 + " ist " + zahl2);

                    break;

                case 5:
                    System.out.println("Das Programm wird beendet.");
                    break;

                default:
                    System.out.println("Diese Zahl ist keine Option. Versuchen Sie es erneut. ");
                    eingabe = scanner.nextInt();

            }

        }
    }
}
