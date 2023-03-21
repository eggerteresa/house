package ArraysGerzic;

import java.util.Scanner;

public class ArraysDynamisch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eingeben, wie groß das Array werden soll ");
        int arrayGroesse = scanner.nextInt();

        String[] name = new String[arrayGroesse]; // Array wird in der Größe erzeugt, die der Benutzer angibt


    for (int i =0; i<name.length; i++) {
            System.out.println("Bitte Name " + i + " eingeben"); // Array mit Namen befüllen
            name[i] = scanner.next();
        }


    String name2 [] = {"Aurelie", "Jana", "Michaela"}; //Arraybefüllung Variante

        String temp1 = "Veronika";
        String temp2 = "Myla";

        String name3[] ={"Aurelie", temp1, "Sofia", temp2, "Kata"};

        for (int i =0; i<name3.length; i++) {
            System.out.println(name3[i]);
        }

        for(String nameElement: name3) {
            System.out.println(nameElement);
        }


    }







}
