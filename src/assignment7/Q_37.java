package assignment7;
import java.util.*;
public class Q_37 {
    public static void main(String[] args) {

        int i, j, rows, columns, sum = 0;

       Scanner sc= new Scanner(System.in);

        System.out.println("\n Enter Matrix Rows and Columns :  ");
        rows = sc.nextInt();
        columns = sc.nextInt();

        int[][] SumOfCols_arr = new int[rows][columns];

        System.out.println("\n Please Enter the Matrix Items :  ");
        for(i = 0; i < rows; i++) {
            for(j = 0; j < columns; j++) {
                SumOfCols_arr[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < SumOfCols_arr.length; i++)
        {
            sum = 0;
            for(j = 0; j < SumOfCols_arr[0].length; j++)
            {
                sum = sum + SumOfCols_arr[j][i];
            }
            System.out.println("\nThe Sum of Matrix Items "
                    + "in Column " + i + " = " + sum);
        }
    }
}
