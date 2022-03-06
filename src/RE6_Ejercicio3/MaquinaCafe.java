package RE6_Ejercicio3;

import java.util.*;

public class MaquinaCafe {
	
	static Scanner entrada=new Scanner(System.in);
	
//	Atributos 
	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double depositoEuros;
	
	
	
//	Constructor 
	
	public MaquinaCafe(int depositoCafe, int depositoLeche, int depositoVasos, double depositoEuros) {
		this.depositoCafe = depositoCafe;
		this.depositoLeche = depositoLeche;
		this.depositoVasos = depositoVasos;
		this.depositoEuros = depositoEuros;
	}
	
	
	
//	Metodos
	
	
	public boolean pedirCafe() {
		
//		Variables
		boolean quedan;
			
//		Validamos si se puede poner el cafe o no
		if(this.depositoCafe!=0 && validarDineroYVueltaCafe()) {
			quedan=true;
			System.out.println("Marchando un cafe");
			this.depositoCafe-=1;
			contadorVasos();
		}else {
			
			System.out.println("Ya no queda mas cafe, no se ha introducido el dinero suficiente o no hay dinero para la vuelta");
			
			quedan=false;
			
		}
		
		return quedan;
		
	}
	
	public boolean pedirLeche() {
		
//		Variables
		boolean quedan;
		
//		Validamos si se puede poner la leche o no
		
		if(this.depositoLeche!=0 && validarDineroYVueltaLeche()) {
			quedan=true;
			System.out.println("Marchando la leche");
			this.depositoLeche-=1;
			contadorVasos();
		}else {
			
			System.out.println("Ya no queda mas leche, no se ha introducido el dinero suficiente o no hay dinero para la vuelta");
			quedan=false;
		}
		
		return quedan;
	}
	
	public void pedirCafeConLeche() {
		
//		Variables
		boolean validarCafe=true;
		boolean validarLeche=true;
		boolean validarVasos=true;
		
//		Validamos los boolean
		
		if(this.depositoCafe==0) {
			validarCafe=false;
		}
		
		if(this.depositoLeche==0) {
			validarLeche=false;
		}
		
		if(this.depositoVasos==0) {
			validarVasos=false;
		}
		
//		Comprobamos con el if si se puede servir el cafe con leche
		
		if(!validarCafe || !validarLeche || !validarVasos) {
			
			System.out.println("No quedan productos");
			
		}else {
			
			if(validarDineroYVueltaCafeConLeche()) {
				
				System.out.println("Marchando el cafe con leche");
				this.depositoCafe-=1;
				this.depositoLeche-=1;
				contadorVasos();
				
			}
			

			
		}
		
	}
	
	public boolean contadorVasos() {
		
//		Variables
//		int contador=0;
		boolean quedan;
		
//		
		if(this.depositoVasos!=0) {
//			contador++;
			quedan=true;
			this.depositoVasos-=1;
		}else {
			System.out.println("Ya no quedan mas vasos");
			quedan=false;
		}
		
		return quedan;
		
		
		
	}
	
	public void recargarDeposito() {
		
		this.depositoCafe=50;
		this.depositoLeche=50;
		this.depositoVasos=80;
		
		
	}
	
	public void vaciarMonedero() {
		
		this.depositoEuros=0;
		
		System.out.println("Recoga el dinero");
		
		
	}
	
