package day8;

public class Student {
    //non-static variable, instance, member's data, data, properties, attributes, field
    String name;
    int roll;
    public void displayInfo(){
        System.out.println("Student name is: "+name);
        System.out.println("Student roll is: "+ roll);
    }
    public void assignInfo(String n, int r){
        name = n;
        roll = r;
    }
    public static void main(String[] args) {
        Student student1 =new Student();
        student1.assignInfo("ram",11);
        student1.displayInfo();
//        student1.name="ram";
//        student1.roll=11;
//        System.out.println(student1.name);
//        System.out.println(student1.roll);
        System.out.println("__________________");
        Student student2 = new Student();
        student2.assignInfo("Yam",12);
        student2.displayInfo();
//        student2.name="Yam";
//        student2.roll=12;
//        System.out.println(student2.name);
//        System.out.println(student2.roll);
    }
}
