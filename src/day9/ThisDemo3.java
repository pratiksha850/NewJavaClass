package day9;

public class ThisDemo3 {
    public void display(){
        System.out.println("I'm learning java.");
    }
    public void print(ThisDemo3 ob){
        ob.display();
    }
    public void show(){
        ThisDemo3 ob = new ThisDemo3();
        print(ob);
        print(this);
    }
//    public void show(){
//        print(this);
    //}
public static void main(String[] args) {
    ThisDemo3 ob = new ThisDemo3();
    ob.show();
}
}
