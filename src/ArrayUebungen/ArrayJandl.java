package ArrayUebungen;

import java.util.Arrays;

public class ArrayJandl {
    public static void main(String[] args) {

printArray(new int[] {1, 2, 3, 4, 5});


        System.out.println();

containsNumber(new int[] {12, 13, 14, 15,16 }, 13);

    }

    public static void printArray(int[] numbers) {

        for (int i = 0; i<numbers.length; i++) {
            System.out.print (numbers[i] + ", ");
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static boolean containsNumber(int[] numbers, int n) {
        boolean enthalten = false;

        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] == n) { enthalten = true;
            }
        }
        System.out.println("Das Ergebnis ist: " + enthalten);

     return enthalten;
    }
}
