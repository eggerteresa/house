package UebungenExtraJandl;

import java.util.Scanner;

public class GradingTable {
    public static void main(String[] args) {
        int points =1;


    getGrade(points);


    }


        public static String getGrade (int points) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie die Punktanzahl ein");
            points = scanner.nextInt();


            String note;

            if (points >= 90) {
                note = "Outstanding";
                System.out.println(note);
            }
            else if (78 <= points && points <= 89 ) {
                note = "Excellent";
                System.out.println(note);
            }
            else if ( 65 <= points && points <= 77) {
                note = "Acceptable";
                System.out.println(note);
            }
            else if (51 <= points && points <= 64) {
                note = "Passing";
                System.out.println(note);
            }
            else {
                note = "Fail";
                System.out.println(note);
            }
        return note;

        }




    }

