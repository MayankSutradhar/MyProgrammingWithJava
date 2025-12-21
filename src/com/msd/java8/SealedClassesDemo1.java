package com.msd.java8;

sealed abstract class Shape permits Circle, Rectangle, Triangle {
    abstract double area();
    static double calculateArea(Shape shape) {
        return switch (shape) {
            case Circle c    -> c.area();
            case Rectangle r -> r.area();
            case Triangle t  -> t.area();
        };
    }
}

// Allowed subclass - must be final, sealed, or non-sealed
final class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
   
    double area() { return Math.PI * radius * radius; }
}

final class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
   
    @Override
    double area() { return length * width; }
}

// A non-sealed subclass (can be extended freely)
non-sealed class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double area() { return 0.5 * base * height; }
}

// Since Triangle is non-sealed, it can be extended
class RightAngledTriangle extends Triangle {
    RightAngledTriangle(double base, double height) {
        super(base, height);
    }
}
public class SealedClassesDemo1 {

	public static void main(String[] args) {
		Shape obj=new RightAngledTriangle(5000, 5);
		Shape obj1=new Rectangle(500, 200);
		Shape obj2=new Circle(25);
		
		System.out.println("Area of Triangle: "+Triangle.calculateArea(obj));
		System.out.println("Area of Rectangle: "+Rectangle.calculateArea(obj1));
		System.out.println("Area of Circle: "+Circle.calculateArea(obj2));
	}

}

