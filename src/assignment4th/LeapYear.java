package assignment4th;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = input.nextInt();
        input.close();
        boolean leap = false;

        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}


