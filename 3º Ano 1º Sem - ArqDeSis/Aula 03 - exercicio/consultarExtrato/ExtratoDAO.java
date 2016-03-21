package consultarExtrato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ExtratoDAO {
	ArrayList<Extrato> resultExtrato = new ArrayList<>();
	public ArrayList<Extrato> carregarDados(Connection conn, int numConta, String data) throws SQLException{
		PreparedStatement stm = null;
		String query = "select * from movimento where numero_conta = ? and data_movimento > ? order by data_movimento";
		try {
			stm = conn.prepareStatement(query);
			stm.setInt    (1, numConta);
			stm.setString (2, data);
			stm.execute();
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Extrato extrato = new Extrato();
				extrato.setIdMovimento  (rs.getInt   (1));
				extrato.setTipoMovimento(rs.getInt   (2));
				extrato.setValor        (rs.getInt   (3));
				extrato.setNumeroConta  (rs.getInt   (4));
				extrato.setNumeroAgencia(rs.getInt   (5));
				extrato.setNumeroBanco  (rs.getInt   (6));
				extrato.setData         (rs.getString(7));
				resultExtrato.add(extrato);
			}
		} catch (SQLException e) {
			throw e;
		}
		return resultExtrato;
	}
}
