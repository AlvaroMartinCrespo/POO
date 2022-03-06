package ejercicio17;

import java.util.*;

public class Test {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Variables
		String Nombre;
		String Apellido;
		String dni;
		int ncuentas;
		int numeroCuenta;
		int saldoInicial;
		int elegirCuenta;
		boolean salir;
		int nSalir;
		
		
		
//		Datos cliente y cuentas

		Nombre=nombre();
		Apellido=apellido();
		dni=dni();
		ncuentas=nCuentas();
		
//		Inicializamos la array de cuenta
		
		Cuenta[] cuentas=new Cuenta[ncuentas];
		

//		Creamos las cuentas
		
		for(int i=0;i<ncuentas;i++) {
			
			System.out.println("¿Cual es el numero de la cuenta " + (i+1) + " ?");
			numeroCuenta=entrada.nextInt();
			System.out.println("¿Cual es el saldo inicial de la cuenta " + (i+1) + "?");
			saldoInicial=entrada.nextInt();
			
			cuentas[i]=new Cuenta(numeroCuenta, saldoInicial);
			
		}
		
		
//		Instanciamos la clase cliente
		
		Cliente c1=new Cliente(Nombre, Apellido, dni, cuentas);
		
		
		
		
//		Menu
		
		do {
			
			
			System.out.println("En que cuenta quiere operar:");
			elegirCuenta=entrada.nextInt();
			
			menu(c1, elegirCuenta, cuentas);
			
			
			System.out.println("¿Quiere salir del banco? (1.- Si / 2.- No)");
			nSalir=entrada.nextInt();
			if(nSalir==1) {
				salir=false;
			}else {
				salir=true;
			}
			
			
		}while(salir==true);
		
		System.out.println("Saliendo...");
		
		
	}
	
//	Menu
	
	static void menu(Cliente c, int elegirCuenta, Cuenta[] cuentas) {
		
//		Variables
		int accion;
		
		do {
			
			System.out.println("Introduce que es lo que quieres hacer: " + "\n" + "1.-Consultar Dinero" + "\n" + "2.-Ingresar Dinero" + "\n" + "3.-Retirar Dinero" +"\n" + "4.-Salir de la cuenta");
			accion=entrada.nextInt();
			
			
			switch(accion) {
			
			case 1:
				
				c.consultarCuenta(cuentas, elegirCuenta);
				break;
				
			case 2:
				
				c.ingresarDinero(cuentas, elegirCuenta);
				break;
				
			case 3:
				
				c.retirarDinero(cuentas, elegirCuenta);
				break;
				
			};
			
			
		}while(accion==1 || accion==2 || accion==3);
		
	}
	
//	Datos
	
	static String nombre() {
		
//		Variables
		String nombre;
		
		System.out.println("¿Quien eres?");
		nombre=entrada.nextLine();
		
		return nombre;
		
	}
	
	static String apellido() {
		
//		Variables
		String apellido;
		
		System.out.println("¿Cual es tu apellido");
		apellido=entrada.nextLine();
		
		return apellido;
	}
	
	static String dni() {
		
//		Variables
		String dni;
		
		System.out.println("¿Cual es tu dni?");
		dni=entrada.nextLine();
		
		return dni;
	}
	
	static int nCuentas() {
		
//		Variables
		int nCuentas;
		
		System.out.println("¿Cuantas cuentas tienes?");
		nCuentas=entrada.nextInt();
	
		return nCuentas;
		
	}

}
