package objeto2;

import java.util.*;

public class TestCuentaCorriente {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Variables
		int accion;
		CuentaCorriente cuenta1=new CuentaCorriente("Alvaro", "111111111B");
		CuentaCorriente cuenta2=new CuentaCorriente(1000,0);
		CuentaCorriente cuenta3=new CuentaCorriente(10,0, "111111111B");
		
//		Creamos la cuenta
//		cuenta1.CrearCuenta();
		
		System.out.println("Buenas, " + cuenta1.Nombre + " con Dni: " + cuenta1.DniTitular);
		do {
			
//			Comprobamos que se introduce un valor válido
			do {
				
				System.out.println("------------------------");
				System.out.println("¿Que acción desea realizar?: " + 
				"\n" + "1. Sacar dinero" + "\n" + "2. Ingresar dinero" + "\n" + "3. Mostrar Informacion" + 
						"\n" + "4. Salir");
				System.out.println("------------------------");
				accion=entrada.nextInt();
				
			}while(accion!=1 && accion!=2 && accion!=3 && accion!=4);
			
			
			switch(accion) {
			
			case 1:
				cuenta1.SacarDinero();
				break;
			
			case 2:
				cuenta1.IngresarDinero();
				break;
				
			case 3:
				cuenta1.MostrarInformacion();
				break;
				
			}
			
		}while(accion!=4);

		if(accion==4) {
			System.out.println("Saliendo...");
		}
		

	}

}
