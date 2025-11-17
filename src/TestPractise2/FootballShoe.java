package TestPractise2;

public class FootballShoe extends Shoe{
    private int shoeSize;
    private String maker;
    private String colour;

    protected FootballShoe(int shoeSize,  String check_maker){
        super(shoeSize);
        maker = check_maker;
    }



    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "FootballShoe{" +
                "shoeSize=" + super.toString() +
                ", maker='" + maker + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
