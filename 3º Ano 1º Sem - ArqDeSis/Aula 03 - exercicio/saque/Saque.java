package saque;
import java.sql.Connection;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class Saque {
	private int tipoMovimento;
	private double valor;
	private SaqueDAO saqueDAO;
	
	public Saque(int tipoMovimento, double valor) {
		super();
		this.tipoMovimento = tipoMovimento;
		this.valor = valor;
		this.saqueDAO = new SaqueDAO();
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
	public void inserirSaque(Connection conn, int tipoMovimento, double valor, int numConta, int numAgencia, int numBanco, String data) throws Exception{
		try {
			SaqueTO sTO = new SaqueTO(tipoMovimento,valor,numConta,numAgencia,numBanco,data); 
			saqueDAO.inserirMovimento(conn, sTO);
			int id_movimento = saqueDAO.consultaMovimento(conn,sTO);
			saqueDAO.inserirSaque(conn, tipoMovimento, id_movimento);
		} catch (Exception e) {
			throw e;
		}
	}

}
