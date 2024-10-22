import java.awt.*;
import java.awt.event.*;
class reg extends Frame
{
    Button b1,b2;
    TextField t1,t2,t3,t4;
    ///Label l1,l2,l3,l3;
    Label t;
    reg()
    {
        setVisible(true);
        setSize(1000,600);
        setLayout(null);

        setTitle("Student Registration....");
        t=new Label("Student Registration....");

        t.setBounds(500, 80, 200, 20);
        t1=new TextField(10);
        t1.setBounds(50, 100, 200, 10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        add(t);add(t1);add(t2);add(t3);add(t4);
    }
    public static void main(String arg[])
    {
        new reg();
    }
}