package tarefaJUnitPyUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TriangleTest {

	@Test
	public void testTrianguloEquilatero() {
		assertTrue(Triangle.isTrianguloValido(3, 3, 3));
		assertEquals("É um triângulo equilátero.", Triangle.classificacaoTriangulo(3, 3, 3));
	}

	@Test
	public void testTrianguloIsosceles() {
		assertTrue(Triangle.isTrianguloValido(3, 3, 4));
		assertEquals("É um triângulo isósceles.", Triangle.classificacaoTriangulo(3, 3, 4));
	}

	@Test
	public void testTrianguloEscaleno() {
		assertTrue(Triangle.isTrianguloValido(3, 4, 5));
		assertEquals("É um triângulo escaleno.", Triangle.classificacaoTriangulo(3, 4, 5));
	}

	@Test
	public void testTrianguloInvalido() {
		assertFalse(Triangle.isTrianguloValido(1, 2, 5));
		assertEquals("Os valores informados não formam um triângulo válido.", Triangle.classificacaoTriangulo(1, 2, 5));
	}
}
