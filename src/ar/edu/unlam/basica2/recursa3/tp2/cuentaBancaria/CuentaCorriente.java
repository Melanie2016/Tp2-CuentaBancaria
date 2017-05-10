package ar.edu.unlam.basica2.recursa3.tp2.cuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {

	private Double saldoLimite;
	private String resultadoErroneo;
	
	
	
	public CuentaCorriente(Double saldo, Double saldoLimite) {
		super(saldo);
		this.saldoLimite = saldoLimite;
		
	}
	
	
	@Override
	public void extraerDinero(Double monto){
		
		if(this.saldo >= monto){
			this.saldo = this.saldo - monto;
		}else{
			if((this.saldo + this.saldoLimite) >= monto){
				this.saldoLimite = (this.saldoLimite + this.saldo) - monto;
				this.saldo = 00.00;
			}else{
				this.resultadoErroneo = "Saldo insuficiente";
			}
		}
	}

	
	
	
/////////////////////////// get y set /////////////////////////////

	public Double getSaldoLimite() {
		return saldoLimite;
	}

	public void setSaldoLimite(Double saldoLimite) {
		this.saldoLimite = saldoLimite;
	}


	
	
	public String getResultadoErroneo() {
		return resultadoErroneo;
	}

	public void setResultadoErroneo(String resultadoErroneo) {
		this.resultadoErroneo = resultadoErroneo;
	}


}
