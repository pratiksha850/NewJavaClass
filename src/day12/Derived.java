package day12;

public class Derived extends Base{

    public Derived(){
        super(5);
        System.out.println("Derived default constructor.");
    }
    public Derived(int a){
        System.out.println("Derived arg constructor.");
    }
}
