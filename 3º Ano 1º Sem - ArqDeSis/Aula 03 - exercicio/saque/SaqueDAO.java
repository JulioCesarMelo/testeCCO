package saque;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SaqueDAO {
	public boolean inserirMovimento(Connection conn, SaqueTO sTO) throws SQLException{
		PreparedStatement stm = null;
		String sqlInsert = new StringBuilder()
		.append("insert into movimento values(0,?,?,?,?,?,?)").toString();

		try {
			stm = conn.prepareStatement(sqlInsert);
			stm.setInt(1, sTO.getTipoMovimento());
			stm.setDouble(2, sTO.getValor());
			stm.setInt(3, sTO.getNumConta());
			stm.setInt(4, sTO.getNumAgencia());
			stm.setInt(5, sTO.getNumBanco());
			stm.setDate(6, Date.valueOf(sTO.getData()));
			stm.execute();
			return true;
		} catch (SQLException e) {
			return false;
			
		}
		
	}
	public int consultaMovimento(Connection conn,SaqueTO sTO) throws SQLException{
		int idMovimento = 0;
		PreparedStatement stm = null;
		String sqlSelect = new StringBuilder()
		.append("select max(id_movimento) ")
		.append("  from movimento         ")
		.append(" where numero_conta = ?  ")
		.append("   and numero_agencia = ?")
		.append("   and numero_banco = ?  ")
		.append("   and valor = ?         ").toString();

		try {
			stm = conn.prepareStatement(sqlSelect);
			stm.setInt(1, sTO.getNumConta());
			stm.setInt(2, sTO.getNumAgencia());
			stm.setInt(3, sTO.getNumBanco());
			stm.setDouble(4, sTO.getValor());

			ResultSet rs = stm.executeQuery();
			if (rs.next()) idMovimento = rs.getInt(1);

		} catch (SQLException e) {
			throw e;
		}
		return idMovimento;

	}
	public boolean inserirSaque(Connection conn, int tipoMovimento, int id_movimento) throws SQLException{
		PreparedStatement stm = null;
		String sqlInsert = new StringBuilder()
		.append("insert into saque values(?,?)").toString();

		try {
			stm = conn.prepareStatement(sqlInsert);
			stm.setInt(1, tipoMovimento);
			stm.setInt(2, id_movimento);
			stm.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
}