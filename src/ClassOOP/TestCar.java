package ClassOOP;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.printCarInfo();

        Car sisterCars = new Car(100, "ford", "My sister mary", "Red", 2008, 105, 10995.00);
        sisterCars.printCarInfo();

        Car bossCar = new Car(101, "Honda", "Pat Bell", "Silver, 2011, 210, 27500.00");
        bossCar.printCarInfo();

        Car aCar = new Car(102, "FORD", "Jannet Allison", "RED");
        aCar.printCarInfo();

        Car bCar =  new Car(103, "johnSmith", 100);
        bCar.printCarInfo();

        Car cCar = new Car();
        cCar.printCarInfo();
        cCar.setId(104);
        cCar.setMake("Toyota");
        cCar.setOwnerName("Robert Smith");
        cCar.setColour("Blue");
        cCar.setYearOfManufacture(2010);
        cCar.setTopSpeed(120);
        cCar.setCostPrice(12000);
        cCar.printCarInfo();



        //using get method to prompt out
        System.out.println("Type C car maker is " + cCar.getMake());
        System.out.println("Type C car colour is " + cCar.getColour());
        System.out.println("Type C car year of manufacturer is " + cCar.getYearOfManufacture());
        System.out.println("Type C car age of car " + cCar.ageOfCar(cCar.getYearOfManufacture()));
        System.out.println("The current value of car is " + cCar.currentValue(cCar.getYearOfManufacture(), cCar.getCostPrice(), cCar.ageOfCar(cCar.getYearOfManufacture())));
        System.out.println("The number of cars created is " + Car.numbersOfCars());


        //update bCar details using the set method
        bCar.setMake("Vauxhall");
        bCar.setOwnerName("James Rodgers");
        bCar.setYearOfManufacture(2012);
        bCar.setCostPrice(10000);
        bCar.printCarInfo();


    }

}

