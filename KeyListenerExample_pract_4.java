import javax.swing.*;
import java.awt.event.*;

public class KeyListenerExample_pract_4 extends JFrame implements KeyListener {

    JLabel label;

    KeyListenerExample_pract_4() {

        label = new JLabel();
        label.setBounds(50, 50, 300, 30);

        addKeyListener(this);
        add(label);

        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListenerExample_pract_4();
    }
}