package uebung0603;

public class Arrays {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;


        int[] secondArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < firstArray.length; i++)   { //so lange, wie array lang ist
            int itemInArray = firstArray[i];   //unsere erste Stelle ist 1, das erste mal is i 0
        System.out.println(itemInArray);
    }
        System.out.println("-----------------");

        int [] thirdArray = new int[5];

        thirdArray[1] = 5;



        for(int i=0; i< thirdArray.length; i++) {
            System.out.println(thirdArray[i]);
        }
        System.out.println("--------------");

        for ( int element : firstArray) {
            element = element + 12;
            System.out.println(element);
        }







    }
}
