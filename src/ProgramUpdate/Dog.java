package ProgramUpdate;

public class Dog {
    private String name;
    private int age;

    //default constructor
    public Dog(){

    }

    //overloaded constructor
    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }

    //void method to carry put print process of dog details
    public void   printDogInfo() {
        System.out.println("Dog name is " + name + ".");
        System.out.println("Dog age is " + age + ".");
    }

}
