package Lab1;
import java.util.Scanner;

public class CheckLetterShape {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String inputLetter;

        System.out.println("Enter the letter (A-Z)");
        inputLetter = keyboard.nextLine().toUpperCase();
        System.out.println(inputLetter);

        switch (inputLetter) {
            case "A": case "E": case "F": case "H": case "I": case "K": case "L": case "M": case "N": case "T": case "V": case "W": case "X": case "Y": case "Z":
                System.out.println("A STRAIGHT letter");
                break;
            case "C": case "0": case "S":
                System.out.println("A CURVED letter");
                break;
            case "B": case "D": case "G": case "J": case "P": case "Q": case "R": case "U":
                System.out.println("A MIXTURE letter");
                break;
            default:
                System.out.println("The value you enter is out of range");
        }

    }
}

//A, E, F, H, I, K, L, M, N, T, V, W, X, Y, Z
//B, D, G, J, P, Q, R, U