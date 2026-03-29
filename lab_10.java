import javax.swing.*;
import java.awt.event.*;

public class lab_10 {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Celsius to Fahrenheit Converter");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label for input
        JLabel label1 = new JLabel("Enter Celsius:");
        label1.setBounds(30, 30, 120, 25);
        frame.add(label1);

        // Text field for input
        JTextField textField = new JTextField();
        textField.setBounds(150, 30, 120, 25);
        frame.add(textField);

        // Button
        JButton button = new JButton("Convert");
        button.setBounds(100, 70, 120, 30);
        frame.add(button);

        // Label for result
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 110, 250, 25);
        frame.add(resultLabel);

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textField.getText());
                    double fahrenheit = (celsius * 9/5) + 32;

                    resultLabel.setText("Result: " + fahrenheit + " °F");
                } catch (Exception ex) {
                    resultLabel.setText("Please enter a valid number!");
                }
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}