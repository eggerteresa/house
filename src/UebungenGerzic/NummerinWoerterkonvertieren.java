package UebungenGerzic;

import java.util.Scanner;

public class NummerinWoerterkonvertieren {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein, zwischen 1 und 10 (einschließlich): ");
       int zahl = scanner.nextInt();


        while (zahl <=0 || zahl >10)
             {
                 Scanner scanner1 = new Scanner(System.in);
                 System.out.println("Ungültige Zahl eingegeben, Bitte geben Sie eine Zahl zwischen 1 und 10 (einschließlich) ein. ");

                zahl = scanner1.nextInt();
        }



        switch (zahl) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("Sie haben wohl eine falsche Zahl eingegeben.");
        }


    }
}
