package typeConversion;

import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        String input = scanner.nextLine();

        // convert to int
        int intNumber = Integer.parseInt(input);
        System.out.println(intNumber);


        //convert int to double

        double doubleNumber = Double.parseDouble(input);
        System.out.println(doubleNumber);

    }
}
