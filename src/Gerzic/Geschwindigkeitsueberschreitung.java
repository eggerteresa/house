package Gerzic;

import java.util.Scanner;

public class Geschwindigkeitsueberschreitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Geschwindigkeit eingeben: ");
        int geschwindigkeit = scanner.nextInt();

        int erlaubteGeschwindigkeit = 50;

        int ueberschreitung = geschwindigkeit - erlaubteGeschwindigkeit;
        int geschwindigkeitstrafe = 0;

        if (ueberschreitung <=0) {
            System.out.println("Es gibt keine Ueberschreitung und keine Strafe. ");
            //geschwindigkeitstrafe = geschwindigkeitstrafe; // kann man sich hier sparen

        } else if (ueberschreitung <= 10) { // geht auch z.B. NUR ueberschreitung <=10  //man kann den Bereich angeben oder eben nur den bereich unter dem..
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " - es gibt eine schriftliche Verwarnung");
           // geschwindigkeitstrafe = geschwindigkeitstrafe;

        } else if (ueberschreitung <= 20) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " -  die Strafe beträgt 30 Euro");
             geschwindigkeitstrafe = geschwindigkeitstrafe +30;

        } else if (ueberschreitung <= 30) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " - die Strafe beträgt 50 Euro");
            geschwindigkeitstrafe = geschwindigkeitstrafe +50;

        } else if (ueberschreitung <= 50) { //(30 < ueberschreitung && ueberschreitung < 51)
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " - die Strafe beträgt 100 Euro");
            geschwindigkeitstrafe = geschwindigkeitstrafe +100;

        } else if ( ueberschreitung <= 100) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " - die Strafe beträgt 500 Euro");
            geschwindigkeitstrafe = geschwindigkeitstrafe + 500;

        } else if ( ueberschreitung > 100) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " - die Strafe beträgt 1500 Euro");
            geschwindigkeitstrafe = geschwindigkeitstrafe + 1500;
        }


        // Alkoholpegel zusätzlich

        Scanner scanner2 = new Scanner(System.in);//müsste ich nicht neu anlegen, Scanner wird hier gleich verwendet wie oben beim ersten Scanner
        System.out.println("Bitte Alkoholpegel eingeben: ");
        double alkoholpegel = scanner2.nextDouble();
        int alkoholstrafe = 0;

        if ( 0 <alkoholpegel && alkoholpegel <= 0.5 ) {

            System.out.println("der Alkoholpegel betraegt " + alkoholpegel + " Promille, es ist alles in Ordnung.");
          //alkoholstrafe = alkoholstrafe + 0;

        } else if ( 0.5 < alkoholpegel && alkoholpegel <= 1.0) {

            System.out.println("Der Alkoholpegel betraegt " + alkoholpegel + " Promille, es werden 50 Euro faellig. ");
            alkoholstrafe = alkoholstrafe +50; // man könnte auch nur 1 variable festlegen - z.B. strafe und immer zusammenzählen

        } else if ( 1.0 < alkoholpegel && alkoholpegel <= 2.0) {

            System.out.println("Der Alkoholpegel betraegt " + alkoholpegel + " Promille, es werden 100 Euro faellig. ");
             alkoholstrafe = alkoholstrafe + 100;

        } else if (alkoholpegel >2.0) {
            System.out.println("Der Alkoholpegel betraegt " + alkoholpegel + " Promille, es werden 2500 Euro faellig");
            alkoholstrafe = alkoholstrafe +2500;}


    // Finale Strafe
      double finaleStrafe = geschwindigkeitstrafe+alkoholstrafe;

        //Rabatte pro Monat eingeben!!! und monat per Scanner eingeben

       Scanner scanner3 = new Scanner(System.in) ;
        System.out.println("Geben Sie das Monat ein, info: immer ausgeschrieben, keine umlaute, : ");
       String monat = scanner3.next();
       monat = monat.toLowerCase(); // ALLES wird klein geschrieben
        System.out.println(monat);
//        //wir achten nun auf Groß/Kleinschreibung
//        //die daten werden normalisiert

        switch (monat) { //switch ist bezogen auf mein case oder umgekehrt!! der Case muss derselbe Datentyp sein wie meine variable im switch!!!!!
            case "jaenner":
            case "februar":
                finaleStrafe = finaleStrafe;
                System.out.println("Es ist kein Rabatt möglich");
                break;
           case "maerz":
            case "april":
                finaleStrafe = finaleStrafe * 0.90;

                break;
            case "mai":
            case "juni":
                finaleStrafe = finaleStrafe * 0.85;

                break;
            case "juli":
            case "august":
                finaleStrafe = finaleStrafe * 0.8;
                break;
            case "september":
            case "oktober":
                finaleStrafe = finaleStrafe * 0.75;

                break;
           case "november":
            case "dezember":
                finaleStrafe = finaleStrafe * 0.7;

                break;
            default:
                System.out.println("Sie haben den Monat wohl falsch geschrieben, daher gibt es heute keinen Rabatt. ");
        }


        if (finaleStrafe > 0) {
            System.out.println("Die Finale Strafe betraegt insgesamt " + finaleStrafe +" Euro");
        }
        else if (finaleStrafe <=0)
        {
            System.out.println("Alle Vorgaben erfüllt, gute Fahrt!");}




        // int alter = 26;
        //switch (alter){
        // case 25:
        // einkauf = einkauf *0.75;
        //break (bringt das Programm dazu, aus dem switch Statement komplett rauszuspringen!!
        // case 26.. usw
        // }
        /* case "Montag":
        case "Dienstag":
        einkauf = einkauf *0.90;
        break; macht das sonst so lange, bis break kommt!!
         */






    }

}
