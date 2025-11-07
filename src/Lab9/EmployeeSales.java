package Lab9;
import java.util.Scanner;

public class EmployeeSales {
    static Scanner keyboard = new Scanner(System.in);
    public static String employeeName() {
        System.out.print("Enter your name: ");
        return keyboard.nextLine();
    }
    public static void main(String[] args) {
        String name;

        employeeName();
    }
}
