package Lab1;

import java.util.Scanner;

public class Pay1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName, middleName, surname;
        double no_of_hours_work;
        final double minimum_wages = 5.95;

        System.out.println("Enter your firstName");
        firstName =keyboard.nextLine();
        System.out.println("Enter your middleName");
        middleName = keyboard.nextLine();
        System.out.println("Enter your surname");
        surname = keyboard.nextLine();

        System.out.println("Enter number of hours work");
        no_of_hours_work = keyboard.nextDouble();

        System.out.println("Hello" + firstName + " " + middleName + " " + surname + ", " + "Your total pay for this week is" + "£" + (no_of_hours_work * minimum_wages) );

    }
}
