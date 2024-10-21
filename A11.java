import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// A simple arithmetic calculator using Applet
public class A11 extends Applet implements ActionListener {
    // Declare components: buttons and text field
    TextField display;
    Button[] numberButtons = new Button[10];
    Button addButton, subButton, mulButton, divButton, clearButton, equalButton;
    String operator;
    double num1, num2, result;

    // Initialize the applet
    public void init() {
        setLayout(new BorderLayout()); // Set layout for the applet

        // Create the display at the top
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH); // Add display to the top of the applet

        // Create the panel for number buttons and operators
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4)); // 4x4 grid for buttons

        // Create and add number buttons to the panel
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this); // Add action listener to each button
            panel.add(numberButtons[i]);
        }

        // Create operator buttons and add them to the panel
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        clearButton = new Button("Clear");
        equalButton = new Button("=");

        // Add action listeners for operator buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        clearButton.addActionListener(this);
        equalButton.addActionListener(this);

        // Add operator buttons to the panel
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(clearButton);
        panel.add(equalButton);

        // Add the panel to the center of the applet
        add(panel, BorderLayout.CENTER);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // If a number button is pressed, append it to the display
        for (int i = 0; i < 10; i++) {
            if (command.equals(String.valueOf(i))) {
                display.setText(display.getText() + i);
                return;
            }
        }

        // If an operator button is pressed
        if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            num1 = Double.parseDouble(display.getText()); // Store the first number
            operator = command; // Store the operator
            display.setText(""); // Clear the display for the next input
        }

        // If the equal button is pressed, perform the calculation
        if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText()); // Store the second number

            // Perform the operation based on the operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result)); // Display the result
        }

        // If the clear button is pressed, clear the display and reset variables
        if (command.equals("Clear")) {
            display.setText("");
            num1 = num2 = result = 0;
        }
    }
}


/*

<applet code="Slip11B.class" width="300" height="300">

</applet>


*/
