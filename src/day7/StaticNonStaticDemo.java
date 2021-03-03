package day7;

public class StaticNonStaticDemo {
    String nonStaticVar = "This is non-static variable.";
    static String staticVar = "This is static variable.";
    public  void nonStaticMethod() {
        System.out.println("This is non-static method.  ");

    }public static void staticMethod(){
        System.out.println("This is static method. ");
    }

    public static void main(String[] args) {
        StaticNonStaticDemo ob = new StaticNonStaticDemo();
        System.out.println(ob.nonStaticVar);
        ob.nonStaticMethod();

        System.out.println(staticVar);
        staticMethod();
        //best way
        System.out.println(StaticNonStaticDemo.staticVar);
        StaticNonStaticDemo.staticMethod();

        //local variable
//        int a = 5;
//        String name = "sara";
    }
}
