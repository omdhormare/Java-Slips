/*B) Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICK and
 display the position of the Mouse_Click in a TextField */
import java.awt.*;
import java.awt.event.*;
class mouse extends Frame implements MouseMotionListener , MouseListener
{
    Label l1,l2;
    TextField t1,t2;
    mouse()
    {
      setSize(500,500);
      setVisible(true);
      setLayout(new GridLayout(5,3));
      l1=new Label("Mouse Moved Position : ");
      add(l1);
      t1=new TextField();
      add(t1);
      l2=new Label("Mouse Click Position : ");
      add(l2);
      t2=new TextField();
      add(t2);
      
      addMouseMotionListener(this);
      addMouseListener(this);
    }   
    public void mouseMoved(MouseEvent e)
    {
        t1.setText("X : " + e.getX() +"Y : "+ e.getY());
    }
    public void mouseClicked(MouseEvent e)
    {
        t2.setText("X : "+e.getX() +"Y : " + e.getY());
    }
    public void mouseDragged(MouseEvent e)
    {}
    public void mouseExited(MouseEvent e)
    {}
    public void mouseEntered(MouseEvent e)
    {}
    public void mouseReleased(MouseEvent e)
    {}
    public void mousePressed(MouseEvent e)
    {}

    public static void main(String[] args) 
    {
        new mouse();
    }
}