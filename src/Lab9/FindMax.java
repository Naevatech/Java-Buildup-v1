package Lab9;
import java.util.Scanner;

public class FindMax {
    static  Scanner keyboard = new Scanner(System.in);

    public static int printAnswer(int num) {
        System.out.println("The larger number is "+ num);
        return num;
    }

    public static int getNumber() {
        System.out.print("Enter the value");
        return keyboard.nextInt();
    }

    public static int max(int num1, int num2) {
        int larger;
        if (num1 > num2) {
            larger = num1;
        } else {
            larger = num2;
        }
        return larger;
    }



    public static void main(String[] args) {
        int number1;
        int number2;
        number1 = getNumber();
        number2 = getNumber();
        printAnswer(max(number1, number2));

    }
}
