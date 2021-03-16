package day13;

public class AccessModifierDemo {
    String defaultVar = "Default variable";
    public String publicVar = "public variable";
    private String privateVar = " private variable";
    protected String protectedVar = " protected variable";

    void defaultMethod(){
        System.out.println("Default method");
    }
    public void publicMethod(){
        System.out.println("Public method");
    }
    private void privateMethod(){
        System.out.println("Private method");
    }
    protected void protectedMethod(){
        System.out.println("Protected constructed");
    }
     AccessModifierDemo(){
        System.out.println("default constructor");
    }
    public AccessModifierDemo(int a){
        System.out.println("public constructor");
    }
    private AccessModifierDemo(int a, int b){
        System.out.println("private constructor");
    }
    protected AccessModifierDemo(String a){
        System.out.println("protected constructor");
    }

    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo(4,5);
        ob.defaultMethod();
        ob.publicMethod();
        ob.privateMethod();
        ob.protectedMethod();
    }
}
