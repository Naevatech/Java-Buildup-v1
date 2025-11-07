package Lab6;
import java.util.Scanner;


public class FizzBuzz {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int num1, num2;

        final int divisibleByThree =3, divisibleBySeven=7;
        System.out.println("Enter the first number");
        num1 = keyboard.nextInt();
        System.out.println("Enter the first number");
        num2 = keyboard.nextInt();

        for (int i = num1; i <= num2 ; i++) {
            System.out.println(i);
            if ((i % divisibleByThree)==0 || (i % divisibleBySeven)==0) {
                if ((i % divisibleByThree)==0) {
//                    System.out.println(i);
                    System.out.println("FIZZ");
                }
                if ((i % divisibleBySeven)==0) {
//                    System.out.println(i);
                    System.out.println("BUZZ");
                }
            }
            else {
                System.out.println(i + "\t\t\t");
            }
        }
    }
}
