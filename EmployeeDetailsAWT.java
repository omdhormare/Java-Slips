import java.awt.*;
import java.awt.event.*;

public class EmployeeDetailsAWT {
    
    public static void main(String[] args) {
        // Frame for input
        Frame inputFrame = new Frame("Employee Input");

        // Set frame layout and size
        inputFrame.setSize(300, 300);
        inputFrame.setLayout(new GridLayout(4, 2));

        // Create labels and text fields for employee details
        Label labelEno = new Label("Employee Number:");
        TextField textEno = new TextField();
        Label labelEName = new Label("Employee Name:");
        TextField textEName = new TextField();
        Label labelSal = new Label("Salary:");
        TextField textSal = new TextField();
        Button submitButton = new Button("Submit");

        // Add components to the frame
        inputFrame.add(labelEno);
        inputFrame.add(textEno);
        inputFrame.add(labelEName);
        inputFrame.add(textEName);
        inputFrame.add(labelSal);
        inputFrame.add(textSal);
        inputFrame.add(new Label());  // Empty label for alignment
        inputFrame.add(submitButton);

        // Set frame visibility
        inputFrame.setVisible(true);
        
        // Close the frame when the window is closed
        inputFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Add action listener to the Submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve the entered details
                String eno = textEno.getText();
                String eName = textEName.getText();
                String sal = textSal.getText();

                // Create the second frame for displaying employee details
                Frame displayFrame = new Frame("Employee Details");
                displayFrame.setSize(300, 200);
                displayFrame.setLayout(new GridLayout(3, 1));

                // Create labels to display employee details
                Label displayEno = new Label("Employee Number: " + eno);
                Label displayEName = new Label("Employee Name: " + eName);
                Label displaySal = new Label("Salary: " + sal);

                // Add the labels to the second frame
                displayFrame.add(displayEno);
                displayFrame.add(displayEName);
                displayFrame.add(displaySal);

                // Make the second frame visible
                displayFrame.setVisible(true);
                
                // Close the display frame properly
                displayFrame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        displayFrame.dispose();
                    }
                });
            }
        });
    }
}
