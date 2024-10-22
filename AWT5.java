import java.awt.*;
import java.awt.event.*;
class fact extends Frame implements ActionListener
{
    Button b1;
    TextField t1,t2;
    Label l1,l2;
    fact()
    {
        setVisible(true);
        setTitle("Factorial Number...");
        setSize(500,600);
        setLayout(new FlowLayout());
        t1=new TextField(15);
        t2=new TextField(15);

        l1=new Label("Enter Number : ");
        l2=new Label("Factorial Number : ");
        
        b1=new Button("Calculate : ");   

        add(l1);add(t1);add(l2);add(t2);add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
   {
    try{
      int n,i,f=1;
       if(e.getSource()==b1)
       {
         n=Integer.parseInt(t1.getText());
         for(i=1;i<=n;i++)
         {
            f=f*i;
         }
         t2.setText(""+f);
       }
    }catch(Exception e1)
    {
      t2.setText("Invalid Number ..");
    }
}
    public static void main(String arc[])
    {
        new fact();
    }
}