package assignment1;
import java.util.Scanner;
public class Simple_Interest {
    public static void main (String[] args){
        float p, t, r;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principle : ");
        p = input.nextFloat();

        System.out.print("Enter the time period : ");
        t = input.nextFloat();

        System.out.print("Enter the interest rate : ");
        r = input.nextFloat();

        float interest_rate;
        interest_rate = (p * t * r) / 100;
        System.out.print("The simple interest is : " + interest_rate);


    }
}
