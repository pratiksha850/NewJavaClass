package day12;

public abstract class Shape {

    public abstract void draw();
    public void paint(){
        System.out.println("Shape is painted..");
    }
    public Shape(){
        System.out.println("Shape's default constructor..");
    }
}
