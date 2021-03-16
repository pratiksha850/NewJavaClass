package day15;

import java.util.StringTokenizer;

public class StringDemo7 {
    public static void main(String[] args) {
        String s1 = "Hello everyone,, this is java world,, we are learning core java.";
        System.out.println(s1);
        String[] ss = s1.split(",");
        System.out.println(ss.length);
        for(String s:ss){
            System.out.println(s);
        }
        System.out.println("--------------------");
        StringTokenizer st = new StringTokenizer(s1,",");
        System.out.println(st.countTokens());
    }
}
