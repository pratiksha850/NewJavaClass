package day10;

public class ArrayDemo6 {
    public static void main(String[] args) {
        final int ROWS = 3;
        final int COLUMNS = 3;

        int[] [] arr = new int[ROWS][COLUMNS];
        arr[0][0] = 11;
        arr[0][1] = 11;
        arr[0][2] = 11;

        arr[1][0] = 11;
        arr[1][1] = 11;
        arr[1][2] = 11;

        arr[2][0] = 11;
        arr[2][1] = 11;
        arr[2][2] = 11;
        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLUMNS; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
