package assignment2;
import java.util.Scanner;
public class FahrenheitToCelsius {
        //convert fahrenheit to celsius
        public static void main(String[] Strings) {

            float celsious, fahrenheit;

            Scanner s=new Scanner(System.in);
            System.out.println("Enter temp. in Celsius :");
            celsious=s.nextInt();

            fahrenheit = celsious * 9/5 + 32;

            System.out.println("Temp. in Fahrenheit: "+fahrenheit);
        }
}


