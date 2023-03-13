package uebung0603;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("gib eine Nummer ein");
        int zahl = scanner.nextInt();

        doCountDown(zahl);

    }

    public static void doCountDown (int n) {
        if (n != 0) {
            System.out.println(n);
            n--;
            doCountDown(n);

        }
        else {

            System.out.println(n);
        }

    }

}
