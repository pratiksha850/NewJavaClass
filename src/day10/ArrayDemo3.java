package day10;
import java.util.Scanner;
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[]arr = new int[3];
        System.out.println(arr);
        System.out.println(arr.length);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter element: ");
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("sum of array is: "+ sum);
    }

}
