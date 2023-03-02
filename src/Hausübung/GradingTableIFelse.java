package Hausübung;

import java.util.Scanner;

public class GradingTableIFelse {

    public static void main(String[] args){



    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the points: ");
    int grade = scanner.nextInt();


    getGrade(grade);

    }
    public static void getGrade(int grade) {

        if  (grade >= 90) {
            System.out.println("Outstanding");

        } else if (90 > grade && grade > 77) {
            System.out.println("Excellent");
        }
        else if (78 > grade && grade > 64) {
            System.out.println("Acceptable");
        }
        else if (65 > grade  && grade > 50) {
            System.out.println("Passing");
        }
        else if (grade <51) {
            System.out.println("Fail");
        }



    }

}
