package ar.edu.unlam.basica2.recursa3.tp2.cuentaBancaria;

import org.junit.Assert;
import org.junit.Test;


public class CuentaCorrienteTest {

	@Test
	public void testearQueSeCreeUnaCuentaCorriente() {
		
		CuentaCorriente miCC = new CuentaCorriente(100.00, 500.00);
		
		Double esperado = 100.00;
		Double obtenido = miCC.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void queSePuedaDespositarDinero(){
		
		CuentaCorriente miCC = new CuentaCorriente(100.00, 500.00);
		
		miCC.depositarDinero(200.00);
		
		Double esperado = 300.00;
		Double obtenido = miCC.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);

	}
	
	@Test
	public void queSePuedaExtraerDineroDentroDeLaCapacidadDeLaCuenta(){
		 
		CuentaCorriente miCC = new CuentaCorriente(100.00, 500.00);
		
		miCC.extraerDinero(100.00);
		
		Double esperado = 00.00;
		Double obtenido = miCC.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);

	}
	


}
