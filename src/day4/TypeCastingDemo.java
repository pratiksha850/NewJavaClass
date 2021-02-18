package day4;

public class TypeCastingDemo {
    public static void main(String[]args){
        byte b1 =127;
        int i = b1;//implicit type casting(conversion)
        System.out.println(b1);
        System.out.println(i);

        int i2 = 127;
        byte b2 = (byte)i2;//explicit type casting(by java programmer)
        System.out.println(i2);
        System.out.println(b2);

        int i3 = 200;
        byte b3 = (byte)i3;
        System.out.println(i3);
        System.out.println(b3);

        //byte - short - int - long - float - double => implicit casting
        //double - float - long - int - short -byte => explicit
    }
}
