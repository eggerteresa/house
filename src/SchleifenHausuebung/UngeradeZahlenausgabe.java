package SchleifenHausuebung;

import java.util.Scanner;

public class UngeradeZahlenausgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine positive ganze Zahl ein: ");
        int geradeZahl = scanner.nextInt();

        for (int i = 1; i<= geradeZahl; i = i+2) {
            System.out.print(i + " ");
        }



    }
}
