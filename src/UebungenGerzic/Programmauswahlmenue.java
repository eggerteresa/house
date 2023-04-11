package UebungenGerzic;

import java.util.Scanner;

public class Programmauswahlmenue {
    public static void main(String[] args) {


        System.out.println("DAs Ergebnis der Rekursion ist " + recursion(5));

        int eingabe;


        do {
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
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Geben Sie eine Zeichenfolge ein: ");

                    String zeichenfolge = scanner.next();
                    //   System.out.println(zeichenfolge);
//                    int laenge = zeichenfolge.length();
//                    System.out.println(laenge);

                    for (int i = zeichenfolge.length() - 1; i >= 0; i--) {
                        zeichenfolge.charAt(i);
                        System.out.print(zeichenfolge.charAt(i));
                    }
                    System.out.println();


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

                    int anzahlVokale = 0;

                    for (int i = 0; i < satz.length(); i++) {
                        char vok = satz.charAt(i);
                        if (vok == 'a' || vok == 'e' || vok == 'i' || vok == 'o' || vok == 'u') {
                            anzahlVokale++;
                        }

                    }
                    System.out.println("Die Anzahl der Vokale ist " + anzahlVokale);

                    break;

                case 4:  //Fakultät von n
                    System.out.println("Geben Sie eine positive ganze Zahl ein: ");
                    Scanner scanner3 = new Scanner(System.in);
                    int zahl1 = scanner.nextInt();
                    // System.out.println(zahl1);


                    int fakultaet = 0;
                    int zahl2 = 1;

                    for (int a = 1; a <= zahl1; a++) {
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

        } while (eingabe != 5);


    }

    public static int recursion(int zahl) {
        if (zahl == 0) {return 1; }
        else
        {return zahl * recursion(zahl - 1);}
    }
}
