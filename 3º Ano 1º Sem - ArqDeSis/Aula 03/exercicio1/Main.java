/**
 * 
 */
package exercicio1;

/**
 * @author sbonato
 * Inicia o programa
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ordem ordem = new Ordem();
		/*testando as 6 permutações possíveis de 3 números
		os resultados devem ser sempre 1, 2 ,3*/
		System.out.println(ordem.crescente(1, 2, 3));
		System.out.println(ordem.crescente(1, 3, 2));
		System.out.println(ordem.crescente(2, 1, 3));
		System.out.println(ordem.crescente(2, 3, 1));
		System.out.println(ordem.crescente(3, 1, 2));
		System.out.println(ordem.crescente(3, 2, 1));
	}

}
