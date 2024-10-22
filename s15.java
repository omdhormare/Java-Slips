import java.awt.*;
import java.applet.*;

public class s15 extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillOval(50,50,200,200);
        g.setColor(Color.BLACK);
        g.fillOval(90,100,30,30);
        g.fillOval(180,100,30,30);
        g.drawArc(90,150,120,60,0,-180);
    }
}
