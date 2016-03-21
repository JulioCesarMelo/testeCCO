package consultarExtrato;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class Extrato {
	private int idMovimento;
	private int tipoMovimento;
	private double valor;
	private int numeroConta;
	private int numeroAgencia;
	private int numeroBanco;
	private String data;
	private ExtratoDAO extratoDAO;
	@SuppressWarnings("unused")
	private ConsultaExtratoTO cTO;
	public Extrato(){}

	public Extrato(int idMovimento, int tipoMovimento, double valor, int numeroConta, int numeroAgencia, int numeroBanco, String data) {
		this.idMovimento = idMovimento;
		this.tipoMovimento = tipoMovimento;
		this.valor = valor;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroBanco = numeroBanco;
		this.data = data;
	}
	public int getIdMovimento() {
		return idMovimento;
	}
	public void setIdMovimento(int idMovimento) {
		this.idMovimento = idMovimento;
	}
	public int getTipoMovimento() {
		return tipoMovimento;
	}
	public void setTipoMovimento(int tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public int getNumeroBanco() {
		return numeroBanco;
	}
	public void setNumeroBanco(int numeroBanco) {
		this.numeroBanco = numeroBanco;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ArrayList<Extrato> carregarDados(Connection conn, int numConta, String data) throws SQLException{
		extratoDAO = new ExtratoDAO();
		ArrayList<Extrato> resultExtrato = new ArrayList<>();
		try {
			resultExtrato =extratoDAO.carregarDados(conn, numConta, data);

		} catch (Exception e) {
			throw e;
		}
		
		cTO = new ConsultaExtratoTO(resultExtrato); 
		return resultExtrato;

	}
}
