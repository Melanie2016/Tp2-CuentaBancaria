package ar.edu.unlam.basica2.recursa3.tp2.cuentaBancaria;

public class CuentaSueldo extends CuentaBancaria {

	private String saldoErroneo;
	
	public CuentaSueldo(Double saldo) {
		super(saldo);
		
	}
	

	@Override
	public void extraerDinero(Double monto){
		
		if(this.saldo >=  monto){
			this.saldo = this.saldo - monto;
		}else{
			this.saldoErroneo = "Error: Saldo insuficiente";
		}
	}


	public String getSaldoErroneo() {
		return saldoErroneo;
	}


	public void setSaldoErroneo(String saldoErroneo) {
		this.saldoErroneo = saldoErroneo;
	}
	
	

}
