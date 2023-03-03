package neueUebung;

public class DoWhileLoop { //DoCount
    public static void main(String[] args) {

        int number = 88;
        doCount(number);

    }

    public static void doCount(int number) {
        System.out.println(number);
        do {

          number= number +1;
            System.out.println(number);

        } while (number <100);


    }


}
