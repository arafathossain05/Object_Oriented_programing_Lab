import java.util.Scanner;

// Base class
class Room {
    double length, width, height;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, width and height: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
        height = sc.nextDouble();
    }
}

// Derived class (Single Inheritance)
class Calculate extends Room {

    double area() {
        return length * width;
    }

    double volume() {
        return length * width * height;
    }

    void display() {
        System.out.println("Area of room = " + area());
        System.out.println("Volume of room = " + volume());
    }
}

public class lab_5 {
    public static void main(String[] args) {
        Calculate obj = new Calculate();

        obj.input();    // from base class
        obj.display();  // from derived class
    }
}