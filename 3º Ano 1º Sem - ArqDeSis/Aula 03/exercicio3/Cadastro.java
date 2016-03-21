package exercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import exercicio3.Disciplina;
import exercicio3.Nota;


/**
 * @author sbonato
 * Cadastro de alunos, notas e da disciplina
 */
public class Cadastro{

	/**
	 * Inicia o cadastro e imprime o resultado
	 */
	public void cadastro(){

		ArrayList<Nota> notas = new ArrayList<Nota>();

		cadastraAluno(notas);
		Disciplina disciplina = cadastraDisciplina(notas);
		disciplina.resultado();
	}

	/**
	 * @param notas array de objetos Nota
	 * @return o objeto Disciplina criado
	 */
	private Disciplina cadastraDisciplina(ArrayList<Nota> notas) {
		String nomeDisciplina = JOptionPane.showInputDialog(null, "Nome da Disciplina:");
		Disciplina disciplina = new Disciplina(nomeDisciplina, notas);
		return disciplina;
	}

	/**
	 * @param notas array de objetos Nota
	 * Cria objetos Nota e os adiciona no arraylist de notas até que o usuário
	 * digite -1
	 */
	private void cadastraAluno(ArrayList<Nota> notas) {
		String nome;
		String ra;
		int continua = 0;
		double nota;
		while(continua != -1){
			nome = JOptionPane.showInputDialog(null, "Nome do aluno:");
			ra = JOptionPane.showInputDialog(null, "RA do aluno:");
			nota = cadastraNota();
			notas.add(new Nota(nome, ra, nota));
			continua = continua();
		}
	}

	/**
	 * @return retorna o inteiro pressionado ou 0 se houve erro de digitação
	 */
	private int continua() {
		int continua;
		try{
			continua = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Continua?(-1 para sair)"));
		}
		catch(NumberFormatException e){
			continua = 0;
		}
		return continua;
	}

	/**
	 * @return leitura da nota
	 */
	private double cadastraNota() {
		double nota;
		do{
			try{
				nota = Double.parseDouble(
						JOptionPane.showInputDialog(null, "Nota do aluno:\n(entre 0.0 e 10,0)"));
			}
			catch(NumberFormatException nf){
				nota = -1;
			}
		}
		while(nota < 0 || nota > 10);
		return nota;
	}
}