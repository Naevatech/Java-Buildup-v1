package Students;
import java.util.Scanner;

public class TestStudent {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int mark1, mark2, mark3;

        // object 1
        Student student1 = new Student("Michael");
        student1.printAllDetails();

        //object 2
        Student student2 = new Student("Jennifer", 45, 67, 55);
        student2.printAllDetails();

        //object 3
        Student student3 = new Student("John");
        System.out.println("What are " + student3.getName() + "marks");
        System.out.println("First mark: ");
        System.out.print("First mark: ");
        mark1 = keyboard.nextInt();
        System.out.print("Second mark: ");
        mark2 = keyboard.nextInt();
        System.out.print("Third mark: ");
        mark3 = keyboard.nextInt();
        student3.setMark(mark1, mark2, mark3);
        student3.printAllDetails();


    }


}
