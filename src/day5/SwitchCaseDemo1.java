package day5;
import java.util.*;
import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your choice: ");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("This is an addition.");
                break;
            case 2:
                System.out.println(" This is subtraction.");
                break;
            case 3:
                System.out.println("This is multiplication.");
                break;
            case 4:
                System.out.println("This is division.");
                break;
            default:
                System.out.println("Wrong choice.");
                break;


            /*  char choice = input.next().charAt(0);

            switch (choice){
            case '+':
                            System.out.println("This is an addition.");
                            break;
                        case '-':
                            System.out.println(" This is subtraction.");
                            break;
                        case '*':
                            System.out.println("This is multiplication.");
                            break;
                        case '/':
                            System.out.println("This is division.");
                            break;
                        default:
                            System.out.println("Wrong choice.");
                            break;*/
             /*  string choice = input.next();

            switch (choice){
            case "add":
                            System.out.println("This is an addition.");
                            break;
                        case "sub" :
                            System.out.println(" This is subtraction.");
                            break;
                        case "mul":
                            System.out.println("This is multiplication.");
                            break;
                        case "div":
                            System.out.println("This is division.");
                            break;
                        default:
                            System.out.println("Wrong choice.");
                            break;*/
        }
    }
}

