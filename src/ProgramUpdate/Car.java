package ProgramUpdate;

public class Car {
    private String colour;
    private String regNumber;
    private int noOfDoors;
    private boolean hasACD;

    public Car(){

    } //Default constructor

    public Car(String reg, int doors){
        regNumber = reg;
        noOfDoors = doors;
    }//Alternative Constructor

    public Car(String reg, int doors, String carColour) {
        regNumber = reg;
        noOfDoors = doors;
        colour = carColour;
        hasACD = false;
    }//Alternative Constructor

    public Car(int doors, String reg){
        noOfDoors = doors;
        regNumber = reg;
        colour = "unknown";
        hasACD = true;
    }//Alternative Constructor

    public Car(String carColour, String reg, int doors, boolean cd){
        colour = carColour;
        regNumber = reg;
        noOfDoors = doors;
        hasACD = cd;
    }//Alternative Constructor

    public Car(String carColour, String reg){
        colour = carColour;
        regNumber = reg;
    }//Alternative Constructor

    public void setColour(String carColour) {
        colour = carColour;
    }
    public void setRegNumber(String reg) {
        regNumber = reg;
    }
    public void setNoOfDoors(int doors) {
        noOfDoors = doors;
    }
    public void setHasACD(boolean cd){
        hasACD = cd;
    }

    public String getColour(){
        return colour;
    }
    public String getRegNumber(){
        return regNumber;
    }
    public int getNoOfDoors() {
        return noOfDoors;
    }
    public boolean getHasACD(){
        return hasACD;
    }

    //Method to print out all details of a car
    public void printCarDetails() {
        System.out.println("Car Details");
        System.out.println("The registration of the car is " + regNumber);
        System.out.println("The colour of the car is " + colour );
        System.out.println("The car has " + noOfDoors + " doors");
        if (hasACD) {
            System.out.println("The car has a CD");
        }else {
            System.out.println("The car does not have a CD");
        }
        System.out.println("==============");
    }
}
