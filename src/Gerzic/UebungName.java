package Gerzic;

import java.util.Scanner;

public class UebungName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Vorname eingeben: ");
        String vorname = scanner.next();

       // Scanner scanner1 = new Scanner(System.in); es reicht wenn man nur 1 Scanner macht!!!
        System.out.println("Bitte Nachname eingeben: ");
        String nachname = scanner.next();

        System.out.println("Bitte geben Sie Ihr Alter ein: ");
        int alter =scanner.nextInt(); // hier nextInt weil wir integer eingeben

        String name = vorname + " " + nachname;
        System.out.println(name);
        String name1 = vorname.concat("" + nachname); // methode aus string, fügt 2 strings zusammen

        int nameLang = name.length();
        System.out.println(nameLang);

        boolean bool;
        bool = name.length() >10; // kommt true oder false zruück
        System.out.println("Die Länge ist größer als 10: " + bool + " und die exakte Laenge ist: " +nameLang + ".");

        System.out.println("Willkommen "+ name.toUpperCase());


        //hasnext
        //Scanner hasnext gibt true oder false aus - gibt es noch etwas im Scanner? sagt wahr oder falsch, wenn nichts mehr kommt, dann false, für Schleifen gut zu nutzen
            String text3 = "Hallo welt heute ist ein schoener Tag";
            Scanner scanner2 = new Scanner (text3); // wird anders verwendet, deswegen neuen Scanner erstellen (nimmt Text3 nicht Eingabe)

            int counter = 0;
            while( scanner2.hasNext()) {
                System.out.println(scanner2.next());
                System.out.println("Ausgabe has Next(): " + scanner2.hasNext());
                counter ++;

            }
        System.out.println(counter);






//        if (nameLang >10) {
//            System.out.println(" Die Länge ist größer 10: true und die exakte Laenge ist: " + nameLang;
//        }
//        else  {
//            System.out.println("Die Länge ist größer 10: false und die exakte Laenge ist: " + nameLang;

     //   ueber10(nameLang);

 //   }

//    public static boolean ueber10( int nameLang ) {
//
//        if (nameLang >10) {
//            return true;
//        }
//        else if (nameLang < 10){
//            return false;
//        }


    }



}




