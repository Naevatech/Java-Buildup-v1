package ToString;

/**
 * Created by User1 on $[DATE}
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ToString {

    public static void main(String[] args) {

        String sentence1 = "abc";
        String sentence2 = "abc";
        String sentence3 = "a";
        String sentence4 = "a" + "bc";
        String sentence5 = sentence3 + "bc";
        String sentence6 = "xyz";
        String sentence7 = sentence5.intern();

        System.out.println("Sentence 1 == Sentence 2 = " + (sentence1==sentence2));

        System.out.println("Sentence 1 == Sentence 3 = " + (sentence1==sentence3));

        System.out.println("Sentence 1 == Sentence 4 = " + (sentence1==sentence4));

        System.out.println("Sentence 1 == Sentence 5 = " + (sentence1==sentence5));


        System.out.println("Sentence 1 == Sentence 6 = " + (sentence1==sentence6));


        System.out.println("Sentence 1 == Sentence 7 = " + (sentence1==sentence7));



    }//main
}//class
