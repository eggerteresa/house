package UebungenGerzic;

import java.util.Scanner;

public class BankomatUebung3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren aktuellen Kontostand ein: ");
        double kontostand = scanner.nextDouble();
        int choice = 0;

//        System.out.println("Menu: ");
//        System.out.println("1. Deposit");
//        System.out.println("2. Withdraw");
//        System.out.println("3. Check balance");
//        System.out.println("4. Exit");
//        System.out.println("Enter your choice: ");
//        choice = scanner.nextInt();

//        if (choice == 4) {System.out.println("Das Programm wird beendet. ");
//
//        } else {


    while (choice !=4) {
        System.out.println("Menu: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

            switch ( choice) {

                case 1:
                    System.out.println("Geben Sie den Betrag der Transaktion ein: ");
                    double deposit = scanner.nextDouble();
                    kontostand = kontostand + deposit;
                    System.out.println(" Ihr neuer Kontostand beträgt " + kontostand);
//                    System.out.println("Menu: ");
//                    System.out.println("1. Deposit");
//                    System.out.println("2. Withdraw");
//                    System.out.println("3. Check balance");
//                    System.out.println("4. Exit");
//                    System.out.println("Enter your choice: ");
//                    choice = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Geben Sie den Betrag der Transaktion ein: ");
                     double withdrawal = scanner.nextDouble();
                    kontostand = kontostand - withdrawal;


                   System.out.println("Ihr neuer Kontostand beträgt " + kontostand);
//                    System.out.println("Menu: ");
//                    System.out.println("1. Deposit");
//                    System.out.println("2. Withdraw");
//                    System.out.println("3. Check balance");
//                    System.out.println("4. Exit");
//                    System.out.println("Enter your choice: ");
//                    choice = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Ihr aktueller Kontostand beträgt " + kontostand);
//                    System.out.println("Menu: ");
//                    System.out.println("1. Deposit");
//                    System.out.println("2. Withdraw");
//                    System.out.println("3. Check balance");
//                    System.out.println("4. Exit");
//                    System.out.println("Enter your choice: ");
//                    choice = scanner.nextInt();
                    break;
                    case 4: System.out.println("Das Programm wird beendet. ");
                      break;
                default:
                    System.out.println("Das ist keine gültige Eingabe. Versuchen Sie es erneut:");
//                    System.out.println("Menu: ");
//                    System.out.println("1. Deposit");
//                    System.out.println("2. Withdraw");
//                    System.out.println("3. Check balance");
//                    System.out.println("4. Exit");
//                    System.out.println("Enter your choice: ");
//                    choice = scanner.nextInt();
                    break;

            }
                }
            }


        }


