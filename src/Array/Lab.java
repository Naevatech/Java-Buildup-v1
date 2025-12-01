package Array;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // PRINT OUT ARRAY INPUT
//        int [] numbers = new int[6];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter numbers " + (i + 1) + ": ");
//            numbers[i] = sc.nextInt();
//        }
//        for (int j = 0; j < numbers.length; j++) {
//            System.out.print(numbers[j] + " ");
//        }

        // TEST ARRAY
        final int SIZE = 8;
        int [] myNumbers = new int[SIZE];
        int evenNumber = 0;
        int oddNumber = 0;
        int total = 0;
        int average = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.print("Enter numbers " + (i + 1) + ": ");
            myNumbers[i] = sc.nextInt();
            // even number
            if (myNumbers[i]%2 == 0) {
                evenNumber++;
            } else  {
                // odd number
                if (myNumbers[i]%2 != 0) {
                    oddNumber++;
                }
            }
            total += myNumbers[i];
            average = total / SIZE;
        }

        System.out.println("The average is " + average);
        System.out.println("The total odds is " + oddNumber);
        System.out.println("The total even number is " + evenNumber);
        System.out.println("The total is " + total);




    }
}
