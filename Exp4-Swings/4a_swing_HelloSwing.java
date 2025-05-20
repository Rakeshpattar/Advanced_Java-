/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package swing;
import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 200);
        frame.setLayout(new FlowLayout());

        // Create the label with the message
        JLabel label = new JLabel("Hello! VI B, Welcome to Swing Programming");

        // Set font: plain style, size 32
        Font font = new Font("SansSerif", Font.PLAIN, 32);
        label.setFont(font);

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Set frame visibility
        frame.setVisible(true);
    }
}
