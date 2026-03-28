class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Lab_2 {
    public static void main(String[] args) {
        // Creating object using parameterized constructor
        Student s1 = new Student("Akash", 22);

        s1.display();
    }
}