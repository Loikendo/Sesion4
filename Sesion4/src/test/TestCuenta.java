package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clases.Cuenta;

class TestCuenta extends Exception{
	
	Cuenta c12345 = new Cuenta();
	Cuenta c64789 = new Cuenta();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c12345.setNumero("12345");
		c12345.setSaldo(50);
		c64789.setNumero("6789");
		c64789.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

/*	@Test
	public void testIngreso() {
		
		c.ingresar(100);
		assertEquals(100, c.getSaldo());
	}
	
	@Test
	public void testRetirada() {
		c.retirar(100);
		assertEquals(-100, c.getSaldo());
	}*/
	
	@Test
	public void Test0014() {
		
		try {
			c12345.retirar(200);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			c64789.retirar(350);
		}catch (Exception e) {
			
		}
		c12345.ingresar(100);
		
		try {
			c64789.retirar(200);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			c64789.retirar(150);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			c12345.retirar(200);
			assertEquals(-250, c12345.getSaldo());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		c64789.ingresar(50);
		assertEquals(-450, c64789.getSaldo());
		
		try {
			c64789.retirar(100);
			assertEquals(-550, c64789.getSaldo());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		assertEquals(-250, c12345.getSaldo());
		assertEquals(-450, c64789.getSaldo());
	}

}
