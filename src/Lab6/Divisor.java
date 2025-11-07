package Lab6;
import java.util.Scanner;


public class Divisor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int startNo, finishNo, DivisorNo;
        double total = 0;
        int count = 0;
        System.out.print("Enter the start No: ");
        startNo = keyboard.nextInt();
        System.out.print("Enter the finish No: ");
        finishNo = keyboard.nextInt();
        System.out.print("Enter the Divisor No: ");
        DivisorNo = keyboard.nextInt();

        if (startNo < finishNo) {
            for (int i = startNo; i <= finishNo; i++) {
                if ((i % DivisorNo) == 0) {
                    total +=i;
                    count++;
                }
            }
            System.out.println("x "+ count);
            System.out.println("The total is " + total);
            System.out.println("The Average is " + total/count);
        }
        else {
            System.out.println("Your start number must be less than finish number");
        }

    }
}
