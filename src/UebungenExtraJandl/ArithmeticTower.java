package UebungenExtraJandl;

public class ArithmeticTower {

    public static void main(String[] args) {
        long zahl = 202103;
        System.out.println(zahl);
        for (int i = 2; i < 10; i++) {

            System.out.println(zahl + " * " + i);
            zahl = zahl *i;
        }

        for (int i = 2; i <10; i++) {
            System.out.println(zahl + " / " + i);
            zahl = zahl /i;
        }
        System.out.println(zahl);


    }
}
