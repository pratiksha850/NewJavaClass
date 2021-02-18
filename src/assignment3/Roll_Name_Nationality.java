package assignment3;
import java.util.*;
public class Roll_Name_Nationality {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.print("Roll_Number: ");
        int rollNo = input.nextInt();
        System.out.print("Nationality: ");
        String nationality = input.next();
        System.out.println();
        System.out.println(fname+" "+lname);
        System.out.println("Roll_Number: " + rollNo);
        System.out.println("Nationality: " + nationality);
    }
}


