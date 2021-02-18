package day4;

public class TypeCastingDemo2 {
    public static void main(String[]args){
         char c1 = 65;
         byte b1 = 96;
         System.out.println(c1);
         System.out.println(b1);

         char c2 = 'a';
         byte b2 = 'a';
        System.out.println(c2);
        System.out.println(b2);

        char c3 = 77;
        byte b3 = (byte) c3;
        System.out.println(c3);
        System.out.println(b3);

        byte b4 = 88;
        char c4 = (char) b4;
    }
}
