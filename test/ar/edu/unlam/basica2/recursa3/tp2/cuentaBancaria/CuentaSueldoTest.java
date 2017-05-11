package ar.edu.unlam.basica2.recursa3.tp2.cuentaBancaria;



import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	public void testQueSePuedaCrearUnaCuentaConDeterminadoSaldo() {
		CuentaSueldo miCS = new CuentaSueldo(300.00);
		
		Double esperado = 300.00;
		Double obtenido = miCS.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void queSePuedaDepositarDinero () {
		
		CuentaSueldo miCS = new CuentaSueldo(300.00);
		
		miCS.depositarDinero(500.00);
		
		Double esperado = 800.00;
		Double obtenido = miCS.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void queSePuedaExtraerDineroDentroDeLoDisponibleEnMiCuenta (){
		
		CuentaSueldo miCS = new CuentaSueldo(300.00);
		
		miCS.extraerDinero(200.00);
		
		Double esperado = 100.00;
		Double obtenido = miCS.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void queNoSePuedaExtraerDinero (){
		
		CuentaSueldo miCS = new CuentaSueldo(300.00);
		
		miCS.extraerDinero(500.00);
		
		String esperado = "Error: Saldo insuficiente";
		String obtenido = miCS.getSaldoErroneo();
		
		Assert.assertEquals(esperado, obtenido);
	}

}
