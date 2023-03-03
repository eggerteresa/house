package typeConversion;

public class Account {
    public static void main(String[] args) {
        int years = 0;
        int investment = 2000;
        double interestRate = 0.025;

        double interest = investment * interestRate;

        AccountBalance(years, investment, interest);

    }

    public static void AccountBalance (int years, int investment, double interest){
        for (int i = 0; i <= 10; i++) {

            System.out.println(investment);
            investment = (int) (investment + interest);

        } while (years <= 10) {

        }
    }




}
