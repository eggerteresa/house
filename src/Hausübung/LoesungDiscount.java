package Hausübung;

public class LoesungDiscount {
    public static void main(String[] args) {
        //Discount bus
        //senior -15%
        // dog - 20%
        //student - 10%
        //full prize 3.2
        // senior + dog + grandson * 2bus

        //bus
        //-10% > 2nonfiction + >= 1 fiction
        //2 fiction: 15 + 18
        //2 nonfiction: 23 + 28

        boolean isSenior = true;
        boolean isDog = true;
        boolean isStudent = true;

        double fullBusPrice = 3.2;

        double busTicketEdna = getBusDiscountPrice(fullBusPrice, true, false, false);
        double busTicketDog = getBusDiscountPrice(fullBusPrice, false, true, false);
        double busTicketStudent = getBusDiscountPrice(fullBusPrice, false, false, true);

        double totalbusTicketPrice = ((busTicketDog + busTicketStudent + busTicketEdna) * 2);

        double totalPriceWithoutDiscount = (fullBusPrice * 6);

        //wird hier nicht benötigt double totalDiscountBus = totalPriceWithoutDiscount-totalbusTicketPrice;


        //Bücher
        //-10% > 2nonfiction + >= 1 fiction
        //2 fiction: 15 + 18
        //2 nonfiction: 23 + 28
        int fiction = 2;
        int nonFiction = 2;
        double BookPriceNoDiscount = 15 + 18 + 23 + 28;

        double fullBookPriceDiscounted = getBookDiscountPrice(BookPriceNoDiscount, fiction, nonFiction);

        double totalSavedMoney = (totalPriceWithoutDiscount + BookPriceNoDiscount) - (totalbusTicketPrice + fullBookPriceDiscounted);

        System.out.println("Edna, Lola and Paul saved a total of " + totalSavedMoney);


    }

    public static double getBookDiscountPrice(double fullBookPrice, int fiction, int nonFiction) {
        //Logik double - wieviel wir wirklich nach Discount zahlen müssen

        double discountedBookPrice;

        if (fiction >= 1 && nonFiction > 2) {
            discountedBookPrice = fullBookPrice * 0.9;
        } else {
            discountedBookPrice = fullBookPrice;
        }
        return discountedBookPrice;

    }

    //Methode: woran sind wir interessiert? wir wollen zurückbekommen, wieviel sie sparen können.
    //Methoden sollen wieder verwendet werden können.
    // 2 Methoden: wieviel für Bus zahlen, wieviel für Bücher zahlen?

    public static double getBusDiscountPrice(double fullBusPrice, boolean isSenior, boolean isDog, boolean isStudent) {
        //was zurückkommen soll ist der discountetPrice
        double discountedPrice;
        if (isSenior) {
            discountedPrice = fullBusPrice * 0.85;
        } else if (isDog) {
            discountedPrice = fullBusPrice * 0.8;
        } else if (isStudent) {
            discountedPrice = fullBusPrice * 0.9;
        } else {
            discountedPrice = fullBusPrice;
        }
        return discountedPrice;
    }


}
