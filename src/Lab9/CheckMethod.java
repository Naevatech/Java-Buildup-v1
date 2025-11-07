//package Lab9;
//import java.util.Scanner;
//
//
//
//public class CheckMethod {
//    static Scanner keyboard = new Scanner(System.in);
//    public static int getDimension() {
//        int dimension;
//        System.out.println("Enter the dimension: ");
//        dimension = keyboard.nextInt();
//        return dimension;
//    }
//
//    public static double getCircumference() {
//        double answer;
//        answer = 2*Math.PI*radius;
//        return answer;
//    }
//
//    public static double getArea() {
//        return Math.PI*Math.pow(radius, 2);
//    }
//
//    public static void main(String[] args) {
//            getDimension();
//            getCircumference();
//            getArea();
//
//    }
//}
//




package Lab9;
import java.util.Scanner;

public class CheckMethod {
    static Scanner keyboard = new Scanner(System.in);

    public static int getDimension() {
        System.out.println("Enter the dimension: ");
        return keyboard.nextInt();
    }

    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        int radius = getDimension();
        double circumference = getCircumference(radius);
        double area = getArea(radius);

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
