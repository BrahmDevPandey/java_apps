import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.Font;

// result window for Verification class

public class Result extends JFrame {
    Result() {
        setSize(600, 400);
        setLocation(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        // setting up the result content pane
        Container resultPane = getContentPane();
        resultPane.setLayout(null);

        // adding the final message label
        JLabel messageLabel1 = new JLabel("Congratulations!!!");
        Font messageFont1 = new Font("Courier", Font.BOLD, 30);
        messageLabel1.setFont(messageFont1);
        messageLabel1.setSize(350, 50);
        messageLabel1.setLocation(150, 100);
        resultPane.add(messageLabel1);

        JLabel messageLabel2 = new JLabel("You are a verified GAY now!");
        Font messageFont2 = new Font("Courier", Font.BOLD, 25);
        messageLabel2.setFont(messageFont2);
        messageLabel2.setSize(500, 150);
        messageLabel2.setLocation(100, 150);
        resultPane.add(messageLabel2);
    }
}