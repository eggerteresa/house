package UebungenMultidimensionaleArrays;

import java.util.Random;

public class Summenberechnen {
    public static void main(String[] args) {
        //Uebung1
//        double summenarray [] [] = {{8.8, 12}, {134, 67.92, 45, 32.4, 76}, {1}, {0, 0.56}};
//        double summe = 0;
//        for (int i = 0; i< summenarray.length; i++)  {
//            for (int j = 0; j<summenarray[i].length; j++) {
//            summe = summe +summenarray[i][j]; }
//        }
//        System.out.println("Die Summe beträgt " + summe);


//       int zufallsarray [] [] = new int[8][8];
//       int summe = 0;
//      // int min = zufallsarray[0][0];
//    int min = Integer.MAX_VALUE; //SOOOOOOOOO UNLOGISCH!!!! ABER MERKEN!!!!!
//    int max = Integer.MIN_VALUE; // ist die kleinste zahl die als integer möglich ist - damit vergleichen, bekommt man neues max
//       //int max = zufallsarray[0] [0];
//
//
//       for (int k = 0; k < zufallsarray.length; k++) {
//           for (int l = 0; l < zufallsarray.[k]length; l++) {
//
//               Random random = new Random();
//               zufallsarray[k][l] =random.nextInt(1, 101);
//
//
////  Math - nicht verwenden             int zufallszahl = (int) (Math.random() * 100); //Random random = new Random(); zufallsarray [k] [l] = random.nextInt(origin 1, bound 100)
////               while (zufallszahl > 100 || zufallszahl == 0) {
////                   zufallszahl = (int) (Math.random() * 100);
//               //}
//             //  zufallsarray[k][l] = zufallszahl;
//               System.out.println(zufallsarray[k][l]);
//           }
//       }
//
//
//
//        for (int k = 0; k < zufallsarray.length; k++) {
//            for (int l = 0; l < zufallsarray.[k]length; l++) {
//                   summe= summe + zufallsarray[k][l];
//
//               if (zufallsarray[k][l] < min) {
//                   min = zufallsarray[k][l];
//               }
//
//               if (zufallsarray[k] [l] > max) {
//                   max = zufallsarray[k][l];
//               }
//
//           }
//       }
//        System.out.println("Die Summe beträgt " + summe);
//       int durchschnitt = summe/ zufallsarray.length;
//        System.out.println("Der Durchschnitt beträgt " + durchschnitt);
//        System.out.println("Der größte Wert ist " + max);
//        System.out.println("Der kleinste Wert ist " + min);


// Uebung 3

//        int zweidimArray[][] = {{2, 5, 3, 2}, {6, 4, 2}, {2, 10}, {2, 2, 2, 2, 6}};
//
//        int[] summenArray = new int[zweidimArray.length];
//        int counter = 0;
//
//        for (int[] arrayeindim : zweidimArray) { //FOR EACH
//            int hilfsvariablesumme = 0;
//            for (int einzelnerWert : arrayeindim) {
//                hilfsvariablesumme = hilfsvariablesumme + einzelnerWert;
//            }
//            summenArray[counter] = hilfsvariablesumme;
//            counter++;
//            System.out.println(hilfsvariablesumme);
//        }
//
//        if (summenArray[0] == summenArray[1] && summenArray[0] == summenArray[2] && summenArray[0] == summenArray[3]) {
//            System.out.println("OK, in diesem zweidimensionalen Array haben alle Arrays die gleiche Summe");
//        } else {
//            System.out.println("X - in diesem zweidimensionalen Array haben alle eindimensionalen Arrays unterschiedliche Summen.");
//        }

//UEbung 4 Dreidimensionale Arrays

        double dreidimarray[][][] = new double[4][3][2];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double summe = 0;
        double durchschnitt = 0;

        for (int k = 0; k < dreidimarray.length; k++) {
            for (int l = 0; l < dreidimarray[k].length; l++) {
                for (int m = 0; m < dreidimarray[k][l].length; m++) {
                    Random random = new Random();
                    dreidimarray[k][l][m] = random.nextDouble(0.0, 1.0);
                    System.out.println(dreidimarray[k][l][m]);
                }
            }
        }

        for (double[][] zweidim : dreidimarray) {
            for (double[] eindim : zweidim) {
                for (double einzelnerWert : eindim) {
                    summe = summe + einzelnerWert;
                    durchschnitt = summe / dreidimarray.length;

                    if (einzelnerWert < min) { // im for each loop braucht man nicht die schleifen angeben (j k l..)
                        min = einzelnerWert;
                    }

                    if (einzelnerWert > max) {
                        max = einzelnerWert;
                    }
                }
            }
        }

        System.out.println("in diesem Multidimensionalen Array beträgt die Summe der Elemente " + summe);
        System.out.println("in diesem Multidimensionalen Array beträgt der Durchschnitt " + durchschnitt);
        System.out.println("Der Maximale Betrag ist "+ max);
        System.out.println("Der minimale Betrag ist " + min);




    }
}
