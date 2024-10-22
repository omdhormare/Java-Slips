import java.awt.*;
import java.awt.event.*;
class add1 extends Frame implements ActionListener 
{
    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    TextField f1,f2,f3;
    add1()
    {
       setVisible(true);
       setLayout(new GridLayout(10,10));
       setTitle("Addtion Program...");
       //setBackground(Color.black);
       setSize(1000,1000);

       l1=new Label("Enter 1 Number : ");
       l2=new Label("Enter 2 Number : ");
       l3=new Label("Result : ");
       
       f1=new TextField(10);
       f2=new TextField(10);
       f3=new TextField(10);

       b1=new Button("Addtion");
       b2=new Button("Substrction");
       b3=new Button("Multiplication");
       b4=new Button("Division");
       
       add(l1);add(f1);add(l2);add(f2);add(l3);add(f3);add(b1);add(b2);add(b3);add(b4);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a)
    {
        int a1,b,c;
        if(a.getSource()==b1)
        {
            a1=Integer.parseInt(f1.getText());
            b=Integer.parseInt(f2.getText());
            f3.setText(""+(a1+b));
        }
        if(a.getSource()==b2)
        {
            a1=Integer.parseInt(f1.getText());
            b=Integer.parseInt(f2.getText());
            f3.setText(""+(a1-b));
        }
        if(a.getSource()==b3)
        {
            a1=Integer.parseInt(f1.getText());
            b=Integer.parseInt(f2.getText());
            f3.setText(""+(a1*b));
        }
        if(a.getSource()==b4)
        {
            a1=Integer.parseInt(f1.getText());
            b=Integer.parseInt(f2.getText());
            f3.setText(""+(a1/b));
        }
    }
    public static void main(String argc[])
    {
        new add1();
    }
}