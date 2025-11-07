package Lab1;

public class ReadCharVariable {
    public static void main(String[] args) {
        char char1 = 90;
        System.out.println(char1);

        char char2 = (char)65;
        System.out.println(char2);

        int char3 = (int) 'Z';
        System.out.println(char3);

        int char4 = (int) 'A';
        System.out.println(char4);

        int char5 = (int)'0';
        System.out.println(char5);

        char char6 = (char)48;
        System.out.println(char6);

        char char7 = (char) 65;
        System.out.println(char7);

        char letter = 'e';
        System.out.println ((char)((int)letter-32));

        char letter1 = 'd';
        letter1=Character.toUpperCase(letter1);
        System.out.println(letter1);
    }
}
