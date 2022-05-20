import javax.swing.*;
import java.awt.*;

public class LayoutManager {
    public static void main(String[] args) {
        JFrame frame = new JFrame("K19 - Java OO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(2, 3);
        panel.setLayout(layout);

        JButton button1 = new JButton("ACAO1");
        panel.add(button1, 0);

        JButton button2 = new JButton("ACAO2");
        panel.add(button2,1);

        JButton button3 = new JButton("ACAO3");
        panel.add(button3,2);

        JButton button4 = new JButton("ACAO4");
        panel.add(button4,3);

        JButton button5 = new JButton("ACAO5");
        panel.add(button5,4);

        JButton button6 = new JButton("ACAO6");
        panel.add(button6,5);

        frame.setContentPane(panel);

        //frame.setSize(300, 200);
        frame.pack();
        frame.setVisible(true);
    }
}