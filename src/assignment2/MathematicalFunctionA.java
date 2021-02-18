package assignment2;
import java.util.*;
public class MathematicalFunctionA {
    //Question no.10A: Distance calculation
          public static void main(String[]args){

              Scanner sc = new Scanner(System.in);

              System.out.println(" Enter the initial velocity of the vehicle(m/s):  ");
              double u = sc.nextDouble();
              System.out.println("Enter the acceleration of the vehicle (m/sec.square): ");
              double a = sc.nextDouble();
              System.out.println("Enter the time required to travel the distance(s): ");
              double t = sc.nextDouble();

              double s = (u * t) + ((a * t * t) / 2);
              System.out.println(" The distance travelled by the vehicle is: " + s);
          }
}
