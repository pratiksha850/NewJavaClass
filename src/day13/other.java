package day13;

public class other {
    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo(4);
        ob.defaultMethod();
        ob.publicMethod();
        //ob.privateMethod();
        ob.protectedMethod();
    }
}
