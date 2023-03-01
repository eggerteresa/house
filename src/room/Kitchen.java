package room;

public class Kitchen {
    public static void main(String[] args) {
        int zahl = 10;
        float nummer2 = 1.22222222f;
        double nummer3 = 3.58571837241374683745873467582649875269847587465982347659827459827587264597295;
        String Ziffernkolonne = "wir rechnen mit einem Haufen Variablen.";
        double nummer23 = (nummer3 * nummer2);

        System.out.println(Ziffernkolonne + " nummer 2 mal nummer 3 ist gleich " + nummer23 + " durch 10 ist gleich " + (nummer23 / zahl));

        int toepfe = 30;
        int deckel = 25;
        System.out.println("wir haben in unserer Küche " + toepfe + " Töpfe und " + deckel + " Deckel. Das ergibt " + (toepfe - deckel) + " unvollständige Garnituren und " + deckel + " ganze Garnituren.");

        double topfpreis = 29.90;
        double deckelpreis = 10.99;
        System.out.println(" ein Topf kostet " + topfpreis + ". wenn wir 30 Töpfe kaufen, kostet das " + (toepfe * topfpreis) + " €. ");
        System.out.println(" Wenn wir die Garnituren wieder vervollständigen wollen, müssen wir " + (toepfe - deckel) + " Deckel nachkaufen. Dies kostet " + (5 * deckelpreis) + "€.");

        String window = "Herbert";
        String fridge = "Friesbert";
        String table = "Thomas";
        String microwave = "Gisela";
        float kitchenSize = 145.53f;
        int windows = 120;
        String doorColour = "pink and green stripes";

        System.out.println("this is the kitchen");
        int cups = 3;
        System.out.println( " The window is called " + window + " and the table is called " + table + ", the microwave is called " + microwave);
    }


}
