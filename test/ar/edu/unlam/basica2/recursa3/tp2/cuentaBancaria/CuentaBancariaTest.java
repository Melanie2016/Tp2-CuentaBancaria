package ar.edu.unlam.basica2.recursa3.tp2.cuentaBancaria;


import org.junit.Assert;
import org.junit.Test;

public class CuentaBancariaTest {

	@Test
	public void testQueSeCreeUnaCuentaBancaria(){
		
		CuentaBancaria miCuenta = new CuentaBancaria(2000.00);
		
		Double esperado = 2000.00;
		Assert.assertEquals(esperado,miCuenta.getSaldo());
		
	}
	
	@Test
	public void testQueSePuedaDepositarDinero(){
		
		CuentaBancaria miCuenta = new CuentaBancaria(200.00);
		
		miCuenta.depositarDinero(100.00);
		
		Double esperado = 300.00;
		Double obtenido = miCuenta.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testQueSePuedaExtraerDinero(){
		
		CuentaBancaria miCuenta = new CuentaBancaria(200.00);
		
		miCuenta.extraerDinero(150.00);
		
		Double esperado = 50.00;
		Double obtenido = miCuenta.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);

	}

}
