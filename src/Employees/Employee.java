package Employees;

public class Employee {

    // instance variable
    private String number;
    private String name;


    public Employee(String empName, String empNumber){
        name = empName;
        number = empNumber;
    } // constructor

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }

}
