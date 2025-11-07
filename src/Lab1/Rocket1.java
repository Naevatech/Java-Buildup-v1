package Lab1;
import java.util.Scanner;

public class Rocket1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //VARIABLES
         int hours, minute, seconds;
         int take_off_time, flightTime, expected_arrival_time;
         int the_hrs, the_min, the_seconds;
         System.out.println("Enter the hours of time to take off as HH:MM:SS: Press ENTER > ");
         System.out.print("Enter the hours: ");
         hours = keyboard.nextInt();
         System.out.print("Enter the minute: ");
         minute = keyboard.nextInt();
         System.out.print("Enter the seconds: ");
         seconds = keyboard.nextInt();

         System.out.println("Take of time  " + hours + ":" + minute + ":" + seconds);

        System.out.print("Enter your flight time in seconds");
        take_off_time = keyboard.nextInt();

        //conversion of seconds to hh:mm:ss
        the_hrs = (take_off_time / 3600) + hours;
        the_min = (take_off_time % 3600)/60 + minute;
        the_seconds = (take_off_time % 60) + seconds;

        //output
        System.out.println("Take of time " + hours + ":" + minute + ":" + seconds);
        System.out.println("Flight time " + take_off_time);
        System.out.println("Expected Arrival Time " + the_hrs + ":" + the_min + ":" + the_seconds);
    }
}
