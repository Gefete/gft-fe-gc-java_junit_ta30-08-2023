package Gerard_Fernandez_fe_gc_c5_ta30_geometria_test;

import JUnit.Junit09_Geometria.dto.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Gerard_Fernandez_fe_gc_c5_ta30_geometria_test_junit {
	private static Geometria geometria;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		geometria= new Geometria();
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
	void testAreacuadrado() {
		double resultado = Double.valueOf(geometria.areacuadrado(9));
		double esperado = 81;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreaCirculo() {
		double resultado = Double.valueOf(geometria.areaCirculo(2));
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreatriangulo() {
		double resultado = Double.valueOf(geometria.areatriangulo(5, 4));
		double esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	void testArearectangulo() {
		double resultado = Double.valueOf(geometria.arearectangulo(9, 14));
		double esperado = 126.00000;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreapentagono() {
		double resultado = Double.valueOf(geometria.areapentagono(4, 7));
		double esperado = 14.0;
		assertEquals(esperado, resultado);
	}

	@Test
	void testArearombo() {
		double resultado = Double.valueOf(geometria.arearombo(12, 14));
		double esperado = 84.00;
		assertEquals(esperado, resultado);
	}

	@Test
	void testArearomboide() {
		double resultado = Double.valueOf(geometria.arearomboide(20, 10));
		double esperado = 200.00000;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreatrapecio() {
		double resultado = Double.valueOf(geometria.areatrapecio(30, 10, 15));
		double esperado = 300.00000;
		assertEquals(esperado, resultado);
	}

}
