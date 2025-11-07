package ProgramUpdate;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.printCarDetails();

        Car someCar = new Car();
        someCar.printCarDetails();

        Car herCar = new Car("MIA 10", 3);
        herCar.printCarDetails();

        Car hisCar = new Car("HDZ 3434", 4, "blue");
        hisCar.printCarDetails();

        Car janeCar = new Car("blue", "MNZ 6700");
        janeCar.printCarDetails();

        Car johnCar = new Car(3, "PSR 911H");
        johnCar.printCarDetails();

        Car completeCar = new Car("Yellow", "VIA 4091", 5, false);
        completeCar.printCarDetails();

        //use of get methods
        System.out.println("Colour of car " + herCar.getRegNumber() + " is " + herCar.getColour());
        System.out.println(johnCar.getRegNumber() + " has " + johnCar.getColour() + "\n");
        myCar.setColour("Blue");
        myCar.setRegNumber("BWF 2341");
        myCar.setNoOfDoors(4);
        myCar.setHasACD(false);
        myCar.printCarDetails();



    }
}
