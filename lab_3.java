import java.util.Scanner;

class Sum {
    int a, b, c;

    // Method to take input
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    // Method to calculate and display sum
    void calculateSum() {
        int result = a + b + c;
        System.out.println("Sum = " + result);
    }
}

public class lab_3 {
    public static void main(String[] args) {
        Sum s = new Sum();

        s.input();         // Taking input
        s.calculateSum();  // Calculating and displaying sum
    }
}