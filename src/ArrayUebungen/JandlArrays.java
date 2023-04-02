package ArrayUebungen;

public class JandlArrays {
    public static void main(String[] args) {
        int [] neuerArray = new int[] {1, 2, 3, 4, 5};

        for (int i = 0; i< neuerArray.length; i++)
        {
            System.out.println(neuerArray[i]);}



        int [] array2 = new int[] {1, 2, 3, 4, 5};
        array2[2] = 80;
        for (int i = 0; i< array2.length; i++) {
        System.out.println(array2 [i]);}


       // so schaut ein encanced for-Loop aus for (int element : neuerArray)
        int [] [] multidimArray;
        multidimArray = new int[8][3];
        multidimArray[1] = new int[] {1, 1, 1}; // an zweiter Stelle im ersten Array hat es diesen inhalt
        multidimArray[1] [1] = 2; // an Stelle 2, 2, hat es den Wert 2


    }
}
