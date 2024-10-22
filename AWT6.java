import java.awt.*;
import java.awt.event.*;
class sum extends Frame implements ActionListener
{
    Button b1;
    TextField t1,t2;
    Label l1,l2;
    sum()
    {
       setVisible(true);
       setSize(600,500);
       setTitle("Sum Of Digit..");
       setLayout(new FlowLayout());
       b1=new Button("Sum Of Digit");
       l1=new Label("Enter Number : ");
       l2=new Label("Result : ");
       t1=new TextField(20);
       t2=new TextField(20);

       add(l1);add(t1);add(l2);add(t2);add(b1);
       b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int i,n,sum=0,d;
        try
        {
           if(e.getSource()==b1)
           {
              n=Integer.parseInt(t1.getText());
              while(n>0)
              {
                 d=n%10;
                 sum=sum+d;
                 n=n/10;
              }
              t2.setText(""+sum);
           }
        }catch(Exception e1)
        {
            t2.setText(""+e1);            
        }
    }
  public static void main(String arc[])
  {
    new sum();
  }
}