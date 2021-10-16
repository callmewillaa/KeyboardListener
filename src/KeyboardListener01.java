import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener01 extends Frame implements KeyListener {

    Label l;
    TextArea area;

    KeyboardListener01() { //constructor
        l = new Label();
        l.setBounds(20, 50, 200, 20);

        area = new TextArea();
        area.setBounds(20, 80, 300, 300);

        area.addKeyListener(this);

        add(l);
        add(area);
        setTitle("Keyword Listener Kelas 1C");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String text = area.getText();

        //splitting the string in words
        String words[] = text.split("\\s");

        // printing the number of words and characters of the string
        l.setText("Words: " + words.length + "Characters:" + text.length());

    }

    public static void main(String[] args) {

        new KeyboardListener01();
    }

}


