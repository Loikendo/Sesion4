package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clases.Cuenta;

class TestCuenta {
	
	Cuenta c = new Cuenta();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c.setNumero("123");
		c.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testIngreso() {
		
		c.ingresar(100);
		assertEquals(100, c.getSaldo());
	}
	
	@Test
	public void testRetirada() {
		c.retirar(100);
		assertEquals(0, c.getSaldo());
	}

}
