import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    Button b1;
    TextField t1,t2,t3;
    demo()
    {
       setVisible(true);
       setSize(500,500);
       setLayout(new FlowLayout());

       l1=new Label("Enter Employee Id : ");
       add(l1);
       t1=new TextField(20);
       add(t1);
       l2=new Label("Enter Employee Name : ");
       add(l2);
       t2=new TextField(20);
       add(t2);
       l3=new Label("Enter Employee Salary : ");
       add(l3);
       t3=new TextField(20);
       add(t3);

       b1=new Button("Enter To Next Frame ");
       add(b1);

       b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       String a,b,c;
       a=t1.getText();
       b=t2.getText();
       c=t3.getText();

       new Emp(a,b,c);
    }
    public static void main(String[] args) 
    {
        new demo();
    }
}
class Emp extends Frame
{
    Label l1,l2,l3;
   Emp(String a,String b,String c)
   {
       setVisible(true);
       setSize(500,500);
       setLayout(new FlowLayout());

       l1=new Label("Employee Id : "+a);
       add(l1);
       l2=new Label("Employee Name: "+b);
       add(l2);
       l3=new Label("Employee Salary : "+c);
       add(l3);
       
   }
}