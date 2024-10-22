import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements MouseMotionListener,MouseListener
{
    Label l1,l2;
    TextField t1,t2;
    demo()
    {
       setSize(500,500);
       setLayout(new FlowLayout());
       setVisible(true);
       l1=new Label("Mouse Moved Position : ");
       add(l1);
       t1=new TextField(20);
       add(t1);
       l2=new Label("Mouse Click Position : ");
       add(l2);
       t2=new TextField(20);
       add(t2);
       
       addMouseMotionListener(this);
       addMouseListener(this);
    }
    public void mouseClicked(MouseEvent m)
    {
        t1.setText("X : "+m.getX() + "Y : "+m.getY());
    }
    public void mouseMoved(MouseEvent m)
    {
        t2.setText("X : "+m.getX() + "Y : "+m.getY());
    }
    public void mouseDragged(MouseEvent m)
    {}
    public void mouseExited(MouseEvent m)
    {}
    public void mouseEntered(MouseEvent m)
    {}
    public void  mouseReleased(MouseEvent m)
    {}
    public void  mousePressed(MouseEvent m)
    {}

    public static void main(String[] args) 
    {
        new demo();
    }
}