import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotion extends MouseMotionAdapter {
    Frame f;

    MouseMotion(){
        f = new Frame("Mouse Motion");
        f.addMouseMotionListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),20,20);

    }

    public static void main(String[] args) {
        new MouseMotion();
    }
}