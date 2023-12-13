import java.awt.*;
import java.io.File;
import javax.swing.*;

public class GUI {
    public GUI()
    {
        JFrame frame = new JFrame("background");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon bg = new ImageIcon("images.png");
        JLabel label = new JLabel(bg);
        frame.add(label);
        label.setPreferredSize(new Dimension(700, 500));
        //frame.getContentPane().add(label, BorderLayout.PAGE_START);
        frame.pack();
        frame.setVisible(true);
    }
}
