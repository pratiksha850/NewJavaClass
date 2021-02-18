package day1;
 import java.util.Scanner;
public class Addition2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.println("Enter y: ");
        int y = input.nextInt();

        int sum = x + y;
        System.out.println(sum);
        System.out.print("Sum of x and y is " + sum);
        System.out.print("Sum of" + x + "and" + y + "is" + sum);

    }
}
