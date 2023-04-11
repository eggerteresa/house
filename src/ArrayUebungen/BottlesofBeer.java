package ArrayUebungen;

public class BottlesofBeer {
    public static void main(String[] args) {


        recursion99bottles(5);


    }

    public static void recursion99bottles(int anzahlBierflaschen) {

        if (anzahlBierflaschen != 0) {
            System.out.println(anzahlBierflaschen + " Bottles of Beer on the wall, " + anzahlBierflaschen + " Bottles of Beer");
            System.out.println("Take one down, pass ist around, " + (anzahlBierflaschen - 1) + " Bottles of Beer on the wall");
            recursion99bottles(anzahlBierflaschen - 1);
            anzahlBierflaschen --;
        }
    }
    }

