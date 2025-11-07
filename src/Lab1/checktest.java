package Lab1;
import java.util.Scanner;
public class checktest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length;
        int breadth;
        String name;

        System.out.print("Enter a value for length: ");
        length = input.nextInt();

        System.out.print("Enter a value for breadth: ");
        breadth = input.nextInt();

        System.out.print("Enter a value for name: ");
        name = input.next();

        System.out.println("This are the result" + length + breadth);





    }
}
