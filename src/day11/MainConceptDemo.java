package day11;

public class MainConceptDemo {
    public static void main(String[] args) {
        printName(new String[] {"ram", "sita", "gita"});
        //printName(args);

    }
    public static void printName(String[] names){
        for (String name : names){
            System.out.println(name);
        }
    }
}
