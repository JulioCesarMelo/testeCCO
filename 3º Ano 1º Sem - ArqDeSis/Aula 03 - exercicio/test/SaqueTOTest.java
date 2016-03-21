package test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import saque.SaqueTO;

import static org.junit.Assert.*;


@SuppressWarnings("unused")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaqueTOTest {
	private SaqueTO to;
	

	@Before
	public void setUp() throws Exception {
		to = new SaqueTO(3, 1.0, 12, 22, 3,"2000-03-03");
	}
	
	@Test
	public void testCarregarDados() {
		assertNotNull("array não esta nulo", to);
	}
	
}