import javax.swing.*;

public class Componentes {
	public static void main(String[] args) {
        JFrame frame = new JFrame("K19 - Java OO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JLabel rotulo = new JLabel();
		rotulo.setText("Nome:");
		panel.add(rotulo);

		JTextField textField = new JTextField(40);
		panel.add(textField);
        
        JTextArea textArea = new JTextArea(10 , 20);
		panel.add(textArea);
		
        JPasswordField passwordField = new JPasswordField(20);
		panel.add(passwordField);
        
		JButton botao1 = new JButton("SIM");
		JButton botao2 = new JButton("NÃO");
		JButton botao3 = new JButton("CANCEL");
		panel.add(botao1);
		panel.add(botao2);
		panel.add(botao3);
		
		JCheckBox checkBox1 = new JCheckBox("Rafael Cosentino");
		JCheckBox checkBox2 = new JCheckBox("Jonas Hirata");
		JCheckBox checkBox3 = new JCheckBox("Marcelo Martins");
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(checkBox3);
		
		String[] items = new String[3];
		items[0] = "Rafael Cosentino";
		items[1] = "Jonas Hirata";
		items[2] = "Marcelo Martins";

		JComboBox comboBox = new JComboBox(items);
		panel.add(comboBox);
		
		frame.setContentPane(panel);

		//frame.setSize(300, 200);
		frame.pack();
		frame.setVisible(true);
	}
}