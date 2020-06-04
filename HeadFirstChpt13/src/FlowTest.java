import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FlowTest {
    public static void main(String[] args) {
        FlowTest gui = new FlowTest();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button1 = new JButton("shock me");
        JButton button2 = new JButton("bliss");
        JButton button3 = new JButton("huh?");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
