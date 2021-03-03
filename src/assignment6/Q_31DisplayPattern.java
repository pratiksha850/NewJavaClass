package assignment6;
import java.util.*;
public class Q_31DisplayPattern {
    public static void main(String[] args) {
        System.out.println("How many rows you want in this pattern?");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println(" ");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
        sc.close();
    }

}
