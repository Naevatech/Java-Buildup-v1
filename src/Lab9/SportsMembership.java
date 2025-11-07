package Lab9;
import java.util.Scanner;

public class SportsMembership {
    static Scanner keyboard = new Scanner(System.in);
    public static final String CompanyName() {
        return "Universal Gym";
    }

    public static String getClientName(){
        System.out.print("Enter the your name: ");
        return  keyboard.nextLine().substring(0,2);
    }
    public static int getDetails(String details) {
        int result;
        int name;
        System.out.print("Enter the value " + details + ": ");
        return  keyboard.nextInt();
    }
    public static int overallActivities(int swims, int gyms) {
        return swims + gyms;
    }
    public static String calculateDiscount(int swims, int gyms, int total_Activities) {

        String award = " ";
        if (total_Activities != 0) {
            if (total_Activities >= 50) {
                award = "Congratulations, you have been awarded GOLD discount of 60%";
            } else if (swims >= 20 && gyms >= 20) {
                award = "Congratulations, you have been awarded SILVER discount of 30%";
            } else if (swims >= 10 || gyms >= 10) {
                award = "Congratulations, you have been awarded BRONZE discount of 10%";
            }
        }
        else {
            award = "Unfortunately, you have not been awarded any discounts this time, keep trying.";
        }
        return award;
    }

    public static void main(String[] args) {
        String clientName, assignDiscount, company_Name, discount;
        int client_pin, swim_session_count, gym_session_count, overall_activities;
        clientName = getClientName();
        client_pin = getDetails("pin");
        swim_session_count = getDetails("swims");
        gym_session_count = getDetails("gyms");
        overall_activities = overallActivities(swim_session_count, gym_session_count);
        discount = calculateDiscount(swim_session_count, gym_session_count, overall_activities);
//        assignDiscount = assign_Discount(overall_activities);
        company_Name = CompanyName();


        System.out.println(company_Name);
        System.out.println("Client\t\t  ID\t\t Swims\t\t Gym\t\t Overall Activities");
        System.out.println(clientName+"\t\t" + client_pin +"\t\t    " + swim_session_count +"\t\t  " + gym_session_count +"\t\t" + overall_activities);
        System.out.println(discount);
    }
}
