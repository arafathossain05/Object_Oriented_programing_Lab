#include <iostream>
using namespace std;

class Student {
private:
    string name;
    int age;

public:
    // Parameterized Constructor
    Student(string n, int a) {
        name = n;
        age = a;
    }
    void display() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }
};
int main() {
    Student s1("Akash", 22);
    s1.display();
    return 0;
}