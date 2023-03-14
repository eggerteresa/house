package UebungenGerzic;

import java.util.Scanner;

public class Eingabeaufforderung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();

        System.out.println("Geben Sie jetzt Ihr Alter ein: ");
        String alter = scanner.nextLine();

        System.out.println("Hallo, " + name + "! Du bist " + alter +" Jahre alt. ");
    }
}
