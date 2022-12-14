package Clases;

import java.util.List;

public class Cuenta {
	
	String numero, titular;
	List<Movimiento> movimientos;
	double saldo;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double x) {
		saldo+=x;	
	}
	
	public void retirar(double x) throws Exception{
		if(saldo-x>=-500)
			saldo-=x;
		else
			throw new Exception("Fondos insuficientes (saldo: "+ saldo+") en la cuenta: "+numero);
			
	}

}
