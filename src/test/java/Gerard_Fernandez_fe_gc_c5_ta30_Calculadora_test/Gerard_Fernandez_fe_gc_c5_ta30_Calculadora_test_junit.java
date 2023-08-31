package Gerard_Fernandez_fe_gc_c5_ta30_Calculadora_test;

import static org.junit.jupiter.api.Assertions.*;

import Gerard_Fernandez_fe_gc_c5_ta30_calculadora.Calculadora;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Gerard_Fernandez_fe_gc_c5_ta30_Calculadora_test_junit {
	
	private static Calculadora calculadora;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcular() {
		double resultado = Double.valueOf(calculadora.calcular("5 + 5 - 5"));
		double esperado = 5;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAplicarOperacion() {
		double resultado = Double.valueOf(calculadora.aplicarOperacion(5, 5, "+"));
		double esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	void testPotenciaCubo() {
		double resultado = Double.valueOf(calculadora.potenciaCubo("2"));
		double esperado = 4;
		assertEquals(esperado, resultado);
	}

}
