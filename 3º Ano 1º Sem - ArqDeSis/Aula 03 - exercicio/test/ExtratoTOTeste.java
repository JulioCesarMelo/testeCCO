package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;


import consultarExtrato.ConexaoBD;
import consultarExtrato.ConsultaExtratoTO;
import consultarExtrato.Extrato;
//fazer classo TO

public class ExtratoTOTeste {
	ConsultaExtratoTO to;
	Extrato copia;
	ConexaoBD conn;
	
	@SuppressWarnings("static-access")
	@Test
	public void testTable() throws SQLException{
		copia   = new Extrato(3, 1, 12.30, 22, 33, 55, "agosto");
		
	  to = new ConsultaExtratoTO(copia.carregarDados(conn.obtemConexao(), 1, "agosto"));
		assertNotNull("Tabela não está nula", to);
		
		assertNotNull("Tabela não está nula", to.getTable());
	}
	

}
