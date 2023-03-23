package SchleifenHausuebung;

public class FibonacciTemporaer {
    public static void main(String[] args) {

        int davor = 0;
        int aktuell = 1;

        for (int i = 0; i<20; i++) {
            System.out.print(aktuell + " ");
            int danach = davor + aktuell;

            davor = aktuell;
            aktuell = danach;
        }

    }
}
