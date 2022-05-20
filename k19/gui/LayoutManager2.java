import javax.swing.*;
import java.awt.*;

public class LayoutManager {
    public static void main(String[] args) {
        JFrame frame = new JFrame("K19 - Java OO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);

        JButton button1 = new JButton("ACAO1");
        panel.add(button1);

        JButton button2 = new JButton("ACAO2");
        panel.add(button2);

        JButton button3 = new JButton("ACAO3");
        panel.add(button3);

        JButton button4 = new JButton("ACAO4");
        panel.add(button4);

        JButton button5 = new JButton("ACAO5");
        panel.add(button5);

        frame.setContentPane(panel);

        //frame.setSize(300, 200);
        frame.pack();
        frame.setVisible(true);
    }
}