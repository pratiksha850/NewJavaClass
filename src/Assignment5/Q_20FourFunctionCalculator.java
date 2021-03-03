package Assignment5;
import java.util.*;
public class Q_20FourFunctionCalculator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();

        System.out.println("Enter an operator(+, -, *, /): ");
        char operator = input.next().charAt(0);
        input.close();
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("wrong operator.");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+ " "+"is: " + result );
    }
}