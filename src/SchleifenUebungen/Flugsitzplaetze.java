package SchleifenUebungen;

public class Flugsitzplaetze {
    public static void main(String[] args) {

        boolean isA380 = true;

        for (int i = 1; i<= 50; i++ ) {

            if (i == 13 || i ==17) {
                continue;
            }

            System.out.println("Reihe " + i);

            if (!isA380 && i == 19) {
                break;
            }

        }


    }
}
