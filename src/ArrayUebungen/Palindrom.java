package ArrayUebungen;

public class Palindrom {
    public static void main(String[] args) {

        String pal1 = "anna";
                //"Was it a car or a cat i saw";
        String pal2 = "Murder for a jar of red rum";
        String pal3 = "Go hang a salami, I'm a lasagna hog";
        String pal4 = "Otto";
        String pal5 = "1122332211";

     isapalindrom(pal1);



    }

    // Konvertieren
    public static boolean isapalindrom(String palindrom) {

        palindrom =palindrom.toLowerCase();
        System.out.println(palindrom);


        palindrom = palindrom.replace("'", "");
        palindrom = palindrom.replace(",", "");
        palindrom = palindrom.replace(" ", "");

        System.out.println(palindrom);


        boolean ispalindrom = false;

        char ersterBuchstab = palindrom.charAt(0);
        char letzterBuchstabe = palindrom.charAt(palindrom.length() - 1);

// nicht vollständiger Code!!!!!!! Funktioniert so nicht!

        if (ersterBuchstab == letzterBuchstabe) {
           palindrom = palindrom.substring(0, palindrom.length() - 1);
            if (palindrom.length() <= 1) {
                ispalindrom = true;
                System.out.println(" Es ist ein Palindrom");
            }


        }if (ispalindrom==false) {
            System.out.println("Es ist kein Palindrom");}

        return ispalindrom;

    }


}
