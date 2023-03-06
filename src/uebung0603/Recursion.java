package uebung0603;

public class Recursion {
    public static void main(String[] args) {

        doCountDown(10);

    }

    public static void doCountDown (int n) {
        if (n != 0) {
            System.out.println(n);
            n--;
            doCountDown(n);

        }
        else {

            System.out.println(n);
        }

    }

}
