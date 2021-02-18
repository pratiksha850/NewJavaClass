package assignment3;
import java.io.*;
import java.util.Scanner;

public class WithoutTempVariable {
    public static void main(String[]args){
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Numbers before swapping: "+ a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swapping: "+ a + " " + b);

    }
}
