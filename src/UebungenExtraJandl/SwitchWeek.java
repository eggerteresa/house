package UebungenExtraJandl;

import java.util.Scanner;

public class SwitchWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Geben Sie eine Zahl zwischen 1 und 7 ein.");
        int wochentag = input.nextInt();

        switch (wochentag) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Sie haben wohl eine falsche Ziffer eingegeben.");


        }


    }
}
