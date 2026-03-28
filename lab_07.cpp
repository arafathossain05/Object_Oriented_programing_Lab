#include <iostream>
using namespace std;

// Base class
class A {
protected:
    int x;

public:
    void input() {
        cout << "Enter value of x: ";
        cin >> x;
    }
};

// Derived class 1 (inherits from A)
class B : public A {
protected:
    int y;

public:
    void inputY() {
        cout << "Enter value of y: ";
        cin >> y;
    }
};

// Derived class 2 (inherits from B) → Multilevel Inheritance
class C : public B {
public:
    void display() {
        int sum = x + y; // accessing protected members
        cout << "Sum = " << sum << endl;
    }
};

int main() {
    C obj;

    obj.input();   // from class A
    obj.inputY();  // from class B
    obj.display(); // from class C

    return 0;
}