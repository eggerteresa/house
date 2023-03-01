package house;

public class LivingRoom {
    public static void main(String[] args) {
        // squareMeters
        int squareMeters;

        // pricePerSquareMeter

        double pricePerSquareMeter;


        // address
        String address;

        // wieviel kostet das Haus?
        // print the cost of the house (squaremeteres * pricepersquaremeter) at (address).
        squareMeters=102 ;
        pricePerSquareMeter=1500;
        address="St.-Georgen-Gasse 2";

        System.out.println("Wieviel kostet das Haus?");
        System.out.println(("der Preis liegt bei ") + (squareMeters*pricePerSquareMeter) + (" € in ") + address);



    }
}
