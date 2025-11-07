package Lab6;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int valueNeeded;
        int totalNumber=0;
        System.out.print("How many number do you want to enter? ");
        valueNeeded = keyboard.nextInt();
        for (int num = 1; num <= valueNeeded; num++) {
            System.out.print("Enter value " + num + ": ");
            totalNumber += keyboard.nextInt();
        }
        System.out.println("Total Number " + totalNumber);
        System.out.println("Average Number " + totalNumber/valueNeeded);
    }
}
