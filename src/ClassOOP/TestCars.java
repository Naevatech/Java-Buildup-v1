package ClassOOP;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Program to test the Cars class
 */

public class TestCars {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");

        int years;
        double number, currentValueOfCars;

        // Create new Cars objects
        Cars myCars = new Cars();

        Cars sistersCars = new Cars(100, "Ford", "My sister Mary",
                "Red", 2008, 105, 10995.00);

        Cars bossCars = new Cars(101, "Honda", "Pat Bell", "Silver",
                2011, 210, 27500.00);

        Cars aCars = new Cars(102, "Ford", "Janet Allison", "Red");

        Cars bCars = new Cars(103, "John Smith", 100);

        // Print out the details of each Car
        myCars.printCarsInfo();
        sistersCars.printCarsInfo();
        bossCars.printCarsInfo();
        aCars.printCarsInfo();
        bCars.printCarsInfo();

        // Set some attributes of bCars
        bCars.setMake("Vauxhall");
        bCars.setOwner("James Rogers");
        bCars.setYear(2012);
        bCars.setCost(10000);

        // Print out the details of bCars
        bCars.printCarsInfo();

        // Create, set and print out the attributes of cCars
        Cars cCars = new Cars();
        cCars.setID(104);
        cCars.setMake("Toyota");
        cCars.setOwner("Robert Smith");
        cCars.setColour("Blue");
        cCars.setYear(2010);
        cCars.setSpeed(120);
        cCars.setCost(12000);
        cCars.printCarsInfo();

        // Print out some attributes for bCars
        System.out.println("The make of Cars " + bCars.getID() + " is " + bCars.getMake());
        System.out.println("The colour of Cars " + bCars.getID() + " is " + aCars.getColour());
        System.out.println("The year of manufacture of Cars " +
                bCars.getID() + " is " + bCars.getYear() + "\n");

        // Test user-defined method to calculate the age of a Cars
        System.out.println("Cars " + cCars.getID() + " is " +
                cCars.ageOfCar() + " years old\n");
        years = aCars.ageOfCar();
        if (years == -1) {
            System.out.println("Year of manufacture not recorded for Cars " + aCars.getID() + "\n");
        }//if
        else {
            System.out.println("Cars " + aCars.getID() + " is " +
                    years + " years old\n");
        }//else

        // Test user-defined method to find current value of a Cars
        System.out.print("What is the yearly percentage depreciation for Cars " + cCars.getID() + " : ");
        number = keyboard.nextDouble();
        System.out.println("The current value of Cars " +
                cCars.getID() + " is £" +
                df.format(cCars.currentValue(number)) + "\n");

        System.out.print("What is the yearly percentage depreciation for Cars " + aCars.getID() + " : ");
        number = keyboard.nextDouble();
        currentValueOfCars = aCars.currentValue(number);
        if (currentValueOfCars == -1) {
            System.out.println("Year of manufacture and/or Cost not recorded for Cars " + aCars.getID() + "\n");
        }//if
        else {
            System.out.println("The current value of Cars " +
                    aCars.getID() + " is £" +
                    df.format(currentValueOfCars) + "\n");
        }//else

    }//main
}//class
