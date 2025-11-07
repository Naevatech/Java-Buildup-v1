package Lab6;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        int number;
//        System.out.println("Enter a positive number: ");
//        number = keyboard.nextInt();
//
//        System.out.println("\nThe factors of " + number + " are:");
//        for (int count = 1; count <=number; count++) {
//            if ((number % count) == 0) {
//                System.out.println("\t" + count);
//            }
//        }

//        for (int row = 1; row <=3; row++) {
//            for (int column = 1; column <= 4; column++) {
//                System.out.print("\tX");
//            }
//            System.out.println("u");
//        }
        for (int i = 3; i <=5 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i + "*" + j + "=" +  i*j + ", ");
            }
            System.out.println();
        }
    }
}
