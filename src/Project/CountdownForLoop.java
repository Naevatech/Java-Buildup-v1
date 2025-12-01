package Project;

public class CountdownForLoop {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted while waiting");
                Thread.currentThread().interrupt(); // restore interrupt status
            }
        }
        System.out.println("Done");
    }
}

//refrence
//https://medium.com/@AlexanderObregon/building-a-countdown-timer-in-java-using-loops-for-beginners-67db5d461c18