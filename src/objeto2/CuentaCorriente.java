package objeto2;

import java.util.*;



public class CuentaCorriente {
	
//	Atributos
	
	int saldo;
	int LimiteDescubierto;
	String Nombre;
	String DniTitular;

	public CuentaCorriente (String nombre, String DniTitular) {
		
		//Variables por defecto
		saldo=0;
		LimiteDescubierto=-50;
		this.Nombre=nombre;
		this.DniTitular=DniTitular;
		
		
	}
	
	
	public CuentaCorriente(int saldo, int LimiteDescubierto) {

		this.saldo = saldo;
		this.LimiteDescubierto = LimiteDescubierto;
	}


	public CuentaCorriente(int saldo, int limiteDescubierto, String dniTitular) {
		this.saldo = saldo;
		LimiteDescubierto = limiteDescubierto;
		DniTitular = dniTitular;
	}


	public void SacarDinero() {
		
		Scanner entrada=new Scanner(System.in);
		
//		Variables
		int cantidad;
		
		System.out.println("¿Cuanto dinero quieres sacar?");
		cantidad=entrada.nextInt();
		
		if(saldo-cantidad>=LimiteDescubierto) {
			System.out.println("Has sacado " + cantidad + " euros");
			saldo-=cantidad;
		}else {
			System.out.println("No es posible sacar esa cantidad de dinero");
		}
		
	}
	
	public void IngresarDinero() {
		
		Scanner entrada=new Scanner(System.in);
		
//		Variables
		int cantidad;
		
		System.out.println("¿Cuanto dinero quieres ingresar?");
		cantidad=entrada.nextInt();
		
		saldo+=cantidad;
		
		System.out.println("Se ha ingresado " + cantidad + " euros");
		
	}
	
	public void MostrarInformacion() {
		
		System.out.println("Nombre: " + Nombre);
		System.out.println("DNI: " + DniTitular);
		System.out.println("Saldo: " + saldo + " euros");
		System.out.println("Limite de Descubierto " + LimiteDescubierto + " euros");
		
	}
	
}

