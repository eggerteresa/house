package SchleifenHausuebung;

public class FibonacciZahlen {
    public static void main(String[] args) {
        int summe = 0;
        int zahl = 1;
        for (int i = 0; i<10; i++) {

            zahl = zahl + summe; // man könnte auch mit 3 variablen arbeiten : davor, aktuell, danach und dann die Werte zuweisen
            summe = summe + zahl; //
            System.out.println(zahl);
            System.out.println(summe);
        }

    }
}

