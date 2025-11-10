package Employees;
import java.util.Scanner;

public class TestEmployee {
    static  Scanner keyboard = new Scanner(System.in);
    // method
    public static String getText(String message) {
        System.out.println(message);
        return keyboard.nextLine();
    }

    static void main(String[] args) {
        String name, number;
        double annualSalary, hourlyPay;
        int empNoOfHoursWord;

        // Employee
//        System.out.println("TEST EMPLOYEE");
//        System.out.println("====================");
//        name = getText("Employee name: ");
//        number = getText("Employee number: ");
//        Employee employee1 = new Employee(name, number);
//        System.out.println("Employee with ID number " + employee1.getName() + " is " + employee1.getNumber());

        //Full time employee
//        System.out.println("TEST FULLTIME EMPLOYEE");
//        System.out.println("=======================");
//        name = getText("Employee name: ");
//        number = getText("Employee number: ");
//        FullTimeEmployee employee2 = new FullTimeEmployee(name, number);
//        System.out.println("Employee with ID number " + employee2.getName() + " is " + employee2.getNumber());
//        System.out.println("What is " + employee2.getName() + " annual salary? ");
//        annualSalary = keyboard.nextDouble();
//        employee2.setAnnualSalary(annualSalary);
//        keyboard.nextLine();
//        System.out.println("Employee: " + employee2.getName());
//        System.out.println("Month pay: " + employee2.getMonthlySalary());

        // CASUAL WORKERS
        System.out.println("TEST CASUAL EMPLOYEE");
        System.out.println("=======================");
        name = getText("Employee name: ");
        number = getText("Employee number: ");
        CasualEmployee employee3 = new CasualEmployee(name, number);
        System.out.println("What is " + employee3.getName() + "Hourly pay? ");
        hourlyPay = keyboard.nextDouble();
        employee3.setHourlyPay(hourlyPay);
        System.out.println("How many hours has " + employee3.getName() + "work this week");
        empNoOfHoursWord = keyboard.nextInt();
        System.out.println("Employee: " + employee3.getName() +  "with ID" + employee3.getNumber());
        System.out.println("Weekly pay: " + "$" + employee3.CalculateWeeklyPay(empNoOfHoursWord));
    }
}

//
//Test casual EMPLOYEE15
//=======================16
//Employee Number : J680217
//Employee Name : Alison Gordon18
//What is Alison Gordon's hourly pay? £8.5019
//How many hours has Alison Gordon worked this week? 22
//Employee: J680221
//Weekly Pay: £0,187.0022
