package ArrayUebungen;

public class Uebungszyklus {
    public static void main(String[] args) {

        int ganzzahlen[] =  {10, 5, 4, 8, 9, 12, 14};

        for (int i = 0; i < ganzzahlen.length; i++) {
            System.out.println(ganzzahlen[i]);
        }


        Double gleitkommazahlen [] = {2.4, 3.7, 8.9, 4.5, 0.3};
     double max = gleitkommazahlen[0];


        for (int i = 1; i <gleitkommazahlen.length; i++) {
           if (gleitkommazahlen[i] >max) {
               max = gleitkommazahlen[i];
           }
        }

        System.out.println("Das größte Element im Array ist " + max);


        String worte [] = {"hallo", "niemand", "praktikum", "viele", "super", "mega", "geburtstag", "hilfe"};


        for (int i = 0; i < worte.length; i++) {
            System.out.println(worte[i] + " enthält " + worte[i].length() + " Buchstaben");// worte[i] gibt das String im Array aus, worte[i].length gibt aus, weiviele buchstaben der String enthält
// .length würde einzelne Lerrzeichen auch zählen
        }


        int ganzezahlen[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int summe = 0;
        for (int i =0; i < ganzezahlen.length; i++) {
            summe = summe + ganzezahlen[i];

        }
        System.out.println("Die Summe des Arrays beträgt " + summe);

        int zufallszahlen [] = new int[15];

        for( int i = 0; i<zufallszahlen.length; i++) { // Nochmal mit der Lösung anschauen : Random verwenden!!
            int randomnumber = (int) (Math.random() * 100); //AUSWENDIG LERNEN!!!! man könnte auch Methode Random auswählen mit origin und bound
            while (randomnumber > 100 || randomnumber == 00) { // z.B. 62 ist größer als 49, kann nciht ausgewählt werden, kleiner 1 auch nicht. Bereich muss zwischen 1 und 49 sein.
                randomnumber = (int) (Math.random() * 100);
            }
            zufallszahlen [i] = randomnumber;

            System.out.println(zufallszahlen[i]);
        }


        int ganzzahlen1 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        for (int i = 0; i<ganzzahlen1.length; i++) {
            if (ganzzahlen1[i] % 2 == 0) {
                System.out.println(ganzzahlen1[i]);
            }
        }


            String neuString[] = {"hallo", "niemand", "praktikum", "viele", "super", "mega", "geburtstag", "hilfe", "toll", "essen" };
            char ersterBuchstabe = 'g';

            //String ersterBuchstabeg = neuString[].charAt(0); falsch??

            for (int j =0; j< neuString.length; j++) {

                if (neuString[j].charAt(0) ==ersterBuchstabe){

                    System.out.println("Das Wort " + neuString[j] + " faengt mit " + ersterBuchstabe + "an");
                }

            }
// Noch offen : Uebungen 8, 9, 10

        }


    }

