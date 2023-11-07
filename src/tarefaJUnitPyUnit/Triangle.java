package tarefaJUnitPyUnit;

public class Triangle {
	public static void main(String[] args) {
		double a = 3, b = 4, c = 5;

		System.out.println(classificacaoTriangulo(a, b, c));
	}

	public static boolean isTrianguloValido(double a, double b, double c) {
		return a + b > c && a + c > b && b + c > a;
	}

	public static String classificacaoTriangulo(double a, double b, double c) {
		if (isTrianguloValido(a, b, c)) {
			if (a == b && b == c) {
				return "É um triângulo equilátero.";
			} else if (a == b || a == c || b == c) {
				return "É um triângulo isósceles.";
			} else {
				return "É um triângulo escaleno.";
			}
		} else {
			return "Os valores informados não formam um triângulo válido.";
		}

	}
}
