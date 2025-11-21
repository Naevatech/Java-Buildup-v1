package ToString;

/**
 * Created by User1 on $[DATE}
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ToString {

    public static void main(String[] args) {
//        A class is immutable if its state cannot be changed once
//        it has been created
        String sentence1 = "abc";
        String sentence2 = "abc";
        String sentence3 = "a";
        String sentence4 = "a" + "bc";
        String sentence5 = sentence3 + "bc";
        String sentence6 = "xyz";
        String sentence7 = sentence5.intern();
        //toString() Returns a text String representing the object it is called on
        System.out.println("Sentence 1 == Sentence 2 = " + (sentence1==sentence2));

        System.out.println("Sentence 1 == Sentence 3 = " + (sentence1==sentence3));

        System.out.println("Sentence 1 == Sentence 4 = " + (sentence1==sentence4));

        System.out.println("Sentence 1 == Sentence 5 = " + (sentence1==sentence5));


        System.out.println("Sentence 1 == Sentence 6 = " + (sentence1==sentence6));


        System.out.println("Sentence 1 == Sentence 7 = " + (sentence1==sentence7));



    }//main
}//class


//Public method is a service for an object
//It is invoked by the client of an object
//It defines a service that the object provides
//Private method – support method
//It cannot be invoked from outside the object
//It is used to support other methods in the class

//OVERRIDES = AN IDENTICAL PARAMETER
//OVERLOADING = A DIFFERENT PARAMETER

//application class is the class that contains
//the main method. JVM start running code from here
//non application class is the class that does
//not contain a main method. Used for logic, data
//object structure

//Encapsulation - Protecting data by keeping variable private and assessing them through a public method (Getter and setter) i.e attribut of an object should only be manipulated by method of that object - Encapsulate to protect
//
//Abstraction - This hides details
//This is showing only essential features and hiding complex details
//
//
//Inheritance - Sharing of attribute and methods among classes
//Allows a class(CHILD) to acquire properties and method of another class(parent)
//
//Polymorphism - This means many form
//The same method behave differently depending on the object

//Abstract class - A class that has not been fully specified.
//Abstract class can only be used to create sub classes
//
//        Super Class - This is the class which properties and method are inherited by another class
//Sub Class - Is a class that is inherit from super class
//extend - Use for inheritance.
//new - use to create an object in java
//
//Method Overiding
//You create the same method name
//		 ...the same parameters
//with different classes
//Happens at runtime - runtime polymorphism
//
//Method Overloading
//You create the same method name
//with different parameters
//with the same classes
//Happens at compile time - compile time polymorphism

