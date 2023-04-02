package UebungenExtraJandl;

import java.util.Scanner;

public class SumsandVowels {
    public static void main(String[] args) {
     //   summenSpiel();
        vokalErkennen();
    }

    static void summenSpiel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine positive ganze Zahl ein ");
        double zahl = scanner.nextDouble();

        double summe = 0;


        while (zahl > 0) {


            if (zahl == 2) {
                summe = summe * 2;
                System.out.println(summe);
            } else if (zahl == 3) {
                summe = summe * 3;
                System.out.println(summe);

            } else if (zahl == 22) {
                summe = summe / 2;
                System.out.println(summe);
            } else {
                summe = summe + zahl;
                System.out.println(summe);
            }

            System.out.println("Geben Sie eine positive ganze Zahl ein ");
            zahl = scanner.nextDouble();
        }
    }

    static void vokalErkennen() {

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Geben Sie einen Buchstaben ein: ");
        String buchstabe = scanner2.next();

        while (!buchstabe.equals("0")) {

            if (buchstabe.equals("a") || buchstabe.equals("e") || buchstabe.equals("i") || buchstabe.equals("o") || buchstabe.equals("u")) {

                System.out.println("Der eingegebene Buchstabe ist ein Vokal.");
                System.out.println("Geben Sie einen Buchstaben ein: ");
                buchstabe = scanner2.next();
            }

              //  if (buchstabe.equals("0")) {
               //     System.out.println("zu Ende");
             //   }

        else {
                    System.out.println("Der Buchstabe ist kein Vokal. Geben Sie einen neuen Buchstaben ein: ");
                    buchstabe = scanner2.next();
                }
            }


        }
    }