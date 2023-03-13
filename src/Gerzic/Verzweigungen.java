package Gerzic;

import java.util.Scanner;

public class Verzweigungen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Zahl eingeben: ");
        int nummer = scanner.nextInt(); // für jeden Datentyp eigenes next z.B. .nextDouble ...

        if (nummer > 5) {
            System.out.println("Nummer ist größer 5");
        }
        else if (nummer < 5) {
            System.out.println("Nummer ist kleiner 5");
        }
        else { // letztes else kann man weglassen und nur sout schreiben
            System.out.println("Nummer ist wohl gleich 5");
        }

    }
}
