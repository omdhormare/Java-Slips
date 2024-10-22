import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener 
{
    Label l1,l2,l3,l4,l,l5;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2,b3;
    demo()
    {
       setSize(500,500);
       setVisible(true);
       setLayout(new FlowLayout(FlowLayout.CENTER));
       l=new Label("Compund Intrest Calculate");
       l.setFont(new Font("arial",Font.BOLD,30));
       add(l);
       l1=new Label("Principle Amound");
       l1.setFont(new Font("arial",Font.BOLD,15));
       add(l1);
       t1=new TextField(30);
       t1.setFont(new Font("arial",Font.BOLD,15));
       add(t1);

       l2=new Label("Intrest Rate ");
       l2.setFont(new Font("arial",Font.BOLD,15));
       add(l2);
       t2=new TextField(10);
       t2.setFont(new Font("arial",Font.BOLD,15));
       add(t2);

       l3=new Label("Time(Yrs) ");
       l3.setFont(new Font("arial",Font.BOLD,15));
       add(l3);
       t3=new TextField(10);
       t3.setFont(new Font("arial",Font.BOLD,15));
       add(t3);

       l4=new Label("Total Amount ");
       l4.setFont(new Font("arial",Font.BOLD,15));
       add(l4);
       t4=new TextField(30);
       t4.setFont(new Font("arial",Font.BOLD,15));
       add(t4);

       l5=new Label("Intrest Amount ");
       l5.setFont(new Font("arial",Font.BOLD,15));
       add(l5);
       t5=new TextField(25);
       t5.setFont(new Font("arial",Font.BOLD,15));
       add(t5);

       b1=new Button("Calculate");
       b1.setFont(new Font("arial",Font.BOLD,15));
       add(b1);

       b2=new Button("Clear");
       b2.setFont(new Font("arial",Font.BOLD,15));
       add(b2);

       b3=new Button("Close");
       b3.setFont(new Font("arial",Font.BOLD,15));
       add(b3);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int amt=Integer.parseInt(t1.getText());
            int rate=Integer.parseInt(t2.getText());
            int time=Integer.parseInt(t3.getText());

            int total=amt*rate*time/100;
            int ia=total+amt;
            
            t4.setText(""+total);
            t5.setText(""+ia);
        }
        if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
        if(e.getSource()==b3)
        {
            dispose();
        }
    }
    public static void main(String[] args) {
        new demo();
    }
  
}