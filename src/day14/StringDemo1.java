package day14;

public class StringDemo1 {
    public static void main(String[] args) {
        //implicit
        String s1 = "Nepal";
        System.out.println(s1);

        String s2= new String();
        System.out.println(s2);

        String s3 = new String("Nepal");
        System.out.println(s3);

        char[] ch = {'e','f','g'};
        String s4 = new String(ch);
        System.out.println(s4);

        byte [] bb = {11,12,13};
        String s5 = new String(bb);
        System.out.println(s5);
    }
}
