import java.util.Scanner;

class Room {

    // Method with two parameters (rectangle)
    double area(double length, double width) {
        return length * width;
    }

    // Overloaded method with one parameter (square)
    double area(double side) {
        return side * side;
    }
}

public class lab_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room r = new Room();

        double length, width, side;

        // Rectangular room
        System.out.print("Enter length and width: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
        System.out.println("Area of rectangle = " + r.area(length, width));

        // Square room
        System.out.print("Enter side of square room: ");
        side = sc.nextDouble();
        System.out.println("Area of square = " + r.area(side));
    }
}