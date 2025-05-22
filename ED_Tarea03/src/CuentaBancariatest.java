import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CuentaBancariatest {

	private CuentaBancaria cuenta;

    @Before
    public void setUp() {
        cuenta = new CuentaBancaria(6000.0);
    }

    @Test
    public void testObtenerSaldo() {
        assertEquals(6000.0, cuenta.obtenerSaldo(), 0.01);
    }

    @Test
    public void testIngresarDinero() {
        cuenta.ingresar(1000.0);
        assertEquals(7000.0, cuenta.obtenerSaldo(), 0.01);
    }

    @Test
    public void testRetirarDinero() {
        cuenta.retirar(1000.0);
        assertEquals(5000.0, cuenta.obtenerSaldo(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRetiroExcesivo() {
        cuenta.retirar(7000.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIngresoNegativo() {
        cuenta.ingresar(-1000.0);
    }
}
