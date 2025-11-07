package ProgramUpdate;

public class TestDog {
    public static void main(String[] args) {
        //create new objects of
        Dog d1 = new Dog( "lego", 16); //new instance of dog
        Dog d2 = new Dog( "lego", 16); //new instance of dog

        //print out the details of each dog
        //object reference memory
        //static-method oveloading
        //dynamic polymorphism-happens in compile time
//        encapsulation, abstraction
//        inheritance, 4 pillar of OOP
        //abstraction
        d1.printDogInfo();
        System.out.println();
        d2.printDogInfo();
    }
}
