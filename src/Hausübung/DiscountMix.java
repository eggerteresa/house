package Hausübung;

public class DiscountMix {
    public static void main(String[] args) {

        double busSenior = 0.15;
        double busDog = 0.20;
        double busStudent = 0.10;
        double fullPrize = 3.20;

        double discountPrizeSenior= fullPrize*busSenior;
        double discountPrizeDog = fullPrize * busDog;
        double discountPrizeStudent = fullPrize * busStudent;

        System.out.println("The discount is " + discountPrizeSenior + " for a senior.");

        System.out.println("The discount is " + discountPrizeDog + " for a dog.");

        System.out.println("The discount is " + discountPrizeStudent + " for a student.");


        double summeDiscountBus= 2*(discountPrizeDog+ discountPrizeStudent +discountPrizeSenior);
        System.out.println("The total discount is " + summeDiscountBus);


        // eigentlich benötigen wir hier einen Scan. der sammelt die Beträge. dann machen wir eine Summe. und berechnen dann den Discount

        double prizeBook;
        prizeBook= 15 + 18 + 23 + 28;
        double discountBook = 0.1;
        System.out.println("Der Preis der 4 Bücher beträgt: " + prizeBook);

        double fictionBook = 2;
        double nonfictionBook = 2;

        double discount = prizeBook * discountBook;

        System.out.println(checkBookdiscount(fictionBook,nonfictionBook,discount));

        double totaldiscount = discount + summeDiscountBus;
        System.out.println("the total discount for bus and books is " + totaldiscount);



    }

        public static String checkBookdiscount ( double fictionBook, double nonfictionBook, double discount) {

            // zweite Kondition: in a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.



            if (fictionBook > 0 && nonfictionBook >= 3) {
                System.out.println(discount);
            } else {
                System.out.println("no discount!");


            }
            return null;
//  public static double ()


        }



}
