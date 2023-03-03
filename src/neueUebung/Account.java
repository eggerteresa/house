package neueUebung;

public class Account {

    public static void main(String[] args) {
        int years = 10;
        double investment = 2000;
        double interestRate = 102.5;
        accountBalance(years, investment, interestRate);


    }

    public static void accountBalance(int years, double investment, double interestRate) {
        System.out.println(investment);
        for (int i = 0; i <= years; i = i + 1) {

        investment = investment / 100 * interestRate;
            System.out.println(investment);


        }



        }
    }
