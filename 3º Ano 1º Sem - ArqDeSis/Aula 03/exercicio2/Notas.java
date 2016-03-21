package exercicio2;

import javax.swing.JOptionPane;

/**
 * @author sbonato
 * L� notas at� que o usu�rio digite -1
 * Imprime a maior, a menor e a m�dia
 */
public class Notas {
	public void leEImprimeNotas(){
		double menor = 10.0; //maior nota poss�vel
		double maior = 0.0; //menor nota poss�vel
		double soma = 0.0; //para calcular a media
		int qtd = 0; //numero de notas digitadas para calcular a media
		double nota;
		
		while((nota = leNota()) != -1){
			qtd++;
			soma += nota;
			if(nota > maior){
				maior = nota;
			}
			if(nota < menor){
				menor = nota;
			}
		}
		if(qtd > 0){
			System.out.printf("Menor nota = %.1f\n", menor);
			System.out.printf("Maior nota = %.1f\n", maior);
			System.out.printf("M�dia      = %.1f\n", soma/qtd);
		}
	}
	
	/**
	 * @return retorna o n�mero pressionado
	 */
	private double leNota() {
		double nota = 11.0;//para entrar no loop
		while((nota < 0.0 || nota > 10.0) && nota != -1.0){
			try{
				nota = Double.parseDouble(
						JOptionPane.showInputDialog("Qual a nota?(-1 para sair)"));
			}
			catch(NumberFormatException e){
				nota = -2.0;//para for�ar nova digita��o
			}
		}
		return nota;
		}
}
