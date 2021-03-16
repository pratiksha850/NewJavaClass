package day13;

public class AccessModifierChildDemo2 extends AccessModifierChildDemo {
    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo(4);
       // ob.defaultMethod();
        ob.publicMethod();
        //ob.privateMethod();
       // ob.protectedMethod();
    }
}
