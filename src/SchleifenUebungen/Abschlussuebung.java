package SchleifenUebungen;

import java.nio.file.Paths;

import java.util.Scanner;

public class Abschlussuebung {

    public static void main(String[] args) throws Exception{


String file = "C:\\Users\\s52422\\Desktop\\faust.txt";

Scanner buchText = new Scanner(Paths.get(file));


int countWort = 0;

        System.out.println("Welches Wort möchten Sie zählen lassen? (Groß- und Kleinschreibung ist egal: ");
        Scanner scanner = new Scanner(System.in);
        String gesuchtesWort = scanner.next();

        gesuchtesWort=gesuchtesWort.toLowerCase();

        while (buchText.hasNext()){
            String word = buchText.next();
            word = word.toLowerCase();

            if (word.equals(gesuchtesWort)) {
                countWort++;
            }
            System.out.print(word + " ");
        }

        System.out.println("Das Wort " + gesuchtesWort +" wurde " + countWort + "mal in diesem Dokument gefunden");


    }


}
