package Lab9;
import java.util.Scanner;

public class Slide37 {
    static Scanner keyboard = new Scanner(System.in);

    public static int getDimension(String side) {
        int dimension;
        System.out.println("Enter the " + side + ": ");
        dimension = keyboard.nextInt();
        return dimension;
    }

    public static int addNumber(String checkNum) {
        int num;
        System.out.print("Enter the value: ");
        num = keyboard.nextInt();
        return  num;
    }

    public static void main(String[] args) {
        int length, breath, height, volume;
        int num1, num2, addition;
        num1 = addNumber("num1");
        num2 = addNumber("num2");
        addition = num1+num2;

        length = getDimension( "length");
        height = getDimension("height");
        breath = getDimension("breath");

        volume = length * breath * height;
        System.out.println("The volume of the box is " +volume );
    }
}
