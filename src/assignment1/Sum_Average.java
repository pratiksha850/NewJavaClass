package assignment1;
import java.util.Scanner;
public class Sum_Average {
    public static void main(String[]args){
        int x, y, sum;
        float average;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        x = input.nextInt();

        System.out.println("Enter second number : ");
        y = input.nextInt();

        sum = x + y;
        average = (float)((x + y)/2);
        System.out.println( "Sum : " + sum + "\nAverage : " + average);

    }
}
