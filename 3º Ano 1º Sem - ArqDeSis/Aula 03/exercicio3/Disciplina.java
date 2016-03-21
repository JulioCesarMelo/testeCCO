package exercicio3;
import java.util.ArrayList;

/**
 * @author sbonato
 * Cadastro da disciplina
 */

public class Disciplina{

	private String nome;
	private ArrayList<Nota> notas;

	public Disciplina(String nome, ArrayList<Nota> notas){
		this.nome = nome;
		this.notas = notas;
	}
	/*
	 * Imprime a maior nota e o nome e o RA do aluno de maior nota; 
	 * o mesmo para a menor nota e a m�dia das notas
	 */
	
	public void resultado(){
		double soma=0;
		Nota maior=null, menor=null;
		//inicializa maior e menor com a nota do primeiro objeto Nota do arraylist
		if(notas.size() > 0){
			maior = notas.get(0);
			menor = notas.get(0);
		}

		//� um for-each, lembra?
		for(Nota nota:notas){
			if(nota.getNota() > maior.getNota()){
				maior = nota;
			}

			if(nota.getNota() < menor.getNota()){
				menor = nota;
			}
			soma += nota.getNota();
		}
		if(notas.size()>0){
			System.out.println("Disciplina: "+nome);
			System.out.println("Maior - "+maior);
			System.out.println("Menor - "+menor);
			System.out.printf("Media - %.2f\n",(soma/notas.size()));
		}
	}
}