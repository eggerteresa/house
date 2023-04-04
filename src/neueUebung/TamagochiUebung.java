package neueUebung;

public class TamagochiUebung {
    public static void main(String[] args) {

        TamagochiKlasse tamagochi1 = new TamagochiKlasse(2,2,2);


        System.out.println("Die x-Koordinate ist aktuell: " + tamagochi1.getxKoordinate());
        System.out.println("Die y-Koordinate ist aktuell: " +tamagochi1.getyKoordinate() );
        System.out.println("Der aktuelle Futterstand ist: " +tamagochi1.getFutterstand());
        tamagochi1.move();

tamagochi1.koordinatenSetzen(6, 4);


        System.out.println("Die x-Koordinate ist aktuell: " + tamagochi1.getxKoordinate());
        System.out.println("Die y-Koordinate ist aktuell: " +tamagochi1.getyKoordinate() );

        //tamagochi1.fuettern();

        tamagochi1.move();






    }
}
