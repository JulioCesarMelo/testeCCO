package saque;

public class SaqueTO {

	private int tipoMovimento;
	private double valor;
	private int numConta;
	private int numAgencia;
	private int numBanco;
	private String data;

	public SaqueTO(int tipoMovimento, double valor, int numConta, int numAgencia, int numBanco, String data) {
		this.tipoMovimento = tipoMovimento;
		this.valor = valor;
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.numBanco = numBanco;
		this.data = data;
	}

	public int getTipoMovimento() {
		return tipoMovimento;
	}

	public double getValor() {
		return valor;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getData() {
		return data;
	}

	public int getNumBanco() {
		return numBanco;
	}

	
	
}
