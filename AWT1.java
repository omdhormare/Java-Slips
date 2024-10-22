import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    Demo()
    {
       setVisible(true);
       setSize(500,500);
       setTitle("Addtion");
       setLocation(100,200);
       setLayout(new GridLayout(10,20));

       l1=new Label("Enter 1 Number : ");
       l2=new Label("Enter 2 Number : ");
       l3=new Label("Addtion : ");

       t1=new TextField(5);
       t2=new TextField(10);
       t3=new TextField(10);

       b1=new Button("Addition");
       b2=new Button("Substration");
       b3=new Button("Cancel");
       b4=new Button("Exit");
       
       add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
       add(b1);add(b2);add(b3);add(b4);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a1)
    {
        if(a1.getSource()==b1)
        {
           int a=Integer.parseInt(t1.getText());
           int b=Integer.parseInt(t2.getText());
           t3.setText(""+(a+b));
        }
        if(a1.getSource()==b2)
        {
           int a11=Integer.parseInt(t1.getText());
           int b11=Integer.parseInt(t2.getText());
           t3.setText(""+(a11-b11));
        }
        if(a1.getSource()==b3)
        {
           t1.setText("");
           t2.setText("");
           t3.setText("");
        }
        if(a1.getSource()==b4)
        {
           System.exit(0);
        }
    }
    public static void main(String argc[])
    {
       Demo ob=new Demo();
    }
}