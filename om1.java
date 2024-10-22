/*B) Write a java program using Applet to implement a simple arithmetic calculator. */
import java.awt.*;
import java.applet.*;
public class om1 extends Applet
{
    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    TextField t;
    public void init()
    {
       setLayout(new GridLayout(6, 10));
       t=new TextField(100);
       add(t);
       b=new Button("1");
       add(b);
       b1=new Button("2");
       add(b1);
       b2=new Button("3");
       add(b2);
       b3=new Button("4");
       add(b3);
       b4=new Button("5");
       add(b4);
       b5=new Button("6");
       add(b5);
       b6=new Button("7");
       add(b6);
       b7=new Button("8");
       add(b7);
       b8=new Button("9");
       add(b8);
       b9=new Button("+");
       add(b9);
       b10=new Button("-");
       add(b10);
       b11=new Button("*");
       add(b11);
       b12=new Button("/");
       add(b12);
    }
}