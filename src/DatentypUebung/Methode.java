package DatentypUebung;

public class Methode {
    public static void main(String[] args) {


        boolean senior = false;
        boolean dog = false;
        boolean student = false;


        checkforDiscount(senior, student, dog);

        checkforDiscount(true, false,  true);
        checkforDiscount( false,  false,  true);
        checkforDiscount( false,  true,  true);
        checkforDiscount( false,  true, false);

    }
    public static void checkforDiscount (boolean senior, boolean dog, boolean student) {
            if ( senior) {
                System.out.println("Discount!");}
            else if (dog) {
                System.out.println("Discount!");}
            else if (student) {
                System.out.println("Discount!");}
            else {
                System.out.println("no Discount!");
            }
    }

}
