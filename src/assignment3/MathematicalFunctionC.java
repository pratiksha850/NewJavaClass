package assignment3;
import java.util.*;
//Quadratic equation
public class MathematicalFunctionC {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a1 = input.nextDouble();
        System.out.println("Enter the value of b: ");
        double b1 = input.nextDouble();
        System.out.println("Enter the value of c: ");
        double c1 = input.nextDouble();

        double x_up = -b1 + Math.sqrt((b1 * b1) - (4 * a1 * c1));
        double x = x_up / 2 * a1;
        System.out.println("The value of x for quadratic equation is: " + x);
    }

}
