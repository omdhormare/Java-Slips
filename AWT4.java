import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
    Label l1,l2;
    Button b1,b2;
    TextField t1,t2;
    Demo()
    {
       setVisible(true);
       setSize(500,500);
       setLayout(new GridLayout(5,5));
       setTitle("Square And cube");
       l1=new Label("Enter Number : ");
       l2=new Label("Result");
       b1=new Button("Square");
       b2=new Button("Cube");
       t1=new TextField(10);
       t2=new TextField(10);
       add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);

       b1.addActionListener(this);
       b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a1)
    {
        int a;
        if(a1.getSource()==b1)
        {
           a=Integer.parseInt(t1.getText());
           t2.setText(""+(a*a));
        }
        if(a1.getSource()==b2)
        {
            a=Integer.parseInt(t1.getText());
            t2.setText(""+a*a*a);
        }
    }
    public static void main(String argc[])
    {
        new Demo();
    }
}