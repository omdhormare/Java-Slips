import java.awt.*;
import java.applet.*;

public class om extends Applet 
{
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1;

    public void init() 
    {
        l1 = new Label("Enter 1 No : ");
        l2 = new Label("Enter 2 No : ");
        l3 = new Label("Addition : ");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        b1 = new Button("Add");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
    }

}
