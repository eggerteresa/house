package ArrayUebungen;

public class ShoppingCart {
    public static void main(String[] args) {


        String[] items = {"milch", "kaese", "schinken", "suppenwuerfel"};
        double[] preis = {2.5, 4.99, 3.2, 1.9};

        for (int i = 0; i <preis.length; i++){
            System.out.println("Der Preis für " + items[i] + " ist " +preis[i]);
        }



    }
}
