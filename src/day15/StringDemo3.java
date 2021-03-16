package day15;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = "good morning";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0,4));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.indexOf('m'));
        System.out.println(s1.charAt(5));
        System.out.println(s1.contains("morning"));
        System.out.println(s1.contains("r"));
        System.out.println(s1.contains("l"));
        System.out.println("hello, ".concat(s1));
        System.out.println(s1.isEmpty());
        System.out.println(s1.replace("morning", "evening"));
        char[]ch = s1.toCharArray();
        System.out.println(ch[0]);

        String s2 = "hello from java, I am learning core java";
        System.out.println(s2);
        System.out.println(s2.trim());

        if(s1.compareTo("good")==0){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
