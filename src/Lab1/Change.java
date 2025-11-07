package Lab1;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double amountDue, amountTendered;

        //Getting the values
        System.out.println("Enter cost of item");
        amountDue = keyboard.nextDouble();
        System.out.println("Enter money tendered");
        amountTendered = keyboard.nextDouble();

        System.out.println("Amount Due:   £" + amountDue);
        System.out.println("Amount tendered:   £" + amountTendered);
        System.out.println("Change Due:   £" + (amountTendered - amountDue));
    }

}
