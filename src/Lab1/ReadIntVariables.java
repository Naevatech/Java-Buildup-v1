package Lab1;
import java.util.Scanner;
public class ReadIntVariables  {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int length, breadth;
        System.out.println("Please enter a value for length");
        length = keyboard.nextInt();
        System.out.println("Please enter a value for breadth");
        breadth = keyboard.nextInt();
        // Output the values entered for length and breadth
        System.out.println("The value entered for length is " + length);
        System.out.println("The value entered for breadth is " + breadth);
    }
}
