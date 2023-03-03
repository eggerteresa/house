public class DiscountLoesung {
    public static void main(String[] args) {
        //  Discount bus
        // senior -15%
        // dog -20%
        // student -10%
        // full prize 3.2
        // senior + dog + grandson *2bus

        //books
        // -10% > 2nonfiction +>= 1 fiction
        // 2 fiction : 15 +19
        // 2 nonfiction : 23 +28

        boolean isSenior = true;
        boolean isDog = true;
        boolean isStudent = true;


        double fullBusPrice = 3.2;

        double busTicketEdna = getBusDiscountPrice(fullBusPrice, true, false, false);
        double busTicketLola = getBusDiscountPrice(fullBusPrice, false, true, false);
        double busTicketPaul = getBusDiscountPrice(fullBusPrice, false, false, true);

        double totalBusPriceDiscounted = 2 * (busTicketEdna + busTicketLola + busTicketPaul);
        double totalBusPriceNoDiscount = 6 * 3.2;

        int fiction = 2;
        int nonFiction = 2;
        double fullBookPriceNoDiscount = 15 + 18 + 23 +28;



        double totalBookPriceDiscounted = getBookDiscountedPrice(fullBookPriceNoDiscount, fiction, nonFiction);

        double totalSavedMoney = (totalBusPriceNoDiscount + fullBookPriceNoDiscount ) - (totalBusPriceDiscounted + totalBookPriceDiscounted);

        System.out.println("Edna, Lola und Paul saved a total of " + totalSavedMoney);


    }


    public static double getBusDiscountPrice (double fullPrice, boolean isSenior, boolean isDog, boolean isStudent) {
        // was zum Schluss zurueck kommt

        double dicountedPrice;
        if (isSenior) {
            dicountedPrice = fullPrice * 0.85;
        } else if (isDog) {
            dicountedPrice = fullPrice * 0.80;
        } else if (isStudent) {
            dicountedPrice = fullPrice * 0.90;
        } else {
            dicountedPrice = fullPrice;
        }
        return dicountedPrice;
    }


        public static double getBookDiscountedPrice (double fullBookPrice, int fiction, int nonFiction) {

            double dicountedBookPrice;
            if (fiction >= 1 && nonFiction > 2) {
                dicountedBookPrice = fullBookPrice * 0.9;
            } else {
                dicountedBookPrice = fullBookPrice;
            }
            return dicountedBookPrice;
        }


    }



