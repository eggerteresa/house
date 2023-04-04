package neueUebung;

import java.util.Scanner;

public class TamagochiKlasse {

    private int xKoordinate;
    private int yKoordinate;
    private int futterstand = 5;

    public TamagochiKlasse(int xKoordinate, int yKoordinate, int futterstand) {
        this.xKoordinate = xKoordinate;
        this.yKoordinate = yKoordinate;
        this.futterstand = futterstand;
    }

    public int getxKoordinate() {
        return xKoordinate;
    }

    public int getyKoordinate() {
        return yKoordinate;
    }

    public int getFutterstand() {
        return futterstand;
    }

    public void setxKoordinate(int xKoordinate) {
        this.xKoordinate = xKoordinate;
    }

    public void setyKoordinate(int yKoordinate) {
        this.yKoordinate = yKoordinate;
    }

    public void setFutterstand(int futterstand) {
        this.futterstand = futterstand;
    }

    //Zusätzlich eine Methode, Koordinaten setzen:

    public void koordinatenSetzen (int xKoordinateneu, int yKoordinateneu) {
        this.xKoordinate= xKoordinateneu;
this.yKoordinate = yKoordinateneu;
}
    public void move() {

        while (futterstand != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wohin soll sich das Tamagochi bewegen? Geben Sie eine Richtung an (links, rechts, oben, unten)");
            String richtung = scanner.next();

            switch (richtung) {

                case "links":

                    yKoordinate--;
                    System.out.println("Das Tamagochi befindet sich aktuell auf y: " + yKoordinate + " und auf x " + xKoordinate);
                    break;
                case "rechts":

                    yKoordinate++;
                    System.out.println("Das Tamagochi befindet sich aktuell auf y: " + yKoordinate + " und auf x " + xKoordinate);
                    break;
                case "oben":

                    xKoordinate++;
                    System.out.println("Das Tamagochi befindet sich aktuell auf y: " + yKoordinate + " und auf x " + xKoordinate);
                    break;
                case "unten":

                    xKoordinate--;
                    System.out.println("Das Tamagochi befindet sich aktuell auf y: " + yKoordinate + " und auf x " + xKoordinate);
                    break;
                default:
                    System.out.println("Geben Sie eine Richtung ein (links, rechts, oben, unten): ");
                    break;

            }
            futterstand--;
            if (yKoordinate == 0 && xKoordinate == 0) {
                System.out.println(" Sie haben Ihr Ziel erreicht. Gratuliere.");
                break;
            }

            if (futterstand == 0) {
                System.out.println(" Der Futterstand ist auf 0, das Tamagochi kann sich nicht bewegen. ");
                System.out.println("Das Tamagochi befindet sich aktuell auf y: " + yKoordinate + " und auf x " + xKoordinate);
                fuettern();
            }


        }

    }


    public void fuettern() {

        getFutterstand();
        System.out.println("Der aktuelle Futterstand beträgt " + futterstand);
        System.out.println("Geben Sie an, wieviel Futter Sie geben möchten: (positive ganze Zahl zwischen 1 und 10)");
        Scanner scanner1 = new Scanner(System.in);
        futterstand = scanner1.nextInt();
        System.out.println("Der neue Futterstand beträgt " + futterstand);

    }


}
