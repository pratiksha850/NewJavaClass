package day12;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle is drawn");
    }
    public Triangle(){
        System.out.println("Triangle's default constructor..");
    }
}
