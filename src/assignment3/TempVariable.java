package assignment3;
import java.util.*;

public class TempVariable {
    public static void main(String[]args){
        int x, y, temp;
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the value of x and y: ");
         x = input.nextInt();
         y = input.nextInt();
        System.out.println("Numbers before swapping: "+ x + " " + y);
         temp = x;
         x = y;
         y = temp;
        System.out.println("Numbers after swapping: " + x + " " + y);
    }

}
