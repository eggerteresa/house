package DatentypUebung;

import java.util.Scanner;

public class UebungModulo {
    public static void main(String[] args) {
        //int firstNumber = 17;
        //int secondNumber= 3;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( " Type in a number: ");
//        int number1 = scanner.nextInt();
//


//        int result = number1 % 3;
//
//        if (result == 0) {
//            System.out.println("The number "+ number1 + " is divisible by 3."); }
//            else {System.out.println("The number " + number1 + " is not divisible by 3.");}
//
//            Scanner scanner1 = new Scanner(System.in);
//            System.out.println("Type in another number: ");
//            int number2 = scanner1.nextInt();
//
//            int result2 = number2 %3;
//            if (result2 == 0) {
//                System.out.println(" The number " + number2 + " is divisible by 3.");}
//            else {
//                System.out.println("The number" + number2 + " is not divisible by 3.");}
//
//
//        int number = 2;
//           // number +=2;
//        number = number +2;
//
//
//
//        System.out.println(number);

        int dividend = 17;
        int divisor = 9;
        int resultofDivisible = isDivisible(dividend, divisor);

//        System.out.println(resultofDivisible);
//        System.out.println(isDivisible(18, 9));


        int dividend2 = 12;
        int divisor2 = 9;
        int resultofDivisible2 = isDivisible(dividend2, divisor2);

        if (resultofDivisible != 0) {
            System.out.println(dividend2 + " is divisible by " + divisor2);
        } else System.out.println(dividend2 + " is not divisible by " + divisor2);

    }


    public static int isDivisible(int dividend2, int divisor2) {
        int restFromDivision = dividend2 % divisor2;
        int returnValue = 0;


        if (restFromDivision == 0) {
            returnValue = dividend2;
        }        // oder return dividend;
        //else return 0; (ist eine Ausgabe, heißt nicht dividierbar
        return returnValue;


    }


}
