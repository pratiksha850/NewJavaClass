package Assignment5;
import java.util.*;
public interface Q_19TriangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of side1: ");
        int s1 = input.nextInt();
        System.out.println("Enter number of side2: ");
        int s2 = input.nextInt();
        System.out.println("Enter number of side3: ");
        int s3 = input.nextInt();

        System.out.println("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
    }
    public static boolean isValidTriangle(int a, int b, int c){
        return (a + b > c && b + c > a && c + a > b);
    }
}