	public boolean validarDineroYVueltaCafe() {
		
//		Variables
		double dineroAIntroducir;
		boolean dinero;
		double cuenta;
		boolean devolver;
		boolean validar;
		
//		Pedimos el dinero que vaya a introcudir al persona
		
		System.out.println("¿Cuando dinero va a introducir?");
		dineroAIntroducir=entrada.nextDouble();
		
//		Con este if validamos que el dinero introducido sea mayor o igual al precio del producto, y que haya el suficiente dinero para
//		la vuelta, en caso contrario no se proporcionará el producto
		if(dineroAIntroducir<1) {
			dinero=false;
			devolver=false;
		}else if(dineroAIntroducir>1) {
			
			cuenta=dineroAIntroducir-1;
			dinero=true;
			
			if(this.depositoEuros>cuenta) {
				
				System.out.println("-Hay suficiente dinero para devolver la vuelta-");
				System.out.println("[+] Recoge tu cambio de " + cuenta + " euros");
				devolver=true;
				this.depositoEuros-=cuenta;
				
			}else {
				
				System.out.println("-No hay suficiente dinero para devolverle la vuelta-");
				devolver=false;
				
			}
			
		}else {
			System.out.println("-Dinero correcto. No se le devolvera cambio-");
			dinero=true;
			devolver=true;
		}
		
//		Validamos
		if(devolver && dinero) {
			validar=true;
		}else {
			validar=false;
		}
		
		return validar;
		
	}

	public boolean validarDineroYVueltaLeche() {
		
//		Variables
		double dineroAIntroducir;
		boolean dinero;
		double cuenta;
		boolean devolver;
		boolean validar;
		
//		Pedimos el dinero que vaya a introcudir al persona
		
		System.out.println("¿Cuando dinero va a introducir?");
		dineroAIntroducir=entrada.nextDouble();
		
//		Con este if validamos que el dinero introducido sea mayor o igual al precio del producto, y que haya el suficiente dinero para
//		la vuelta, en caso contrario no se proporcionará el producto
		if(dineroAIntroducir<(0.8)) {
			dinero=false;
			devolver=false;
		}else if(dineroAIntroducir>(0.8)) {
			
			cuenta=dineroAIntroducir-(0.8);
			dinero=true;
			
			if(this.depositoEuros>cuenta) {
				
				System.out.println("-Hay suficiente dinero para devolver la vuelta-");
				System.out.println("[+] Recoge tu cambio de " + cuenta + " euros");
				devolver=true;
				this.depositoEuros-=cuenta;
				
			}else {
				
				System.out.println("-No hay suficiente dinero para devolverle la vuelta-");
				devolver=false;
				
			}
			
		}else {
			System.out.println("-Dinero correcto. No se le devolvera cambio-");
			dinero=true;
			devolver=true;
		}
		
//		Validamos
		if(devolver && dinero) {
			validar=true;
		}else {
			validar=false;
		}
		
		return validar;
		
	}

	public boolean validarDineroYVueltaCafeConLeche() {
		
//		Variables
		double dineroAIntroducir;
		boolean dinero;
		double cuenta;
		boolean devolver;
		boolean validar;
		
//		Pedimos el dinero que vaya a introcudir al persona
		
		System.out.println("¿Cuando dinero va a introducir?");
		dineroAIntroducir=entrada.nextDouble();
		
//		Con este if validamos que el dinero introducido sea mayor o igual al precio del producto, y que haya el suficiente dinero para
//		la vuelta, en caso contrario no se proporcionará el producto
		if(dineroAIntroducir<(1.5)) {
			dinero=false;
			devolver=false;
		}else if(dineroAIntroducir>(1.5)) {
			
			cuenta=dineroAIntroducir-(1.5);
			dinero=true;
			
			if(this.depositoEuros>cuenta) {
				
				System.out.println("-Hay suficiente dinero para devolver la vuelta-");
				System.out.println("[+] Recoge tu cambio de " + cuenta + " euros");
				devolver=true;
				this.depositoEuros-=cuenta;
				
			}else {
				
				System.out.println("-No hay suficiente dinero para devolverle la vuelta-");
				devolver=false;
				
			}
			
		}else {
			System.out.println("-Dinero correcto. No se le devolvera cambio-");
			dinero=true;
			devolver=true;
		}
		
//		Validamos
		if(devolver && dinero) {
			validar=true;
		}else {
			validar=false;
		}
		
		return validar;
		
	}
	
	
//	ToString
	
	@Override
	public String toString() {
		return "MaquinaCafe " + "\n" + "depositoCafe=" + depositoCafe + ", depositoLeche=" + depositoLeche + ", depositoVasos="
				+ depositoVasos + ", depositoEuros=" + depositoEuros ;
	}

}
