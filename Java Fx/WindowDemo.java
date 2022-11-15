import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.EventListenerList;
import javax.swing.event.MouseInputListener;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

class Window extends JFrame {
    // instance variables
    JButton btn;
    JLabel text;
    int count;

    public Window() {
        count = 0;
        setSize(500, 600);
        setTitle("Window Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        addElements();
    }

    public void addElements() {
        Container con = this.getContentPane();

        // setting up the button
        btn = new JButton("" + count);
        btn.setSize(100, 30);
        btn.setLocation(200, 300);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn.setText("" + (Integer.parseInt(btn.getText()) + 1));
            }
        });

        btn.addMouseListener(new MouseInputAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                text.setText("Click kar aur bahar ja");
            }

            public void mouseExited(MouseEvent arg0) {
                text.setText("Click kar na");
            }
        });

        // setting up the text label
        text = new JLabel("Click the button below");
        text.setSize(200, 30);
        text.setLocation(180, 230);

        // add all components to screen
        con.add(btn);
        con.add(text);
    }
}

public class WindowDemo {
    public static void main(String[] args) {
        Window win = new Window();
        win.setVisible(true);
    }
}
