package day3;

public class OperatorsDemo1 {
    public static void main(String[]args){
        //1. Arithmetic Operators - + * / %
        //Precedence + - (low) * / % (high)

        int a = 1 + 2 - 3 * 4 + 3 / 6 - 7 % 3;
        a = 1 + 2 - 12 + 3 / 6 - 7 % 3;
        a = 1 + 2 - 12 + 2 - 7 % 3;
        a = 1 + 2 - 12 + 2 - 1 ;
        a = 3 - 12 + 2 - 1;
        a = 9 + 2 - 1;
        a = 11 - 1 ;
        a = 10 ;

        System.out.println(a);
    }

}
