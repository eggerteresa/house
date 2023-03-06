package uebung0603;

public class MultidimensionalArrays { //HeartArrays
    public static void main(String[] args) {

        //arrays können multidimensional sein
        //dh in zwei richtungen z.B. new int [8] [3]

        int[][] heartArray = {
                {0, 1, 0, 0, 0, 1, 0},
                {1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}
        };

        for (int[] row : heartArray) {
            for (int item : row) {
                if (item == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println(); //nach jeder Zeile ein Absatz
        }

    }


}

