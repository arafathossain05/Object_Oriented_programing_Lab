#include <iostream>
using namespace std;

class Room {
public:
    // Method with two parameters (length and width)
    double area(double length, double width) {
        return length * width;
    }

    // Overloaded method with one parameter (square room case)
    double area(double side) {
        return side * side;
    }
};

int main() {
    Room r;
    double length, width, side;

    // Rectangular room
    cout << "Enter length and width of the rectangular room: ";
    cin >> length >> width;
    cout << "Area of rectangle = " << r.area(length, width) << endl;

    // Square room
    cout << "Enter side of the square room: ";
    cin >> side;
    cout << "Area of square = " << r.area(side) << endl;

    return 0;
}