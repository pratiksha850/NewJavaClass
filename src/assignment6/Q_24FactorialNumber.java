package assignment6;

public class Q_24FactorialNumber {
    static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String[] args) {
     int i;
     int fact = 1;
     int number = 5;
     fact = factorial(number);
        System.out.println("Factorial of given "+number+" is "+fact+".");
    }
}
