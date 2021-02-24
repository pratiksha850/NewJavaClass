package day5;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c = 7;

        if (a > b) {
            if (a > c) {
                System.out.println(" a is largest one.");
            } else {
                System.out.println(" c is greatest one.");
            }

        }else {
            System.out.println("a is smaller than b but c may be greater or smaller than a.");
        }
    }
}