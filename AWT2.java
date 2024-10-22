import java.awt.*;
import java.awt.event.*;
class color extends Frame implements ActionListener
{
  Button b1,b2,b3,b4;
  color()
  {
    Frame f1=new Frame();
     setVisible(true);
     setLayout(new FlowLayout());
     setSize(1000,1000);
     setTitle("Baground Color ");
     b1=new Button("Red");
     b2=new Button("Blue");
     b3=new Button("Orange");
     b4=new Button("Black");
     add(b1);add(b2);add(b3);add(b4);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
  }
  public void actionPerformed(ActionEvent a)
  {
     if(a.getSource()==b1)
     {
        setBackground(Color.red);
     }
     if(a.getSource()==b2)
     {
        setBackground(Color.blue);
     }
     if(a.getSource()==b3)
     {
        setBackground(Color.orange);
     }
     if(a.getSource()==b4)
     {
        setBackground(Color.black);
     }
  }
   public static void main(String arcs[])
   {
    new color();
   }
}