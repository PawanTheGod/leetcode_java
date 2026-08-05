import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener {

    JLabel label;

    MouseListenerExample() {
        label = new JLabel("Click anywhere inside the window");
        label.setBounds(50, 50, 250, 30);

        add(label);
        addMouseListener(this);

        setTitle("Mouse Listener Example");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at  "+ "X : "+e.getX() +" Y : "+ e.getY());
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed"+ "X : "+e.getX() +" Y : "+ e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released"+ "X : "+e.getX() +" Y : "+ e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered"+ "X : "+e.getX() +" Y : "+ e.getY());
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited"+ "X : "+e.getX() +" Y : "+ e.getY());
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}