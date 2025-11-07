package Lab1;
import java.util.Arrays;
import java.util.Scanner;
public class Circle2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double radius;
        final double pi = 3.142;
//        int answer;


        System.out.println("Enter your radius");
        radius = keyboard.nextDouble();


        //result for radius
        System.out.println("This radius is " + radius);
        //result for diameter
        System.out.println("This diameter is " + radius * 2);
        //result for circumference
        System.out.println("This circumference is " + radius * 2 * pi);
        //result for area
        System.out.println("This circumference is " + pi * (radius*radius));

    }
}
