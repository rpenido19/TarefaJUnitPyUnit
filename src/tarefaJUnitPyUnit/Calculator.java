package tarefaJUnitPyUnit;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(add(2, 2));
		System.out.println(sub(2, 2));
		System.out.println(mul(2, 2));
		System.out.println(div(2, 2));
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		return a / b;
	}
}
