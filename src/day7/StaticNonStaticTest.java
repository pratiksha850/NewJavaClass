package day7;

public class StaticNonStaticTest {
    public static void main(String[] args) {
        StaticNonStaticDemo ob = new StaticNonStaticDemo();
        System.out.println(ob.nonStaticVar);

        System.out.println(StaticNonStaticDemo.staticVar);

    }
}
