package Lab6;

public class OddNumbers {
    public static void main(String[] args) {
        double average;
        int total = 0;
        int noOfodd = 0;

        for (int number = 1; number <=50; number++) {
            if (number % 2 !=0) {
                System.out.println(number);
                noOfodd = noOfodd + 1;
                total +=number;

            }
        }
        average = (double) total/noOfodd;
        System.out.println("The total numbers is: " + total);
        System.out.println("The average numbers is: " + average);
    }
}
