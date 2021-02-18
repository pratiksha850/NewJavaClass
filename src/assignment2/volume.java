package assignment2;
import java.util.*;
public class volume {
    //radius and length of cylinder and computes volume
    public static void main (String[]args){
        Scanner radius = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder: ");
        double r = radius.nextDouble();
        System.out.println("Enter the length of the cylinder: ");
        double l = radius.nextDouble();

        double volume = 3.14 + Math.pow(r,2) + l;
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
