package DatentypUebung;

public class Logic {
    public static void main(String[] args) {
        boolean variable1 = false;
        boolean variable2 = true;
        System.out.println(variable1 && variable2);

        boolean confusion = false;
        boolean knowledge =true;
        System.out.println(confusion || knowledge );

        // (1 >  3) AND (NOT 3 - 1 < 5)) OR 2*2 ==4

//        boolean calc1 = false;
//        boolean calc2 = true;
//        boolean calc3 = true;
//
//        System.out.println((calc1 && (!calc2)) || calc3);
        boolean result = 1>3 && (! (3 -1 <5)) || 2*2 ==4;
        System.out.println(result);

        // (6>= 2*3 || 2-3 < 0) && (1*1 == 1 != 1+1)
        boolean result2 = (6>=2*3 || 2-3<0 ) && (1*1 ==1 && 1!=1+1);
        System.out.println(result2);

//        das ist ein Kommentar

        // das ist noch ein Kommentar


//
//
//
//
}
}
//