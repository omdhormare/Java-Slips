import java.applet.*;
import java.awt.*;
public class suc extends Applet
{
    public void paint(Graphics g)
    {
        setBackground(Color.black);
        Color c=new Color((float)Math.random(),
                           (float)Math.random(),  
                           (float)Math.random());
        g.setColor(c);
        g.drawRect(0,250,290,290);
        g.drawLine(125,250,125,160);
        g.drawLine(175,250,175,160);
        g.drawArc(85,157,130,50,-65,312);
        g.drawArc(85,87,130,50,62,58);
        g.drawLine(85,177,119,89);
        g.drawLine(215,177,181,89);
    }
}