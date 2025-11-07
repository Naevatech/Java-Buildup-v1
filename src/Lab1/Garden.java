package Lab1;
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.*;

public class Garden {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double lt_of_lawn, radius_of_lawn;
//        not done yet
        int randomNumber1 = (int) (Math.random()*21);
        int randomNumber2 = (int) (Math.random()*21);
        int answer = randomNumber1+randomNumber2;
        int userAns;
        String getAnswer;

        getAnswer = JOptionPane.showInputDialog("What is the addition of" + "+" + randomNumber1 + "+" + randomNumber2 + "+" + "=");
        userAns = Integer.parseInt(getAnswer);
        if (userAns != answer) {
            JOptionPane.showMessageDialog(null, "this is not correct, the answer is " + answer);
        }else {
            JOptionPane.showMessageDialog(null, "Great Job, you are correct. The answer is " + answer);
        }


        //formulas
        // Square or Rectangular Lawn: Area (m²) = Length (m) x Width (m)
        // Circular Lawn: Area (m²) = π (3.14) x Radius² (m)
        // Triangle: Area (m²) = 1/2 x Base (m) x Height (m)

//        Area of the lawn (square): $$\text{Area of square} = \text{side}^2$$
//        Area of the pond (circle): $$\text{Area of circle} = \pi \cdot \text{radius}^2$$
//        Area of grass: $$\text{Area of grass} = \text{Area of square} - \text{Area of circle}$$
    }
}
