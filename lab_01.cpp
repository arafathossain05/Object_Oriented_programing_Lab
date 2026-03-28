#include <iostream>
#include <iomanip>  // For setprecision
using namespace std;

class Student {
private:
    int marks[5];
    
public:
    void input() {
        cout << "Enter marks for 5 subjects (0-100): ";
        for(int i = 0; i < 5; i++) {
            cin >> marks[i];
            while(marks[i] < 0 || marks[i] > 100) {
                cout << "Invalid marks! Enter value between 0-100: ";
                cin >> marks[i];
            }
        }
    }
    
    void percentage() {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        double percentage = sum / 5.0;  // Use floating point division
        cout << fixed << setprecision(2);  // Show 2 decimal places
        cout << "Percentage: " << percentage << "%" << endl;
    }
};

int main() {
    Student s;
    s.input();
    s.percentage();
    return 0;
}