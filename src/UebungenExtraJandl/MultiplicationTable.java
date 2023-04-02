package UebungenExtraJandl;

public class MultiplicationTable {
    public static void main(String[] args) {
multiTable();
    }
    static void multiTable() {

      //  int [] [] zahlenarray = new int[11][11];

        for (int i =10; i <= 20; i++) {
            for (int j = 10; j<=20; j++) {
                System.out.print(" " + i * j);

            }
            System.out.println();
        }

    }
}
