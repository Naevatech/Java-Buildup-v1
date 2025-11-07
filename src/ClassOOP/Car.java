package ClassOOP;
import java.util.Calendar;
import java.util.Scanner;

public class Car {
    static Calendar calendar = Calendar.getInstance();
    static Scanner keyboard = new Scanner(System.in);
    //private attribute for the car
    private int id;
    private String make;
    private String ownerName;
    private String colour;
    private int yearOfManufacture;
    private int topSpeed;
    private double costPrice;
    private static int noOfCars = 0;



    public Car() {
        //default constructor
    }

    public Car(int carID, String carMake, String carOwnerName, String carColour){
        id = carID;
        make = carMake;
        ownerName = carOwnerName;
        colour = carColour;
        noOfCars++;
    }

    public Car(int carID, String carOwnerName, int maxSpeed) {
        id = carID;
        ownerName = carOwnerName;
        topSpeed = maxSpeed;
        noOfCars++;
    }

    public Car(int carID, String carMake, String carOwnerName, String carColour, int carYearOfManufacture, int maxSpeed, double carCostPrice) {
        id = carID;
        make = carMake;
        ownerName = carOwnerName;
        colour = carColour;
        yearOfManufacture = carYearOfManufacture;
        topSpeed = maxSpeed;
        costPrice = carCostPrice;
        noOfCars++;
    }

    public static int numbersOfCars() {
        return noOfCars;
    }
//  set method
    public void setId(int id) {
        this.id = id;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

//    get method
    public int getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public int ageOfCar(int yearOfManufacture){
        if (yearOfManufacture < 0){
            return -1;
        }else {
            int year = calendar.get(Calendar.YEAR);
            return (year - yearOfManufacture);
        }
    }

    public double currentValue(int yearOfManufacture, double costPrice, int age_of_car){
        System.out.println("Enter the depreciation rate for the car");
        double depreciationRate = keyboard.nextInt();
        if (yearOfManufacture<0) {
            return -1;
        }
        else {
            return (costPrice - (costPrice *(depreciationRate/100)*age_of_car));
        }
    }



    public void printCarInfo() {
        System.out.println("The ID is " + id);
        System.out.println("The maker is " + make);
        System.out.println("The owner name is " + ownerName);
        System.out.println("The colour is " + colour);
        System.out.println("The years of manufacturer is " + yearOfManufacture);
        System.out.println("The top speed is " + topSpeed);
        System.out.println("The cost price is " + costPrice);

    }
}
