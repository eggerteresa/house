package UebungenExtraJandl;

public class Rectangle {

    public static void main(String[] args) {

        int width = 30;
        int length = 40;
        int circumference;
        circumference = (2* width) + (2*length);

        int area;
        area = width * length;

        System.out.println("The circumference of the rectangle is " + circumference);
        System.out.println("The area of the rectangle is " + area);


        calculateCircumference(20, 10);
        calculateCircumference(25, 15);

        calculateArea(20, 10);
        calculateArea(25, 15);

    }

    public static int calculateCircumference (int width, int length) {

        int calccircumference = (2*width) + (2*length);
        System.out.println("The circumference of the rectangle is calculated " + calccircumference);

        return calccircumference;
    }

    public static int calculateArea (int width, int length) {
        int calcArea = width*length;
        System.out.println("The area of the rectangle is calculated " + calcArea);

        return calcArea;


    }

}
