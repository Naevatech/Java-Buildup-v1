package Employees;

public class CasualEmployee extends Employee {
    private double hourlyPay;

    public CasualEmployee(String empName, String empNumber) {
        super(empName, empNumber);
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    public double getHourlyPay() {
        return hourlyPay;
    }
    public double CalculateWeeklyPay(int empNoOfHours) {
        return empNoOfHours * hourlyPay;
    }
    protected String getStatus() {
        return ("Casual");
    }//getStatus
}
