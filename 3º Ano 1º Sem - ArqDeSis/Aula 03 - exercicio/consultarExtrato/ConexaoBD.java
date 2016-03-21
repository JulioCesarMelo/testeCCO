package consultarExtrato;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConexaoBD{
	@SuppressWarnings("unused")
	private ResourceBundle bundle;


	// -----------------------------------------------------------

	// Carrega driver JDBC



	static{

		try{
			Class.forName("com.mysql.jdbc.Driver");


		}catch (ClassNotFoundException e){
			throw new RuntimeException(e);

		}
	}
	// Obtém conexão com o banco de dados
	public static Connection obtemConexao() throws SQLException{

		return DriverManager.getConnection("jdbc:mysql://localhost/caixaeletronico?user=root&password=doidao01");

	}

}