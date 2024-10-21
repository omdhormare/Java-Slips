import java.awt.*;
class demo extends Frame
{
    Label l1;
    demo()
    {
      setSize(500,500);
      setVisible(true);
      setLayout(new FlowLayout());
      l1=new Label("Hii I am Om Dhormare");
      add(l1);
      l1.setBackground(Color.RED);
      l1.setFont(new Font("arial",Font.BOLD,20));
    }
    public static void main(String[] args) 
    {
        new demo();    
    }
}