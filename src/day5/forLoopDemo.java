package day5;

public class forLoopDemo {
    public static void main(String[] args) {
        //for(initialization; condition; update(increment/decrement)){
            int n = 5;
            int sum = 0;
            for(int i = 1; i <= n; i++){
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("Sum of nth number is:  " + sum);
        }
    }

