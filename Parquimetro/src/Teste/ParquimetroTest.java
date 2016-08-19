package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import parquimetro.*;

public class ParquimetroTest {
	private Parquimetro parq;

	@Before
	public void setUp() throws Exception {
		parq = new Parquimetro();
		parq.insereMoeda(100);
	}
	
	
	@Test
	public void testInsereMoeda() throws Exception {
		parq.insereMoeda(1);
		parq.insereMoeda(5);
		parq.insereMoeda(10);
		parq.insereMoeda(25);
		parq.insereMoeda(50);
		parq.insereMoeda(100);
		assertEquals(291, parq.getSaldo());
	}
	
	

	@Test
	public void testGetSaldo() {
		int actual = (int) parq.getSaldo();
		assertEquals(100, actual);
	}

	@Test
	public void testEmiteTicket() throws Exception {
		parq.insereMoeda(50);
		parq.insereMoeda(50);
		parq.insereMoeda(100);
		boolean actual = parq.emiteTicket();
		assertEquals(true, actual);
	}

	@Test
	public void testDevolve() throws Exception {
		parq.insereMoeda(50);
		parq.insereMoeda(50);
		parq.insereMoeda(100);
		parq.emiteTicket();
		int actual = parq.devolve();
		assertEquals(100, actual);
	}
}