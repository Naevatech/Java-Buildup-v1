package Array;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Commision {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");

        final int MAX = 10;
        int[] sales = new int[MAX];
        int total = 0;
        double commissionLevel;
        for (int i = 0; i < MAX; i++) {
            System.out.print("Enter sales of Salesman " + (i + 1) + ": ");
            sales[i] = keyboard.nextInt();
        }
        //Calculate commission level
        for (int index = 0; index < MAX; index++) {
            total = total + sales[index];
        }//for
        commissionLevel = (double) ((total / MAX) * 2 / 3);

        //Print out the results
        System.out.println("\nThe following Salesmen qualify for Commission");
        System.out.println("Reference No\t\tAmount");
        for (int index = 0; index < MAX; index++) {
            if (sales[index] > commissionLevel) {
                System.out.println("\t" + (index + 1) + "\t\t\t\t" + df.format((sales[index] - commissionLevel)));
            }//if
        }//for
    }
}
