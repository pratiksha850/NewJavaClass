package day9;
//shadowing is the process of hiding instance variable by local variable
//inside non-static method and constructor of class
//this is a keyword and is an implicit reference variable of current type
//current object and current object and is available inside non-static methos
//and constructor of a class, we can not change the value of 'this'
public class ThisDemo1 {
  //instance variable
  int a = 5;

    public void print() {
        System.out.println("this is: "+this);
        System.out.println(a);//this.a
        System.out.println(this.a);
        //local variable
        System.out.println(a);
        System.out.println(this.a);
        int sum = this.a + a;
        System.out.println("sum is: "+sum);
    }

    public static void main(String[] args) {
        ThisDemo1 ob1 = new ThisDemo1();
        System.out.println("ob1 is: "+ob1);
        ob1.print();
        System.out.println("------------------");
        ThisDemo1 ob2 = new ThisDemo1();
        System.out.println("ob2 is: "+ob2);
        ob2.print();
    }
}
