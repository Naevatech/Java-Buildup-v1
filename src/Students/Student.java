package Students;
import java.text.DecimalFormat;

public class Student {
    DecimalFormat dp = new DecimalFormat("0.00");
//    class variable
    private static int nextUniqueID = 1;

//    instance variable
    private int studentID;
    private String name;
    private int mark1, mark2, mark3;

    public Student() {
        studentID = nextUniqueID;
        nextUniqueID++;
    } // default constructor

    public Student(String studentName) {
        studentID = nextUniqueID;
        name = studentName;
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
        nextUniqueID++;
    } //alternative constructor

    public Student(String StudentName, int firstMark, int secondMark, int thirdMark) {
        studentID = nextUniqueID;
        name = StudentName;
        mark1 = firstMark;
        mark2 = secondMark;
        mark3 = thirdMark;
        nextUniqueID++;
    }

    // setMethod
    public void setName(String name) {
        this.name = name;
    }
    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }
    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }
    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    //getMethod
    public String getName() {
        return name;
    }
    public int getMark1() {
        return mark1;
    }
    public int getMark2() {
        return mark2;
    }
    public int getMark3() {
        return mark3;
    }

    public void setMark(int firstMark, int secondMark, int thirdMark) {
        mark1 = firstMark;
        mark2 = secondMark;
        mark3 = thirdMark;
    }

    public double getAverage() {
        return (double) (mark1 + mark2 + mark3)/3;
    }

    public static void printNextUniqueID() {
        System.out.print("The next available unique ID is " + nextUniqueID);
    }

    public void  printAllDetails() {
        double result;
        System.out.println("The Student ID is " + studentID);
        System.out.println("The name of the student is " + name);
        System.out.println("The student's three marks are : ");
        System.out.println(mark1 + "%");
        System.out.println(mark2 + "%");
        System.out.println(mark3 + "%");

        result = getAverage();
        if (result == 0) {
            System.out.println("Average not computable - marks have not been entered");
        } else {
            System.out.println("The average mark of the student is " + dp.format(result) + "%");
        }
    }
}


