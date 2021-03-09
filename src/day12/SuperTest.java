package day12;

public class SuperTest {
    public static void main(String[] args) {
        //explicit type-casting
        Super obj = new Sub();
        obj.sayHello();

        //implicit type-casting
        Super ob = new Super();
        Sub sub = (Sub) ob;
    }
}
