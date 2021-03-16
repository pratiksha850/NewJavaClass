package day15;

public class StringDemo8 {
    public static void main(String[] args) {

        System.out.println(isYes("yes"));
        System.out.println(isYes("Yes"));
        System.out.println(isYes("No"));
        System.out.println(isYes("no"));

        //System.out.println(isNumber("123aa");
    }
    public static boolean isYes(String s){
        return s.matches("[y|Y]es|No");
    }
    public static boolean isNumber(String s){
        return s.matches("\\d+");
    }
}
