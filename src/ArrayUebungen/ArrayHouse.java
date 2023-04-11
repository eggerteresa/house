package ArrayUebungen;

public class ArrayHouse {
    public static void main(String[] args) {

        int[][] house = {
                {0, 0, 0, 8, 0, 0, 0},
                {0, 0, 8, 0, 8, 0, 0},
                {0, 8, 8, 8, 8, 8, 0},
                {8, 8, 8, 8, 8, 8, 8},
                {8, 0, 8, 8, 8, 0, 8},
                {8, 8, 8, 0, 8, 8, 8},
                {8, 8, 8, 0, 8, 8, 8,}};

        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[i].length; j++) {
                if (house[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(house[i][j]);
                }

            }System.out.println();
        }
    }
}
