package exercicio3;
/**
 * @author sbonato
 * Classe que cadastra a nota, o RA e o nome do aluno
 */

public class Nota{
	private String nome, ra;
	private double nota;

	public Nota(){

	}

	public Nota(String nome, String ra, double nota){
		this.nome = nome;
		this.ra = ra;
		this.nota = nota;
	}

	public String getNome(){
		return nome;
	}

	public String getRa(){
		return ra;
	}

	public double getNota(){
		return nota;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String toString(){
		return "Nome: "+nome+" RA: "+ra+" Nota: "+nota;
	}
}