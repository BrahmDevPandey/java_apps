import java.awt.Container;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// class for creating the ui of the application
class Temperature extends JFrame {
    double inputTemp, outputTemp;
    char tempUnit, resultUnit;

    Container c;
    JLabel title;
    JLabel message1;
    JLabel message2;
    JButton inputUnitLabel;
    JButton outputUnitLabel;
    JTextField tempValue;
    JTextField resultValue;
    JButton convertButton;

    public Temperature() {
        inputTemp = 0;
        outputTemp = 0;
        tempUnit = 'C';
        resultUnit = 'F';
        c = this.getContentPane();
        c.setLayout(null);

        // setting up the title
        Font titleFont = new Font("Arial", Font.BOLD, 20);
        title = new JLabel("Temperature Converter", JLabel.CENTER);
        title.setFont(titleFont);
        title.setSize(title.getPreferredSize());
        title.setLocation(180, 50);

        // setting up the message label 1 for giving message to the user
        Font messageFont = new Font("Arial", Font.PLAIN, 18);
        message1 = new JLabel("Your temperature value: ");
        message1.setFont(messageFont);
        message1.setSize(message1.getPreferredSize());
        message1.setLocation(100, 130);

        // setting up the message label 2 for giving message to the user
        message2 = new JLabel("Converted temperature value: ");
        message2.setFont(messageFont);
        message2.setSize(message2.getPreferredSize());
        message2.setLocation(100, 180);

        // setting up the temperature input field
        tempValue = new JTextField();
        tempValue.setSize(150, 25);
        tempValue.setLocation(350, 130);

        // setting up the temperature output field
        resultValue = new JTextField();
        resultValue.setSize(150, 25);
        resultValue.setLocation(350, 180);
        resultValue.setEditable(false);

        // setting up the input unit indicator
        inputUnitLabel = new JButton("" + tempUnit);
        inputUnitLabel.setFont(messageFont);
        inputUnitLabel.setSize(inputUnitLabel.getPreferredSize());
        inputUnitLabel.setLocation(510, 125);
        inputUnitLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tempUnit == 'C') {
                    tempUnit = 'F';
                    resultUnit = 'C';
                } else {
                    tempUnit = 'C';
                    resultUnit = 'F';
                }
                // update the buttons text accordingly
                tempValue.setText("");
                resultValue.setText("");
                inputUnitLabel.setText("" + tempUnit);
                outputUnitLabel.setText("" + resultUnit);
            }
        });

        // setting up the input unit indicator
        outputUnitLabel = new JButton("" + resultUnit);
        outputUnitLabel.setFont(messageFont);
        outputUnitLabel.setSize(inputUnitLabel.getPreferredSize());
        outputUnitLabel.setLocation(510, 175);
        outputUnitLabel.setEnabled(false);

        // setting up the convert button
        convertButton = new JButton("Convert");
        convertButton.setFont(messageFont);
        convertButton.setSize(convertButton.getPreferredSize());
        convertButton.setLocation(250, 250);
        // adding the core converion logic into the onActionPerformed handler of the
        // Convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    inputTemp = Double.parseDouble(tempValue.getText());
                    if (tempUnit == 'C') {
                        outputTemp = (inputTemp / 5) * 9 + 32;
                    } else {
                        outputTemp = (inputTemp - 32) * 5 / 9;
                    }

                    // setting the result value
                    resultValue.setText("%.2f".formatted(outputTemp));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Invalid value in temperature.");
                }
            }
        });

        // add all the ui components
        c.add(title);
        c.add(message1);
        c.add(message2);
        c.add(tempValue);
        c.add(resultValue);
        c.add(inputUnitLabel);
        c.add(outputUnitLabel);
        c.add(convertButton);
    }
}

public class TemperatureConversion {
    public static void main(String[] args) {
        Temperature tempWindow = new Temperature();

        // setting up the window
        tempWindow.setSize(600, 400);
        tempWindow.setLocation(200, 200);
        tempWindow.setResizable(false);
        tempWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempWindow.setVisible(true);
    }
}
