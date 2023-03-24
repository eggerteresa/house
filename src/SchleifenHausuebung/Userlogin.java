package SchleifenHausuebung;

import java.util.Scanner;

public class Userlogin {
    public static void main(String[] args) {

        int count = 0;

        String benutzername = "user123";
        String passwort = "password123";
        String eingabeBenutzername = " ";
        String eingabePasswort = " ";


        do {
            System.out.println("Geben Sie den Benutzernamen ein: ");
            Scanner scanner = new Scanner(System.in);
            eingabeBenutzername = scanner.next();

            System.out.println("Geben Sie das Passwort ein: ");
            eingabePasswort = scanner.next();
            count ++;

            if (!eingabeBenutzername.equals(benutzername) || !eingabePasswort.equals(passwort) ) {
            System.out.println("Falscher Benutzername oder falsches Passwort. Bitte versuchen Sie es erneut.");
         }
         if (count ==3) {
             System.out.println("Maximale Anzahl von Versuchen erreicht. Programm beenden. ");
             System.exit(0);
        }
        }
        while ( !eingabeBenutzername.equals(benutzername) || !eingabePasswort.equals(passwort))  ;
        System.out.println("Richtige Benutzerdaten eingegeben");
        System.exit(0);


        }
    }









