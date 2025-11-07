package Lab2;
import java.util.Calendar;

public class Car {
    static Calendar calendar = Calendar.getInstance();
    //private attribute for the car
    private int id;
    private String make;
    private String ownerName;
    private String colour;
    private int yearOfManufacture;
    private int topSpeed;
    private double costPrice;
    private int age_of_car;

    public Car() {
        //default constructor
    }

    public Car(int carID, String carMake, String carOwnerName, String carColour){
        id = carID;
        make = carMake;
        ownerName = carOwnerName;
        colour = carColour;
    }

    public Car(int carID, String carOwnerName, int maxSpeed) {
        id = carID;
        ownerName = carOwnerName;
        topSpeed = maxSpeed;
    }

    public Car(int carID, String carMake, String carOwnerName, String carColour, int carYearOfManufacture, int maxSpeed, double carCostPrice) {
        id = carID;
        make = carMake;
        ownerName = carOwnerName;
        colour = carColour;
        yearOfManufacture = carYearOfManufacture;
        topSpeed = maxSpeed;
        costPrice = carCostPrice;
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
        int year = calendar.get(Calendar.YEAR);
        age_of_car = year - yearOfManufacture;
        return age_of_car;
    }

    public void printCarInfo() {
        System.out.println("The ID is " + id);
        System.out.println("The maker is " + make);
        System.out.println("The owner name is " + ownerName);
        System.out.println("The colour is " + colour);
        System.out.println("The years of manufacturer is " + yearOfManufacture);
        System.out.println("The top speed is " + topSpeed);
        System.out.println("The cost price is " + costPrice);

        if (age_of_car != 0) {

        }
    }
}

//A constructor which has all 7 parameters in the signature and assigns these values
//A constructor which has 4 parameters (id, make, owner, colour) in the signature and assigns
//these values and the other three parameters are appropriately initialised
//A constructor which has 3 parameters (id, owner, maximum speed) in the signature and assigns
//these values and the other four parameters are appropriately initialised.
//



//id (integer)
//make (String) ownerName
//(String) colour (String)
//yearOfManufacture
//        (integer) topSpeed
//(integer) costPrice
//        (double)