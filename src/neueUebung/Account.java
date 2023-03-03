package neueUebung;

public class Account {

    public static void main(String[] args) {
        int years = 10;
        double investment = 2000;
        double interestRate = 102.5; // oder 0.0025 ( accbalance + accBalance *interestrate. oder 1.025 (dann malrechnen)
        accountBalance(years, investment, interestRate);


    }

    public static double accountBalance(int years, double investment, double interestRate) {
       // System.out.println(investment);



        double accountBal = investment;

        for (int i = 1; i <= years; i = i + 1) { //was soll der for Loop machen? für jedes Jahr unsere AccountBalance berechnen

        accountBal = accountBal / 100 * interestRate;
            System.out.println( accountBal +"Euros in year " + i);


        }
        return accountBal;



        }
    }
