public class InfiniteLoop1 {
    public static void main(String[] args) {
        int i = 1;


        do {
            System.out.println(i);
            i++;
        } while (i == 1);

        // ---------------------------
        int b = 1;

        while (b < 2) {
            System.out.println(1);
            b++;
        }

        while (true) {
            System.out.println(1);
            break;
        }


    }


}

