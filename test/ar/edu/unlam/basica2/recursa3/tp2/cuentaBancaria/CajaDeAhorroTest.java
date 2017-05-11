package ar.edu.unlam.basica2.recursa3.tp2.cuentaBancaria;


import org.junit.Assert;
import org.junit.Test;

public class CajaDeAhorroTest {

	@Test
	public void testQueSePuedaCrearUnaCuentaConDeterminadoSaldo() {
		CajaDeAhorro miCA = new CajaDeAhorro(300.00);
		
		Double esperado = 300.00;
		Double obtenido = miCA.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void queSePuedaDepositarDinero () {
		
		CajaDeAhorro miCA = new CajaDeAhorro(300.00);
		
		miCA.depositarDinero(500.00);
		
		Double esperado = 800.00;
		Double obtenido = miCA.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
	}

	
	@Test
	public void queSePuedaExtraerDineroDentroDeLoDisponibleEnMiCuenta (){
		
		CajaDeAhorro miCA = new CajaDeAhorro(300.00);
		
		miCA.extraerDinero(200.00);
		
		Double esperado = 100.00;
		Double obtenido = miCA.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void queAlHacerCincoExtraccionesSeCobreUnAdicional () {
		
		CajaDeAhorro miCA = new CajaDeAhorro(10000.00);
		
		miCA.extraerDinero(200.00);
		miCA.extraerDinero(200.00);
		miCA.extraerDinero(200.00);
		miCA.extraerDinero(200.00);
		miCA.extraerDinero(200.00);
		miCA.contador();
		
		Double esperado = 8994.00;
		Double obtenido = miCA.getSaldo();
		
		Assert.assertEquals(esperado, obtenido);
		
	}

}
