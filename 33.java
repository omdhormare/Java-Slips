/*B) Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and 
MOUSE_CLICK and display the position of the Mouse_Click in a TextField */

import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements MouseMotionListener,MouseListener
{
    Label l1,l2;
    TextField t1,t2;
    demo()
    {
        setVisible(true);
        setSize(300,500);
        setLayout(new FlowLayout());
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
       public void mouseMoved(MouseEvent e)
      {
        t1.setText("Y : "+e.getY() + "X : "+ e.getX());
      }
      public void mouseClicked(MouseEvent e)
      {
        t2.setText("Y : " + e.getY() + "X : "+e.getY());
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
    public static void main(String argc[])
    {
        new demo();
    }
}