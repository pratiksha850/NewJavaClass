package day16;
import java.util.*;
public class ExceptionDemo1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        //int r = a/b;
        //System.out.println(r);
        String s1= null;
        //s1.toCharAray();

        String s2 = "123a";
        int i = Integer.parseInt(s2);
        System.out.println(i);

        Scanner input= new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        System.out.println(n);
        int [] ar = new int[2];
        ar[2]=2;

    }
}
