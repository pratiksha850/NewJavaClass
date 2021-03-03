package assignment6;
import java.util.*;
public class Q_23NaturalNumber {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int number, sum = 0;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        sum = SumOfNaturalNumbers(number);
        System.out.println("\n The Sum of Natural Numbers from 1 to "+ number + " = " + sum);
    }

    public static int SumOfNaturalNumbers(int num)
    {
        if(num == 0)
        {
            return num;
        }
        else
        {
            return (num * (num + 1)/2);
        }
    }
}
