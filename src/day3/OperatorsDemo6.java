package day3;

public class OperatorsDemo6 {
    public static void main(String[]args){
        //6.Conditional(ternary) operator
        //?:
        int a = 4;
        int b = 5;
        if(a > b){
            System.out.println("a is greater than b.");
        }else{
            System.out.println("a is not greater than b.");

        }
        System.out.println("*****************");

        String s = (a > b) ? "a is greater than b." : "a is not greater than b.";
        System.out.println(s);

        System.out.println("********************");

        boolean r = (a > b)? true : false;
        System.out.println(r);
    }
}
