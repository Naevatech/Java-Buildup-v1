package Lab1;
import java.util.Scanner;

public class StudentMarks1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //variables declaration
        String name;
        String grade;
        double courseWork, examination, result;
        final double AVERAGE = 0.5;
        final int PASSMARK = 40;
        final int DISTINCTION = 70;


        //user input
        System.out.println("Enter you full name");
        name = keyboard.nextLine();
        System.out.println("Enter course work mark");
        courseWork = keyboard.nextDouble();
        System.out.println("Enter course examination mark");
        examination = keyboard.nextDouble();
        result = (courseWork + examination) * AVERAGE;

        if (courseWork < PASSMARK || examination < PASSMARK) {
            grade = "fail";
        } else {
            if (result < DISTINCTION) {
                grade = "Pass";
            }else {
                grade = "Distinction";
            }
        }
        System.out.println("Name\t\t\t " + "Course Work\t\t\t " + "Examination\t\t " + "Overall\t\t\t " + "Grade\t\t\t " );
        System.out.println(name + "\t\t\t" + courseWork + "\t\t\t" + examination + "\t\t\t" + result + "\t\t\t"  + grade);
    }
}
