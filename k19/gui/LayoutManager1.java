import javax.swing.*;
import java.awt.*;

public class LayoutManager {
    public static void main(String[] args) {
        JFrame frame = new JFrame("K19 - Java OO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        BorderLayout layout = new BorderLayout();
        panel.setLayout(layout);

        JButton button1 = new JButton("NORTE");
        panel.add(button1, BorderLayout.NORTH);

        JButton button2 = new JButton("SUL");
        panel.add(button2, BorderLayout.SOUTH);

        JButton button3 = new JButton("LESTE");
        panel.add(button3, BorderLayout.EAST);

        JButton button4 = new JButton("OESTE");
        panel.add(button4, BorderLayout.WEST);

        JButton button5 = new JButton("CENTRO");
        panel.add(button5, BorderLayout.CENTER);

        frame.setContentPane(panel);

        //frame.setSize(300, 200);
        frame.pack();
        frame.setVisible(true);
    }
}