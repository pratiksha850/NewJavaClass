package assignment6;
import java.util.*;
public class Q_28PrimeNumber {
    private static void isPrimeNumber(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

       private static void firstNthPrime(int n){

           int status = 1;
           int num = 3;

           if (n >= 1)
           {
               System.out.println("First "+n+" prime numbers are:");
               //2 is a known prime number
               System.out.println(2);
           }

           for ( int i = 2 ; i <=n ;  )
           {
               for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
               {
                   if ( num%j == 0 )
                   {
                       status = 0;
                       break;
                   }
               }
               if ( status != 0 )
               {
                   System.out.println(num);
                   i++;
               }
               status = 1;
               num++;
           }
       }
       private static void allPrimeBetween(int start, int end){
           int i =0;
           int num =0;
           //Empty String
           String  primeNumbers = "";

           for (i = 1; i <= 100; i++)
           {
               int counter=0;
               for(num =i; num>=1; num--)
               {
                   if(i%num==0)
                   {
                       counter = counter + 1;
                   }
               }
               if (counter ==2)
               {
                   //Appended the Prime number to the String
                   primeNumbers = primeNumbers + i + " ";
               }
           }
           System.out.println("Prime numbers from 1 to 100 are :");
           System.out.println(primeNumbers);
    }
        public static void main(String[]args){
       Scanner input = new Scanner (System.in);
       int num;
        System.out.println("Enter the number: ");
        num = input.nextInt();
        isPrimeNumber(num);

    }
}
//not complete code