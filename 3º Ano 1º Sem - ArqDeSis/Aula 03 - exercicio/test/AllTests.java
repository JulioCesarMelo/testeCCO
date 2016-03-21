package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ExtratoDAOTest.class, ExtratoTest.class, ExtratoTOTeste.class,
	ConnectionFactoryTest.class,SaqueTest.class,SaqueDAOTest.class,SaqueTOTest.class })
public class AllTests {

}
