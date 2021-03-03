package assignment6;
import java.util.*;
public class Q_26ReverseNumber {
    static void reverse(int num) {
        int  reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
    public static void main(String args[]) {
           int r =123;
             reverse(r);
        }
}
