package ejercicio17Correcion;

public class Cuenta {
	
	private int numCuenta;
	private double saldo;
	
	
//	Constructor
	
	public Cuenta(int numCuenta, double saldo) {

		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	
//	Métodos
	
	public void ingresarDinero(double cantidad) {
		
		this.saldo+=cantidad;
		
	}
	
	public void retirarDinero(double cantidad) {
		
//		Comprobamos si hay saldo o no
		
		if(cantidad<saldo) {
			this.saldo-=cantidad;
			System.out.println("Retirada realizada correctamente");
		}else {
			System.out.println("Saldo insuficiente");
		}
			
	}
	



	
//	Getters y Setters
	
	public int getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	

}
