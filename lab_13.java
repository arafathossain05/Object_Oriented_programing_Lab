import javax.swing.*;
import java.awt.event.*;

public class lab_13 {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Multiplication Calculator");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label and TextField for first number
        JLabel label1 = new JLabel("Enter first number:");
        label1.setBounds(20, 20, 150, 25);
        frame.add(label1);

        JTextField text1 = new JTextField();
        text1.setBounds(180, 20, 120, 25);
        frame.add(text1);

        // Label and TextField for second number
        JLabel label2 = new JLabel("Enter second number:");
        label2.setBounds(20, 60, 150, 25);
        frame.add(label2);

        JTextField text2 = new JTextField();
        text2.setBounds(180, 60, 120, 25);
        frame.add(text2);

        // Button
        JButton button = new JButton("Multiply");
        button.setBounds(110, 100, 120, 30);
        frame.add(button);

        // Result label
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(20, 140, 250, 25);
        frame.add(resultLabel);

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(text1.getText());
                    double num2 = Double.parseDouble(text2.getText());

                    double result = num1 * num2;
                    resultLabel.setText("Result: " + result);
                } catch (Exception ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}