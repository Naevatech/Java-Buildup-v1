package RecordLabel;

public class CD {

    public static int cdID = 1;

    private int CD_number;
    private String artistName;
    private String nameOfAlbum;
    private double costPrice;
    private double salePrice;
    private int yearOfIssue;
    private boolean single;

    public CD(int cdNumber){
        CD_number = cdID;
        cdID++;
    }

    public CD(String artist_name, String name_of_album, int year_of_issue, boolean single_double) {
        artistName = artist_name;
        nameOfAlbum = name_of_album;
        yearOfIssue = year_of_issue;
        single = single_double;
        cdID++;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public CD(String artist_name, String name_of_album, double cost_price, double sale_price, int year_of_issue, boolean single_double) {
        artistName = artist_name;
        nameOfAlbum = name_of_album;
        costPrice = cost_price;
        salePrice = sale_price;
        yearOfIssue = year_of_issue;
        single = single_double;
        cdID++;
    }

    public void printAllInfo() {
        System.out.println("ALBUM OF THE DETAILS");
        System.out.println("=======================");
        System.out.println("Album NO: " + CD_number );
        System.out.println("Artist name: " + artistName );
        System.out.println("Name of Album: " + nameOfAlbum );
        System.out.println("Year of issue: " + yearOfIssue );
        System.out.println("Year of issue: " + yearOfIssue );
        System.out.println("Cost Price: " + costPrice);
        System.out.println("Sale Price: " + salePrice);
        System.out.println("Profit: " + getProfit());
    }
    public void updatePrices(double amountValue) {
        costPrice = costPrice + amountValue;
        salePrice = (amountValue*2) + salePrice;
    }
    public double getProfit() {
        return salePrice - costPrice;
    }
}



//number, name of artist, name of album, cost price, sale price, year of issue, single(true/false)