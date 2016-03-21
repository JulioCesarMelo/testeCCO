package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import consultarExtrato.ConexaoBD;
import saque.SaqueDAO;
import saque.SaqueTO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaqueDAOTest {
	SaqueDAO dao;
	ConexaoBD conn;
	SaqueTO sTO = null;
	
	@Before
	public void setUp() throws Exception {
		dao = new SaqueDAO();
		sTO = new SaqueTO(1,2.0,3,4,5,"2015-03-03");
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testsacar() throws SQLException {
		assertNotNull("array não está nulo", dao.inserirMovimento(conn.obtemConexao(),sTO));
		assertNotNull("array não está nulo", dao.consultaMovimento(conn.obtemConexao(),sTO));
		assertNotNull("array não está nulo", dao.inserirSaque(conn.obtemConexao(),
												sTO.getTipoMovimento(),
												dao.consultaMovimento(conn.obtemConexao(),sTO)));
	}

}
