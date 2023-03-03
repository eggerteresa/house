package neueUebung;

public class UebungWhileLoop1 { //Countdown

    public static void main(String[] args) {
      int from = 30;

        countdown(from);



    }

    public static void countdown(int from) {
        System.out.println(from);
        while (from !=0 ) {

            from = from -1;
            System.out.println(from);}
        }



}





