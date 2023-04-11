package ArrayUebungen;

import java.util.Arrays;

public class JandlMulitdimensionaleArrays {
    public static void main(String[] args) {

        int [] [] array =
                {{1, 1, 1},
            {1, 1, 1},
            {1, 1,1}};

       for (int i = 0; i<array.length; i++) {
           for (int j = 0; j<array[i].length; j++) {
               System.out.print(array[i][j]);
           }
           System.out.println();
       }
        System.out.println();

array[1][1]=9;
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        array[0][0] = 3;
        array[0][2] = 3;
        array[2][0] = 3;
        array[2][2] = 3;


        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }
}
