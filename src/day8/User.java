package day8;

public class User {
    String name;
    int age;
    public User(){
        System.out.println("Default(no-arg) constructor.");
    }public User(int age){
    }public User(String name){
    }

//    public User(String n, int a){
//        name = n;
//        age = a;
//        System.out.println("Argument (parameterized) constructor");
//    }

    public static void main(String[] args) {
        User user1 = new User();
        System.out.println("=================");
        User user2 = new User();
    }
}
