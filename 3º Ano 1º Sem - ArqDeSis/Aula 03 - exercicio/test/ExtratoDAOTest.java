package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import consultarExtrato.ConexaoBD;
import consultarExtrato.ExtratoDAO;
//import to.ClienteTO;
//import dao.ClienteDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtratoDAOTest {
	ExtratoDAO dao;
	ConexaoBD conn;
	
	@Before
	public void setUp() throws Exception {
		dao = new ExtratoDAO();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testcarregar() throws SQLException {
		assertNotNull("array não está nulo", dao.carregarDados(conn.obtemConexao(), 1, "agosto"));
		
	}
}
