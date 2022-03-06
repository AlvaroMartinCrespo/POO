package ejercicio17;
import java.util.*;
public class Cuenta {
	
	static Scanner entrada=new Scanner(System.in);
	
//	Atributos
	
	private int cuenta;
	private int saldo;

	
//	Constructor
	
	public Cuenta(int cuenta, int saldo) {
		this.cuenta = cuenta;
		this.saldo = saldo;
	}
	
//	Metodos
	
	public void consultarSaldo() {
		
		System.out.println("---ESTADO DE SU CUENTA---");
		System.out.println("Saldo: " + saldo +" euros");
		System.out.println("");
		
	}
	
	public void ingresarSaldo() {
		
//		Variables
		int dinero;
		
		System.out.println("¿Cuando dinero quieres ingresar?");
		dinero=entrada.nextInt();
		
		this.saldo+=dinero;
		System.out.println("Ha ingresado: " + dinero);
		System.out.println("Saldo nuevo: " + saldo + " euros");
		
		
		
	}
	
	public void retirarSaldo() {
		
//		Variables
		int dinero;
		
		System.out.println("¿Cuando dinero quieres retirar?");
		dinero=entrada.nextInt();
		
		saldo-=dinero;
		System.out.println("Ha retirado: " + dinero);
		System.out.println("Saldo nuevo: " + saldo + " euros");
		
	}


}
