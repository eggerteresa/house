package UebungenExtraJandl;

public class DiscountUebung {

    public static void main(String[] args) {

        double seniorDiscount = 0.85;
        double dogDiscount = 0.80;
        double studentDiscount = 0.90;

        double fullPrize = 3.20;
        double fullPrize2DirectionsAll3Bus = fullPrize * 3 * 2;


        double discountedPrizeSenior = busDiscount(true, false, false, fullPrize);
        double discountedPrizeDog = busDiscount(false, false, true, fullPrize);
        double discountedPrizeStudent = busDiscount(false, true, false, fullPrize);

        double discountedPrizeTotalBus = (discountedPrizeDog + discountedPrizeStudent + discountedPrizeSenior) * 2;

        double ersparnisBus = fullPrize2DirectionsAll3Bus - discountedPrizeTotalBus;

        System.out.println("Das Bustticket für alle drei kostet " + discountedPrizeTotalBus + " sie ersparen sich somit " + ersparnisBus);


        int nonFiction = 2;
        int fiction = 2;
        int fullBookPriceNoDiscount = 15 + 18 + 23 + 28;

        System.out.println("der ganze Preis für die Bücher ohne Diskont ist: " + fullBookPriceNoDiscount);

        double fullBookPriceDiscounted = bookDiscount(fullBookPriceNoDiscount, 2, 2);
        double savedMoney = (fullBookPriceNoDiscount - fullBookPriceDiscounted) + ersparnisBus;
        System.out.println("die gesamte Ersparnis ist:" + savedMoney);
        System.out.println("Der gesamte Preis für die Bücher inkl. Diskont beträgt: " + fullBookPriceDiscounted);
        double totalCost = fullBookPriceDiscounted +discountedPrizeTotalBus;


        System.out.println("Die gesamten Kosten für diesen Tag betragen " + totalCost + " die drei haben sich " + savedMoney + " Euro erspart.");

    }

    public static double bookDiscount ( double fullBookPrice, int nonFiction, int fiction) {
        double discountedBookPrice;


        if (nonFiction > 2 && fiction >=1) {
            discountedBookPrice = fullBookPrice *0.9;
        }
        else  { discountedBookPrice = fullBookPrice; }

        return discountedBookPrice;




    }
    public static double busDiscount (boolean senior, boolean dog, boolean student, double fullPrize) {
        double discountedPrice = fullPrize;

        if (senior == true) {
            discountedPrice = fullPrize * 0.85;
        } else if (student == true) {

            discountedPrice = fullPrize * 0.9;
        } else if (dog == true) {
            discountedPrice = fullPrize * 0.8;
        }
        return discountedPrice;

    }







}
