package assignment4th;
import java.util.*;
public class NegativeArrayNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Size, i;
        System.out.println("Please enter the array size:  ");
        Size = input.nextInt();

        int[] Neg_arr = new int[0];

        System.out.format("\nEnter NEG Array %d elements : ", Size);
        for(i = 0; i < Size; i++)
        {
            Neg_arr[i] = input.nextInt();
        }

        System.out.print("\nList of Negative Numbers in NEG Array : ");
        for(i = 0; i < Size; i++)
        {
            if(Neg_arr[i] < 0) {
                System.out.format("%d  ", Neg_arr[i]);
            }
        }
        }
       }






