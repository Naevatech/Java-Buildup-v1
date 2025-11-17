package TestPractise2;

public class Shoe {
    private int shoeSize;

    protected Shoe(){
    }
    protected Shoe(int check_shoeSize){
        shoeSize = check_shoeSize;
    }

    @Override
    public String toString() {
//        return "Shoe{" +
//                "shoeSize=" + shoeSize +
//                '}';
        return ("The shoe size is " + shoeSize);
    }

    public static void main(String[] args) {
        Shoe newShoe = new Shoe(56);

        System.out.println(newShoe);
    }
}
