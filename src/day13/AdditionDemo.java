package day13;

public class AdditionDemo {
    public void sum(int a, int b){
        int r = a + b;
        System.out.println("1.Sum is: "+ r);
    }
    public void sum(int a, int b, int c){
        int r = a + b + c;
        System.out.println("2.Sum is: "+ r);
    }
    public void sum(double a, double b){
        double r = a + b;
        System.out.println("3" +
                ".Sum is: "+ r);
    }

    public static void main(String[] args) {
        //compile time[polymorphism]
        //which can be achieved by overloading of method
        AdditionDemo obj = new AdditionDemo();
        obj.sum(4,5);
        obj.sum(2,3,4);
        obj.sum(1.2,2.3);
    }
}
