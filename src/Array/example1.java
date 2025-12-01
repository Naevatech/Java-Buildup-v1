package Array;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // height
        final int MAX = 8;
        int [] height = new int[MAX];

        for (int index = 0; index < MAX; index++) {
            System.out.println("Enter a height: ");
            height[index] = keyboard.nextInt();
        }

        //age
//        final int MAX2 = 8;
//        int [] age = new int[MAX2];
//        for (int index = 0; index < MAX2; index++) {
//            System.out.println("Enter a age: " + (index +1) + ": ");
//            age[index] = keyboard.nextInt();
//        }

        //age further
//        final int MAX3 = 6;
//        int [] age2 = new int[MAX3];
//        int input, position = 0;
//        System.out.println("Enter age 1: ");
//        input = keyboard.nextInt();
//        while ((input != -1) && (position < MAX3)) {
//            age2[position] = input;
//            position = position + 1;
//            System.out.println("Enter age " + (position + 1) + ": ");
//            input = keyboard.nextInt();
//        }

        // search check
//        int [] height = {78, 67, 66,60,73,70,75,67};
//        int search, total = 0;
//
//        System.out.println("Enter search number: ");
//        search = keyboard.nextInt();
//
//        for (int i = 0; i < height.length; i++) {
//            if (height[i] == search) {
//                total++;
//            }
//        }
//        System.out.println("The total number is " + total + " time");

        // search found
//        int [] numbers = {53, 45, 30, 67, 23};
//        int search, index = 0;
//        boolean found = false;
//        System.out.print("Enter number to search: ");
//        search = keyboard.nextInt();
//
//        while (!found) {
//            if (numbers[index] == search) {
//                found = true;
//                System.out.println(search + " is found at location " + index);
//            }
//            index = index + 1;
//        }

        //search found check
//        int [] numbers = {53, 45, 30, 67, 23};
//        int search, index = 0;
//        boolean found = false;
//        System.out.print("Enter search number : ");
//        search = keyboard.nextInt();
//        while (!(found) && (index < numbers.length)) {
//            if (numbers[index] == search) {
//                found = true;
//                System.out.println(search + " has been found at location " + index);
//            }
//            index = index + 1;
//        }
//        if (!found) {
//            System.out.println(search + " has not been found");
//        }

        // max and min search
        int [] list = {50,2,8,34,75,19,20,44,31,60};
        final int SIZE = list.length;
        int largest = list[0];
        int smallest = list[0];
        for (int i = 1; i < SIZE; i++) {
            if (list[i] > largest) {
                largest = list[i];
            }
            else {
                if (list[i] < smallest) {
                    smallest = list[i];

                }
            }
        }
        System.out.println("Largets number in the list = " + largest);
        System.out.println("Smallest number in the list = " + smallest);
    }


}
