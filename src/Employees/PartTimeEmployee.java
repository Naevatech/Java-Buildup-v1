package Employees;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String empName, String empNumber){
        super(empName, empNumber);
    }

    private  int hoursPerMonth;
    private double hourlyPay;

    public void setHourlyPay(int hoursPerMonth) {
        this.hourlyPay = hoursPerMonth;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHoursPerMonth(int hoursPerMonth) {
        this.hoursPerMonth = hoursPerMonth;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }
    public double getCalculateMonthlyPay(double hourlyPay, int hoursPerMonth) {
        return hourlyPay*hoursPerMonth;
    }
    protected String getStatus() {
        return ("Part-Time");
    }//getStatus
}
