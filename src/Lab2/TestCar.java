package Lab2;

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


        //update bCar details using the set method
        bCar.setMake("Vauxhall");
        bCar.setOwnerName("James Rodgers");
        bCar.setYearOfManufacture(2012);
        bCar.setCostPrice(10000);
        bCar.printCarInfo();


    }

}


//ID - 104
//Make – Toyota
//Owner – Robert Smith
//Colour - Blue
//Year – 2010
//Top Speed - 120
//Cost Price - £12,000
//Print out the attributes of cCar

//Make – Vauxhall
//Owner – James Rodgers
//Year – 2012
//Cost Price - £10,000
//Print out the attributes of bCar
//sistersCar 100 Ford My sister Mary Red 2008 105 £10,995.00
//bossCar 101 Honda Pat Bell Silver 2011 210 £27,500.00
//aCar 102 Ford Janet Allison Red - - -
//bCar 103 - John Smith - - 100 -