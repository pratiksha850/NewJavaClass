package day11;
import java.util.*;
public class MethodDemo1 {
    public int[] returnArray(Scanner in){
        System.out.println("Enter the size of an array: ");
        int size = in.nextInt();
        int[]arr = new int[size];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter element: ");
            arr[i]=in.nextInt();
        }
        return arr;
    }

    public static void printElementsOfAnArray(int[] arr) {
        for (int a: arr){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MethodDemo1 obj = new MethodDemo1();
        int[]arr = obj.returnArray(input);
        obj.printElementsOfAnArray(arr);
    }
}
