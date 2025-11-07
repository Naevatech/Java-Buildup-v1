package Lab1;
import java.util.Scanner;

public class ReadDoubleVariables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double price1, price2;
        System.out.print("Please enter a value for price 1: ");
        price1 = keyboard.nextDouble();
        System.out.print("Please enter a value for price 2: ");
        price2 = keyboard.nextDouble();
    }
}
