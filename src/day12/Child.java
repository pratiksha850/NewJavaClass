package day12;

public class Child extends Parent{
    String name = " Child's name";//hidden variable
    public  void sayHello() {
        System.out.println("hello from child..");
        super.sayHello();
        System.out.println(name);
        System.out.println(super.name);
    }
}
