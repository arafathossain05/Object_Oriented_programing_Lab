#include <iostream>
using namespace std;

class Sum {
private:
    int a, b, c;

public:
    // Method to take input
    void input() {
        cout << "Enter three numbers: ";
        cin >> a >> b >> c;
    }

    // Method to calculate and display sum
    void calculateSum() {
        int result = a + b + c;
        cout << "Sum = " << result << endl;
    }
};

int main() {
    Sum s;
    s.input();        // Taking user input
    s.calculateSum(); // Calculating and displaying sum

    return 0;
}