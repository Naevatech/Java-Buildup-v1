package Lab1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Pay2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String nameOfEmployee;
        double no_of_hours_work, overWorkedHour;
        final double standardTime = 40, hourlyRate = 5.95, overtimeHourlyRate = 8.5;

        System.out.println("What the name of Employee");
        nameOfEmployee = keyboard.nextLine();
        System.out.println("Enter Hours Worked");
        no_of_hours_work = keyboard.nextDouble();

        if (no_of_hours_work > standardTime) {
            overWorkedHour = no_of_hours_work - standardTime;
            System.out.println(nameOfEmployee);
            System.out.println("You normal working time:\t\t\t   £" + df.format(standardTime*hourlyRate) );
            System.out.println("Extra hour worked:\t\t\t   £" + df.format(overWorkedHour*overtimeHourlyRate));
            System.out.println(nameOfEmployee + "your total pay for this week is" + df.format((standardTime*hourlyRate) + (overWorkedHour*overtimeHourlyRate) ));
        }else {
            System.out.println(nameOfEmployee + "your total pay for this week is:\t\t\t   £" + df.format((no_of_hours_work*hourlyRate) ));
        }



    }
}


//40 * 5.95 = 238.00
//        10 * 8.50 = 85.00
//Total = £323.00