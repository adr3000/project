package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import projeto1.ContaCorrente;

class ContaTest {
	@Test
	void test1() {
		ContaCorrente conta = new ContaCorrente(0101,01010101,"joao",9999.0,100.0, 0);
		
		conta.sacar(10);
		assertEquals(90, conta.getSaldo());
	}
	
	
	
	
	

}
