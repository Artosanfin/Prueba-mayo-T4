/**
* Clase CuentaBancaria
* Realiza operaciones de efectivo básicas en una cuenta bancaria
*/
  
public class CuentaBancaria {
	 
private double saldo; // Saldo en euros
 
	/**
	 * Constructor que define el saldo inicial
	 * @param saldoInicial Saldo inicial en la cuenta
	 */

	public CuentaBancaria(double saldoInicial) {
		if (saldoInicial < 0) {
			throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
		}
		this.saldo = saldoInicial;
	}

	/**
	 * Método para ingresar dinero
	 * @param cantidad Cantidad en euros a ingresar
	 */
	public void ingresar(double cantidad) {
		if (cantidad <= 0) {
			throw new IllegalArgumentException("La cantidad a ingresar debe ser positiva");
		}
		saldo += cantidad;
	}

	/**
	 * Método para retirar dinero
	 * @param cantidad Cantidad en euros a retirar
	 */
	public void retirar(double cantidad) {
		if (cantidad <= 0) {
			throw new IllegalArgumentException("La cantidad a retirar debe ser positiva");
		}
		if (cantidad > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		saldo-= cantidad;
	}

	/**
	 * Método para obtener el saldo
	 * @return Saldo en euros
	 */
	public double obtenerSaldo() {
		return saldo;
	}
}