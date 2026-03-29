#include <iostream>
using namespace std;

class StudentData {
private:
    int totalStudents[5];
    int passedStudents[5];
    float percentage[5];

public:
    // Input data
    void input() {
        cout << "Enter total and passed students for 5 years:\n";
        for (int i = 0; i < 5; i++) {
            cout << "Year " << i + 1 << ":\n";
            cout << "Total Students: ";
            cin >> totalStudents[i];
            cout << "Passed Students: ";
            cin >> passedStudents[i];
        }
    }

    // Calculate percentage
    void calculate() {
        for (int i = 0; i < 5; i++) {
            percentage[i] = (float)passedStudents[i] / totalStudents[i] * 100;
        }
    }

    // Display data
    void display() {
        cout << "\nYear\tPass %\n";
        for (int i = 0; i < 5; i++) {
            cout << i + 1 << "\t" << percentage[i] << "%\n";
        }
    }

    // Plot graph (simple text bar chart)
    void plotGraph() {
        cout << "\n--- Passing Percentage Graph ---\n";
        for (int i = 0; i < 5; i++) {
            cout << "Year " << i + 1 << " : ";
            int stars = percentage[i] / 2; // scale down
            for (int j = 0; j < stars; j++) {
                cout << "*";
            }
            cout << " (" << percentage[i] << "%)\n";
        }
    }
};

int main() {
    StudentData obj;

    obj.input();
    obj.calculate();
    obj.display();
    obj.plotGraph();

    return 0;
}