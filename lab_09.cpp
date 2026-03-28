#include <iostream>
#include <string> // for std::string
using namespace std;

int main() {
    string str1, str2, result;

    // Input two strings from user
    cout << "Enter first string: ";
    getline(cin, str1);  // using getline to allow spaces
    cout << "Enter second string: ";
    getline(cin, str2);

    // Concatenate strings
    result = str1 + str2;

    // Display the concatenated string
    cout << "Concatenated string: " << result << endl;

    return 0;
}