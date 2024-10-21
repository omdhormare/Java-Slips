
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class slip10 extends Applet implements ActionListener
{
    Label l,l1,l2,l3,l4;
    TextField t,t1,t2,t3,t4;
    Button b1,b2,b3;
    public void init()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
       l=new Label("Componets Intrest Calculator");
       l.setFont(new Font("Arial",Font.BOLD,30));
       add(l);

       l1=new Label("\nPrinciple Amount : ");
       setFont(new Font("Arial",Font.BOLD,15));
       add(l1);
       
       t=new TextField(30);
       add(t);

       l1=new Label("Intrest Rate : ");
       add(l1);

       l1.setFont(new Font("Arial",Font.BOLD,15));

       t1=new TextField(15);
       add(t1);

       l2=new Label("Time(Yrs) : ");
       add(l2);

       l2.setFont(new Font("Arial",Font.BOLD,15));

       t2=new TextField(5);
       add(t2);

       l3=new Label("Total Amount :");
       add(l3);

       l3.setFont(new Font("Arial",Font.BOLD,15));

       t3=new TextField(35);
       add(t3);

       l4=new Label("Interest Amount : ");
       add(l4);

       l4.setFont(new Font("Arial",Font.BOLD,15));

       t4=new TextField(30);
       add(t4);

       b1=new Button(" Calculate ");
       add(b1);
       b1.setFont(new Font("Arial",Font.BOLD,15));

       b2=new Button(" Clear ");
       add(b2);
       b2.setFont(new Font("Arial",Font.BOLD,15));

       b3=new Button(" Close ");
       add(b3);
       b3.setFont(new Font("Arial",Font.BOLD,15));

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
    {
        int pa=Integer.parseInt(t.getText());
        int ir=Integer.parseInt(t1.getText());
        int time=Integer.parseInt(t2.getText());

        int intrest = (pa*ir*time)/100;
        int total_amount=pa+intrest;

        t3.setText("" + total_amount);
        t4.setText("" + intrest);
    }
       else if(e.getSource()==b2)
    {
        t.setText("");
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
    }
    else if (e.getSource() == b3) 
    {
        System.exit(0); 
    }
    }
}