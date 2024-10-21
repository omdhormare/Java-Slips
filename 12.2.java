import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
    Label l1;
    TextField t1;
    TextArea l2;
    Button b1;
    demo()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        l1=new Label("Enter Number : ");
        add(l1);
        t1=new TextField(20);
        add(t1);
         b1=new Button("Print Table");
        add(b1);
        l2=new TextArea();
        add(l2);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==b1)
       {
         int n=Integer.parseInt(t1.getText());
         t1.setText("");
         for(int i=1;i<=10;i++)
         {
            l2.append(n*i+"\n");
         }
       }
    }
    public static void main(String[] args) 
    {
        new demo();
    }
}
