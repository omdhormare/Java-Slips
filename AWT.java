import java.awt.*;
class Demo extends Frame
{
    Demo()
    {
        Label l1,l2;
        Button b1,b2,b3,b4;
        TextField t1,t2,t3;
        Frame f1=new Frame();
        setVisible(true);
        setBackground(Color.blue);
        setSize(1000,1000);
        setLayout(new GridLayout(0, 2));
        setTitle("Hello Java");

        l1=new Label("Enter 1 Number : ");
        l2=new Label("Enter 2 Number : ");
        
        t1=new TextField(10);
        t2=new TextField(10);
 
        b1=new Button("Submit");
        b2=new Button("Cancel");
        b3=new Button("Exit");
        b4=new Button("Reset");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    public static void main(String argc[])
    {
        Demo ob =new Demo();
    }
}