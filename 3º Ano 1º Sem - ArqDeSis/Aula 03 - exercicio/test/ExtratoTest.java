package test;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import consultarExtrato.Extrato;
import consultarExtrato.ExtratoDAO;
import consultarExtrato.ConexaoBD;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;


@SuppressWarnings("unused")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtratoTest {
	Extrato extrato, copia;
	ConexaoBD conn;
	

	@Before
	public void setUp() throws Exception {
		extrato = new Extrato(3, 1, 12.30, 22, 33, 55, "agosto");
		copia   = new Extrato(3, 1, 12.30, 22, 33, 55, "agosto");
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testCarregarDados() throws SQLException {
		assertNotNull("array não esta nulo", copia.carregarDados(conn.obtemConexao(), 1, "agosto"));
	}
	
}