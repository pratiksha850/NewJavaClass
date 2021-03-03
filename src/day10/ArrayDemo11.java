package day10;

public class ArrayDemo11 {
    public static void main(String[] args) {
        String[][] names ={{"a"+"+"+"b"+"+"+"c"+"= "},{"d","e","f"},{"g","h","i"}};

        for (String[]name: names){
            for (String n: name){
                System.out.println(n + " ");
            }
            System.out.println();
        }
    }
}
