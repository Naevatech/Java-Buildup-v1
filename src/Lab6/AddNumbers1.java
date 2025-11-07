package Lab6;
import java.util.Scanner;

public class AddNumbers1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int HOWMANY = 3;
        int number, total=0;

        for (int i = 0; i < HOWMANY; i++) {
            System.out.print("Enter the number: ");
            number = keyboard.nextInt();
            total = total+number;
        }
        System.out.println("\n The total number is "+ total);
    }
}
