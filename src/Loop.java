public class Loop {
    public static void main(String[] args) {
        int counter = 36;

        Countdown (counter);
        Countdown2(counter);




    }


    public static void Countdown (int counter){
        System.out.println(counter);

        while (counter > 0) {
            counter = counter -1;
            System.out.println(counter);
        }


    }

    public static void Countdown2 (int counter){
        System.out.println(counter);

        while (counter !=0) {
            counter = counter -1;
            System.out.println(counter);
        }


    }

}

