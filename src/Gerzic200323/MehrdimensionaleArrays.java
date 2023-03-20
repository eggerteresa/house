package Gerzic200323;

public class MehrdimensionaleArrays {
    public static void main(String[] args) {

        int[][][][] werte = new int[4][3][2][2];
        int elementcounter = 0;
        int elementcounter2 = 0;

        //normale for schleife

        for (int i = 0; i < werte.length; i++) {
            for (int j = 0; j < werte[i].length; j++) { //man nimmt hier die werte vom letzten
                for (int k = 0; k < werte[i][j].length; k++) { // wir tauschen k < 2 (anzahl werte) mit length aus, damit wir die werte oben auch unabhängig wechseln können
                    for (int l = 0; l < werte[i][j][k].length; l++) {
                        System.out.print(werte[i][j][k][l] + " ");
                        elementcounter++; // elementocunter soll 48 sein mit dieser Angabe
                    }
                }
            }
        }
        // for each schleife ist übersichtlicher
        for (int[][][] i : werte) {
            for (int[][] j : i) {
                for (int[] k : j) {
                    for (int l : k) {
                        elementcounter2++;
                    }
                }
            }
        }
        System.out.println(" es gibt " + elementcounter + "elemente in diesem array");
        System.out.println(" es gibt " + elementcounter2 + "elemente in dieser for-each-schleife");


//        for (int [][][] : werte) {
//            System.out.println(werte);
//        }
//        for ( element[][] : werte)
//            System.out.println(werte);
//
//        for (element[] : werte)
//            System.out.println(werte);
//
//        for (int element3 : werte)


    }
}





