public class DoCount {
    public static void main(String[] args) {
        int firstNumber = 0;

        Countup(firstNumber);

    }


    public static void Countup (int firstnumber) {
        do {
            System.out.println(firstnumber);
            firstnumber++;
        } while (firstnumber <= 100);

    }

}
