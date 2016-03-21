package exercicio4;
import java.util.*;

import javax.swing.JOptionPane;
/**
 * @author sbonato
 * Gera jogos da MegaSena.
 */
public class MegaSena{
	/**
	 * @param qtd quantidade de dezenas
	 * Gera as dezenas usando um array com 60 posi��es e marcando as sorteadas.
	 * Deste modo n�o h� repeti��o e a sa�da � ordenada
	 */
	public void geraDezenas(int qtd){
		//array de boolean para marcar as dezenas geradas
		boolean[] dezenas = new boolean[60];
		
		for(int i = 0; i < qtd;){
			//tirei o +1 da formula para gerar de 0 a 59, indices do array
			int dezena = (int)(Math.random()*60);
			//testa se a dezena j� foi sorteada
			if(!dezenas[dezena]){
				dezenas[dezena] = true;
				i++;//s� avan�a de for uma nova dezena
			}
		}
		//imprime as dezenas na ordem
		for(int i = 0; i < 60; i++){
			if(dezenas[i]){
				System.out.println(i+1);//soma 1 pq come�a em 0
			}
		}
	}
	/**
	 * @param qtd quantidade de dezenas
	 * Gera as dezenas usando um TreeSet, que tem por propriedade
	 * n�o permitir valores repitidos e por coloc�-los em ordem
	 */	
   public void geraDezenasComCollections(int qtd){
      TreeSet<Integer> dezenas = new TreeSet<Integer>();
      for(int i = 0; i < qtd;)
         if(dezenas.add((int)(Math.random()*60+1)))
            i++;
      
      for(int i:dezenas)
         System.out.println(i);
   }
	/**
	 * return o n�mero de dezenas escolhido pelo usu�rio; se o valor que ele
	 * escolher estiver fora do range de 6 a 10 o m�todo retorna 6
	 */
   public int quantidadeDezenas(){
	   int qtd = 0;
	   try{
		   qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas dezenas?\n(6 a 10)"));
		   if(qtd < 6 || qtd > 10){
			   throw new NumberFormatException();
		   }
	   }
	   catch(NumberFormatException e){
		   qtd = 6;
	   }
	   return qtd;
   }
}
      