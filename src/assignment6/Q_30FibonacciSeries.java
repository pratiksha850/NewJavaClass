package assignment6;

public class Q_30FibonacciSeries {
    static void Fibonacci(int n) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < n) {

            // Print the number
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    // Driver Code
    public static void main(String args[]) {
        int n = 9;

        Fibonacci(n);
    }
}
