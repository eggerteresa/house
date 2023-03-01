package DatentypUebung;

public class Conditions {
    public static void main(String[] args) {
        boolean senior = false;
        boolean dog = false;
        boolean student = false;

        if ( senior) {
            System.out.println("Discount!");}
        else if (dog) {
            System.out.println("Discount!");}
        else if (student) {
            System.out.println("Discount!");}
        else {
            System.out.println("no Discount!");
        }
// zweite Kondition: in a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.

        int fiction = 4;
        int nonFiction =0;


        if (  fiction >0  && nonFiction >=3 )
        {
            System.out.println("Discount!");}
        else {
            System.out.println("no Discount!");}



    }
}
