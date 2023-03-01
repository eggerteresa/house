package DatentypUebung;

import java.util.Scanner;

public class UebungModulo {
    public static void main(String[] args) {
        //int firstNumber = 17;
        //int secondNumber= 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Type in a number: ");
        int number1 = scanner.nextInt();



        int result = number1 % 3;

        if (result == 0) {
            System.out.println("The number "+ number1 + " is divisible by 3."); }
            else {System.out.println("The number " + number1 + " is not divisible by 3.");}

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Type in another number: ");
            int number2 = scanner1.nextInt();

            int result2 = number2 %3;
            if (result2 == 0) {
                System.out.println(" The number " + number2 + " is divisible by 3.");}
            else {
                System.out.println("The number" + number2 + " is not divisible by 3.");}


        int number = 2;
           // number +=2;
        number = number +2;



        System.out.println(number);





        }








}
