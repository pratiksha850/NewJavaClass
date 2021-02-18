package assignment2;
import java.util.*;
public class FindArea {
       public static void main(String[]args){
           Scanner input = new Scanner(System.in);
           System.out.println("Radius: ");
           double radius = input.nextDouble();
           double area = 3.14 * radius * radius;
           System.out.println("Area of circle:  " + area);

           System.out.println("Length of rectangle: ");
           double length = input.nextDouble();
           System.out.println("Width of rectangle: ");
           double width = input.nextDouble();
           double rectangle = length * width ;
           System.out.println("Area of rectangle:  " + rectangle);

           System.out.println("Height of triangle: ");
           double height = input.nextDouble();
           System.out.println("Base width of rectangle: ");
           double baseWidth = input.nextDouble();
           double triangle = height * baseWidth ;
           System.out.println("Area of triangle:  " + triangle);
       }
}
