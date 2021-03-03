package assignment4th;
import java.util.*;
public class FindEvenOrOdd {
    public static void main(String[] args) {
        int num;
        System.out.println( "Enter an integer: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
         if ( num % 2 == 0){
             System.out.println("Entered number is even.");
         }else{
             System.out.println("Entered number is odd.");
         }
    }

}
