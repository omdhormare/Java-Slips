import java.applet.*;
import java.awt.*;
public class p extends Applet
{
    public void init()
    {}
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(150,150,200,200);
        g.setColor(Color.red);
        g.drawOval(200,200,25,25);
        g.drawOval(270,200,25,25);
        g.drawArc(200,200,100,100,180,180);
    }
}
