package OveridingMethod;

/**
 * Created by User1 on
 * COMMENTS ABOUT PROGRAM HERE
 */

   abstract public class Employee1{
    //Instance variables
    private String name;
    private String number;



    //Constructor
    protected Employee1(){

    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
    //Methods

      abstract protected String getStatus();

   }//class


