#include <iostream>
using namespace std;

// Base class
class Room {
protected:
    double length, width, height;

public:
    void input() {
        cout << "Enter length, width and height: ";
        cin >> length >> width >> height;
    }
};

// Derived class (Single Inheritance)
class Calculate : public Room {
public:
    double area() {
        return length * width;
    }

    double volume() {
        return length * width * height;
    }

    void display() {
        cout << "Area of room = " << area() << endl;
        cout << "Volume of room = " << volume() << endl;
    }
};

int main() {
    Calculate obj;

    obj.input();   // From base class
    obj.display(); // From derived class

    return 0;
}