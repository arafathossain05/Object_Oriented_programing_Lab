// Interface
interface Shape {
    void draw();  // abstract method
}

// Class implementing the interface
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Another class implementing the same interface
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class lab_8 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}