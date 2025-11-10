package Employees;

import java.util.Scanner;

public class TestEmployee {
    static  Scanner keyboard = new Scanner(System.in);
    // method
    public static String getText(String message) {
        System.out.println(message);
        return keyboard.nextLine();
    }

    public static void main(String[] args) {
        String name, number;
        double annualSalary, hourlyPay, monthlypay;
        int empNoOfHoursWord, hoursPerMonth ;

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
//        System.out.println("TEST CASUAL EMPLOYEE");
//        System.out.println("=======================");
//        name = getText("Employee name: ");
//        number = getText("Employee number: ");
//        CasualEmployee employee3 = new CasualEmployee(name, number);
//        System.out.println("What is " + employee3.getName() + "Hourly pay? ");
//        hourlyPay = keyboard.nextDouble();
//        employee3.setHourlyPay(hourlyPay);
//        System.out.println("How many hours has " + employee3.getName() + "work this week");
//        empNoOfHoursWord = keyboard.nextInt();
//        System.out.println("Employee: " + employee3.getName() +  "with ID" + employee3.getNumber());
//        System.out.println("Weekly pay: " + "$" + employee3.CalculateWeeklyPay(empNoOfHoursWord));

        // PART TIME WORKERS
        System.out.println("TEST PART TIME EMPLOYEE");
        System.out.println("=======================");
        name = getText("Employee name: ");
        number = getText("Employee number: ");

        PartTimeEmployee employee4 = new PartTimeEmployee(name, number);
        System.out.println("What is " + employee4.getName() + "Hourly pay? ");
        hourlyPay = keyboard.nextDouble();
        System.out.println("How many hours has per month do " + employee4.getName() + "works");
        hoursPerMonth = keyboard.nextInt();
        // print out
        System.out.println("Employee name: " + employee4.getName());
        System.out.println("Employee ID: " + employee4.getNumber());
        System.out.println("Monthly pay: " + employee4.getCalculateMonthlyPay(hourlyPay, hoursPerMonth));







    }
}

//
//Add code to your TestEmployee.java to test this new subclass by creating another employee
//        (employee4). You should prompt the user for Employee Number, Employee Name, Hourly
//Pay and Hours worked per month. The program should output the Employee Number and
//Monthly Pay eg
//Employee: D4586
//Monthly Pay: £1,360.00
//Week 7 Lab Exercises – Classes & Objects (2)
