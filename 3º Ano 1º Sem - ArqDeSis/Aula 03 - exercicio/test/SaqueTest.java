package test;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import consultarExtrato.ConexaoBD;
import saque.Saque;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;


@SuppressWarnings("unused")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaqueTest {
	Saque info;
	ConexaoBD conn;
	

	@Before
	public void setUp() throws Exception {
		info = new Saque(1,300.00);
	}
	
	@Test
	public void testCarregarDados() throws SQLException {
		assertNotNull("array não esta nulo", info);
	}
	
}