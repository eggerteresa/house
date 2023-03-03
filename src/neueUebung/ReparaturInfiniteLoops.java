package neueUebung;

public class ReparaturInfiniteLoops {
    public static void main(String[] args) {
        int i = 1;
        loop1(i);


    }
    public static void loop1(int i) {

        do {
            System.out.println(i); // irgendetwas mit i ändern! muss sich verändern, sonst Endlosschleife
            i = i+1;
        } while ( i ==1);

    }


}
