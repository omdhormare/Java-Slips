import java.awt.*;
class demo extends Frame
{
    Label l1;
    demo()
    {
      setVisible(true);
      setLayout(new FlowLayout());
      setSize(500,500);
      l1=new Label("Dr.D Y Patil Collage");
      add(l1);
      l1.setBackground(Color.RED);
      l1.setFont(new Font("arial",Font.BOLD,20));

    }
    public static void main(String argc[])
    {
        new demo();
    }
}