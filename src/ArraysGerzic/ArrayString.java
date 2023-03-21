package ArraysGerzic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {


        String[] test = new String[100]; // oder int [] test = new int [100];
        int geradeZahl = 2;

        for (int i = 0; i<=99; i++) {
            test[i] = Integer.toString(geradeZahl); // test [i] = geradeZahl;
            System.out.println(test[i]);
            geradeZahl = geradeZahl+2;
        }

       System.out.println(Array.getLength(test)); // gibt Anzahl der Zahlen aus
        System.out.println(Arrays.toString(test)); // verwandelt Inhalt in String und gibt es aus


    }
}
