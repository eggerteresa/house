package DatentypUebung;

public class Methode2 {
    public static void main(String[] args) {

        int fiction = 4;
        int nonFiction =0;
        String result = checkBookdiscount(fiction, nonFiction);
        System.out.println(result);

        System.out.println(checkBookdiscount(2,1));
        checkBookdiscount(1,2);
        checkBookdiscount(0,3);
        checkBookdiscount(1,3);
        checkBookdiscount(1,2);


    }

public static String checkBookdiscount (int fiction, int nonFiction) {

    // zweite Kondition: in a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.

String discount = "Discount!";
    if (fiction > 0 && nonFiction >= 3) {
        return discount;
    } else {
        return "no discount!";
    }
}




}
