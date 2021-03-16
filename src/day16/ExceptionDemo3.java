package day16;

import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //try->{}block
        //catch->block
        //finally->block
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int a = input.nextInt();
        System.out.println("Enter a number2");
        int b = input.nextInt();
        try{
            System.out.println("try start");
            int div = divide(a,b);
            System.out.println("Division of a and b is: "+div);
            System.out.println("try end");
        }
        catch(ArithmeticException ae){
            System.out.println("inside catch");
        }finally{
            System.out.println("inside finally");
            //finally always runs
            input.close();
        }
        System.out.println("exit");
    }
    public static int divide(int a,int b){
        return a/b;
    }
}
