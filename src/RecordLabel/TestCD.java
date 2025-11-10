package RecordLabel;

public class TestCD {
    public static void main(String[] args) {
        String artistName, nameOfAlbum;
        double costPrice,salePrice;
        int yearOfIssue;
        boolean single;

        //object 1
        CD myCD = new CD("Bob Marley", "Legend", 1980, true);
        myCD.printAllInfo();
        System.out.println(myCD.getYearOfIssue());

        //object 2
        CD yourCD = new CD("Bonnie Raitt", "Nick of Time", 6.25, 11.99, 1989, true );
        yourCD.printAllInfo();
        yourCD.updatePrices(2.50);
        yourCD.printAllInfo();
        yourCD.updatePrices(5.00);
        yourCD.printAllInfo();
        yourCD.getProfit();
    }
}




//Provide a call to a method from the class CD to will increase the cost price and the
//sales price of the yourCD object by £2.50 and £5.00 (respectively).
//Print out all the details of yourCD.
//Provide a suitable call to test the method getProfit().

