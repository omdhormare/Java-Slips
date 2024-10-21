import java.applet.*;
import java.awt.*;
import java.util.Random;

public class A12 extends Applet implements Runnable {
    Color lampColor;
    Thread t;
    Random rand = new Random();

    // Start method for the applet
    public void start() {
        t = new Thread(this);
        t.start();
    }

    // The core part of our applet where the magic happens
    public void run() {
        while (true) {
            // Change the lamp color randomly every 1 second
            lampColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            repaint();  // Update the applet to show the new color
            try {
                Thread.sleep(1000);  // Wait for 1 second before changing color again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Drawing the table lamp
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.lightGray);

        // Lamp base (rectangle)
        g.setColor(Color.darkGray);
        g.fillRect(90, 150, 60, 100);

        // Lamp shade (circle, changing color)
        g.setColor(lampColor);
        g.fillOval(70, 50, 100, 100);

        // Some fun text to add a bit of humor 😎
        g.setColor(Color.black);
        g.drawString("Randomly Color Changing Lamp!", 40, 280);
    }
}
