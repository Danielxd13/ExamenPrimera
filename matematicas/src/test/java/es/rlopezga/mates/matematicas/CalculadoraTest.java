package es.rlopezga.mates.matematicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora calculadora;
	private Calculadora calculadora1;
	private Calculadora calculadora2;
	private Calculadora calculadora3;
	
	@BeforeEach
	void setUp() throws Exception {
		 calculadora1=new Calculadora();
		 calculadora2=new Calculadora();
		 calculadora3=new Calculadora();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculadora1=null;
		calculadora2=null;
		calculadora3=null;
	}

//	@Test
//	void testSolucion1Correcta() {
//		Assertions.assertEquals(calculadora1.solucion1(1, -5, 6), 3);
//		Assertions.assertEquals(calculadora2.solucion1(2, -7, 3), 3);
//		Assertions.assertEquals(calculadora3.solucion1(-1, -7, -10), -5);
//	}
//	@Test
//	void testSolucion2Correcta() {
//		Assertions.assertNotEquals(calculadora1.solucion2(1, -5, 6), 2);
//		Assertions.assertNotEquals(calculadora2.solucion2(2, -7, 3), 1/2);
//		Assertions.assertNotEquals(calculadora3.solucion2(-1, -7, -10), -2);
//	}
	
	@Test
	void testSolucion1Incorrecta() {
		Assertions.assertThrows(ArithmeticException.class, ()->calculadora1.solucion1(1, 1, 1));
	}

}
