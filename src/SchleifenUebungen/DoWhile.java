package SchleifenUebungen;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String korrekt = "geheim";
        String passwort;

        do {
        System.out.println("Geben Sie das Passwort ein: ");
    passwort = scanner.next(); }

        while (!passwort.equals(korrekt)) ;

            System.out.println("Das Passwort ist korrekt");}


    }

