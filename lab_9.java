import java.util.Scanner;

public class lab_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings from user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();  // allows spaces

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Concatenate strings
        String result = str1 + str2;

        // Display the concatenated string
        System.out.println("Concatenated string: " + result);
    }
}