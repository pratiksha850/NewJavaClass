package assignment2;

import java.util.Scanner;

public class CelsiusToFahrenheit {
        //convert celsius to fahrenheit
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter temperature in Celsius: ");
            float C = input.nextFloat();

            /* Convert Celsius to Fahrenheit */
            float F = C * (9f / 5) + 32;

            /* Print result */
            System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");


        }
    }

