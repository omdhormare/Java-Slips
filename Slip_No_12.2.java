import java.awt.*;
import java.awt.event.*;
class mul extends Frame implements ActionListener
{
    Label l1;
    Button b1;
    TextField t1;
    TextArea t11;
    mul()
    {
        setSize(1000,1000);
        setVisible(true);
        setLayout(new GridLayout(4,4));
        l1=new Label("Enter Number : ");
        add(l1);
        t1=new TextField();
        add(t1);
        t11 = new TextArea();
        add(t11);
        b1=new Button("Print Table ");
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int n=Integer.parseInt(t1.getText());
            for(int i=1;i<=10;i++)
            {
                t11.append(n*i+"\n");
            }
        }
    }
    public static void main(String[] args) 
    {    
        new mul();
    }
}
