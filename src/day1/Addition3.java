package day1;
import javax.swing.*;
public class Addition3 {
    public static void main (String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y: "));


        int sum = x + y;

        System.out.println(sum);
        System.out.print("Sum of x and y is " + sum);
        System.out.print("Sum of" + x + "and" + y + "is" + sum);
    }
}
