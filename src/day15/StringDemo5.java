package day15;

public class StringDemo5 {
    public static void main(String[] args) {
        String s1 = "Hello everyone, this is java world, we are learning core java.";
        System.out.println(s1);
        String[] ss = s1.split(",");
        for(String s:ss){
            System.out.println(s);
        }
    }
}
