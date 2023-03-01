package DatentypUebung;

public class Methode3 {
    public static void main(String[] args) {

        double area1 = calculateArea(10.2, 12.3);
       double area2 = calculateArea(2.1, 3.6);
       double area3 = calculateArea(2.5, 3.8);
if (area1 > area2 && area1 > area3) {
    System.out.println("Area1 is the greatest!");
}
else if (area2 > area1 && area2 > area3) {
    System.out.println("Area2 ist the greatest!");
}
else {
    System.out.println("Area3 is the greatest!");
}




    }

    public static double calculateArea (double length, double breadth) {
        double area = length * breadth;
        return area;
    }




}
