package day10;

public class ArrayDemo9 {
    public static void main(String[] args) {
        String[][] names =new String[][]{{"a","b","c"},{"d","e","f"},{"g","h","i"}};

        for (int i = 0; i < names.length; i++){
            for (int j = 0; j < names.length; j++){
                System.out.println(names[i][j]+" ");
            }
            System.out.println();
        }
    }
}
