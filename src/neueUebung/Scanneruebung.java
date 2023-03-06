package neueUebung;

import java.util.Scanner;

public class Scanneruebung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Methode verwenden und als neue variable abspeichern
        System.out.println("Please enter something"); //bestimmt Ausgabe
        int number = scanner.nextInt(); // speichert unser Ergebnis


       Katze mieze = new Katze( true,true,"Grey", 4);
       Katze schnurrbert = new Katze( true,true,"Brwon", 4);
        Katze cookie = new Katze( true,true,"red", 4);
        Katze tiger = new Katze( true,true,"red striped", 4);

        String miezeSpeak = mieze.speak ();
        System.out.println(miezeSpeak);

        System.out.println(schnurrbert.speak());
    }
}
