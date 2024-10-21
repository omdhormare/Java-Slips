import java.awt.*;
import java.awt.event.*;

class Demo extends Frame implements ActionListener 
{
    Label l1, l2;
    Checkbox c1, c2, c3, c4, c5;
    Button b1, b2;
    TextArea ta;

    Demo() 
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(8,1));  

        l1 = new Label("Select Subject:");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("DS");
        c3 = new Checkbox("PHP");
        c4 = new Checkbox("Python");
        c5 = new Checkbox("TCS");
        b1 = new Button("Submit");
        b2 = new Button("Clear");
        ta = new TextArea();

        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(b1);
        add(b2);
        add(ta);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == b1) 
        {
            String selectedSubjects = "Selected Subjects:\n";
            if (c1.getState()) selectedSubjects += "Java\n";
            if (c2.getState()) selectedSubjects += "DS\n";
            if (c3.getState()) selectedSubjects += "PHP\n";
            if (c4.getState()) selectedSubjects += "Python\n";
            if (c5.getState()) selectedSubjects += "TCS\n";
            ta.setText(selectedSubjects);
        } 
        if (ae.getSource() == b2) 
        {
          dispose();
        }
    }

    public static void main(String arg[]) {
        new Demo();
    }
}
