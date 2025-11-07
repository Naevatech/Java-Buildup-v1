package Lab6;
import java.text.DecimalFormat;

public class KilosToPounds {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0");
        final double poundConvert = 2.20462;
        System.out.println("Kilograms " + " Pounds");
        for (int num = 5; num <=100 ; num+=5) {
            System.out.println(num + "\t          " + df.format(num*poundConvert) + ", ");
        }
    }
}



//pounds=kilograms×2.20462