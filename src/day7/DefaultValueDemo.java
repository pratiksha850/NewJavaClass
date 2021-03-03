package day7;

public class DefaultValueDemo {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bb;
    String ss;
    DefaultValueDemo ob;
//local variable has no default value
    public static void main(String[] args) {
        DefaultValueDemo obj = new DefaultValueDemo();
        System.out.println(obj.b);
        System.out.println(obj.s);
        System.out.println(obj.i);
        System.out.println(obj.l);
        System.out.println(obj.f);
        System.out.println(obj.d);
        System.out.println(obj.bb);
        System.out.println(obj.ss);
        System.out.println(obj.ob);

    }
}
