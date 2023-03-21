package SchleifenUebungen;

public class Schleifen {
    public static void main(String[] args) {

        int zahl = 1;
        boolean zaehler = true;


        while (zaehler ==true) {
            System.out.println(" Nummer " + zahl);
            if (zahl == 10) {
                zaehler = false;
            }
            zahl ++;
        }




    }
}
