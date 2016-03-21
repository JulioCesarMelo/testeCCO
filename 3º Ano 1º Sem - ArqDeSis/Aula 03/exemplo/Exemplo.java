package exemplo;

import javax.swing.JOptionPane;

public class Exemplo {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o primeiro numero"));
		int b = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o segundo numero"));
		
		int c = a + b;
		
		JOptionPane.showMessageDialog(null, "A soma é: "+c);

	}
	
}
