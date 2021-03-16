package day15;

import java.util.StringTokenizer;

public class StringDemo6 {
    public static void main(String[] args) {
        String s1 = "Hello everyone, this is java world, we are learning core java.";
        System.out.println(s1);
        StringTokenizer st = new StringTokenizer(s1);
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
