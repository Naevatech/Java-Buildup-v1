package Lab1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ConvertMiles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double milesTraveled;

        System.out.println("Enter hours travelled(in miles)");
        milesTraveled = keyboard.nextDouble();
        //conversion to kilometers
//        System.out.println(milesTraveled * 1.609);
        //convert to 2 decimal place
        String milesConverted = df.format((milesTraveled * 1.609));
        System.out.println(milesConverted);
    }
}
