package UebungenExtraJandl;

public class Pingpong {
    public static void main(String[] args) {

        newLoop(0);

    }
        static void newLoop (int zahl)
        {
            int counter = 0;

            while (counter <= 100) {
                if (zahl % 6 == 0) { // zuerst für größte Nummer checken!
                    System.out.println(zahl + " ping pong");
                }
                else if (zahl % 3 == 0) {
                    System.out.println(zahl +" pong");
                }
                else if (zahl % 2 == 0) {
                    System.out.println(zahl + " ping");
                }
                else {
                    System.out.println(zahl +" - ");
                }
                counter++;
                zahl++;
            }

            System.out.println("----------------------------------------------------");

for (int i = 0; i<100; i++) {
    if (zahl % 6 == 0) { // zuerst für größte Nummer checken!
        System.out.println(zahl + " ping pong");
    }
    else if (zahl % 3 == 0) {
        System.out.println(zahl +" pong");
    }
    else if (zahl % 2 == 0) {
        System.out.println(zahl + " ping");
    }
    else {
        System.out.println(zahl +" - ");
    }
    zahl++;
}



        }

    }



