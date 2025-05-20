/*Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonUI implements ActionListener {

    JLabel messageLabel;
    JButton digitalClockButton, hourGlassButton;

    public ImageButtonUI() {
        JFrame frame = new JFrame("Clock & Hourglass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout(20, 20));

        // Message Label
        messageLabel = new JLabel("Click an image!", SwingConstants.CENTER);
        messageLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        frame.add(messageLabel, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 10));

        // Load and scale images
        ImageIcon clockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

        // Optional: resize icons
        clockIcon = new ImageIcon(clockIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        hourGlassIcon = new ImageIcon(hourGlassIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        // Create buttons
        digitalClockButton = new JButton(clockIcon);
        hourGlassButton = new JButton(hourGlassIcon);

        // Add listeners
        digitalClockButton.addActionListener(this);
        hourGlassButton.addActionListener(this);

        // Add buttons to panel
        buttonPanel.add(digitalClockButton);
        buttonPanel.add(hourGlassButton);

        // Add panel to frame
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.getContentPane().setBackground(new Color(240, 240, 240)); // Light gray background
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalClockButton) {
            messageLabel.setText("You have pressed digital clock!");
        } else if (e.getSource() == hourGlassButton) {
            messageLabel.setText("You have pressed hour glass!");
        }
    }

    public static void main(String[] args) {
        new ImageButtonUI();
    }
}
