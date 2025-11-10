package Employees;

public class FullTimeEmployee extends Employee {
    //class variable
    private double annualSalary;

    public FullTimeEmployee(String empName, String empNumber) {
        super(empName, empNumber);
    } // constructor

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public double getMonthlySalary() {
        return annualSalary/12;
    }


}
