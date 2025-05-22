/**
 * Clase CalculadoraFactorial
 * Calcula el factorial de un número determinado
 */

public class CalculadoraFactorial {
	 
	/**
	 * Método para calcular el factorial de n siempre que sea positivo
	 * @param n Número sobre el que calcular el factorial
	 * @return Resultado del cálculo
	 */
	public long calcularFactorial(long n) {
		if (n < 0) {
			throw new IllegalArgumentException("El factorial no está definido para números negativos");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		long resultado = 1;
		for (long	 i = n; i >= 1; i--) {
			resultado *= i;
		}
		return resultado;
	}
	
	/**
	 * Main con el método para mostrar el resultado de calcularFactorial()
	 * @param args Argumentos de la línea de comandos
	 */
	public static void main(String[] args) {
		CalculadoraFactorial calculadora = new CalculadoraFactorial();
		long resultado = calculadora.calcularFactorial(15);
		System.out.println("El factorial de 15 es: " + resultado);
	}
}