package day6;

public class MethodDemo1 {
    public void sayHello(){
        System.out.println("Hello from Nepal.");
    }
    public void displayInfo(String name, int age,double salary){
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+age);
        System.out.println("Salary is: "+salary);
    }
    public static void main(String[]args){
        System.out.println("main start");
        //method calling
        MethodDemo1 ob = new MethodDemo1();
        ob.sayHello();

        ob.displayInfo( "Ram", 22, 60000);

        String n = "sham";
        int a = 21;
        double s = 123.45;
        ob.displayInfo(n, a, s);
        System.out.println("main end");
    }
}
