import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// program to verify whether you are a G*y or not

public class Verification extends JFrame {
    Verification() {
        // setting up the frame
        setSize(600, 400);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        // setting up the default content pane
        Container c = getContentPane();
        c.setLayout(null);

        // the question label
        JLabel questionLabel = new JLabel("Are you a gay?");
        Font questionFont = new Font("Courier", Font.BOLD, 25);
        questionLabel.setSize(300, 40);
        questionLabel.setLocation(200, 100);
        questionLabel.setFont(questionFont);
        c.add(questionLabel);

        // the YES button
        JButton yesButton = new JButton("YES. Certainly.");
        Font buttonFont = new Font("Courier New", Font.BOLD, 15);
        yesButton.setSize(180, 40);
        yesButton.setLocation(80, 200);
        yesButton.setFont(buttonFont);
        c.add(yesButton);

        // the NO button
        JButton noButton = new JButton("NO Way!");
        noButton.setSize(180, 40);
        noButton.setLocation(320, 200);
        noButton.setFont(buttonFont);
        c.add(noButton);

        // setting up the onHover listeners
        noButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent ev) {
                noButton.setText("YES. Certainly.");
                yesButton.setText("NO Way!");
            }

            public void mouseExited(MouseEvent ev) {
                noButton.setText("NO Way!");
                yesButton.setText("YES. Certainly.");
            }
        });

        // adding onClickListeners to the buttons
        ActionListener clickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                new Result();
            }
        };

        noButton.addActionListener(clickListener);
        yesButton.addActionListener(clickListener);
    }

    public static void main(String[] args) {
        new Verification();
    }
}