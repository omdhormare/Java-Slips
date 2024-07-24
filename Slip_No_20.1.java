/*Write a java program using AWT to create a Frame with title “TYBBACA”, background color RED. 
If user clicks on close button then frame should close.*/
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
    Button b1;
    Frame f1=new Frame();
    Demo()
    {
        setVisible(true);
        setTitle("TYBBACA");
        setBackground(Color.red);
        setLayout(new FlowLayout());
        setSize(1000,1000);

        b1=new Button("Close");
        add(b1);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a)
    {
       if(a.getSource()==b1)
       {
         System.exit(0);
         
       }
    }
    public static void main(String arcs[])
    {
        new Demo();
    }
}