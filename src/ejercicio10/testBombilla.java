package ejercicio10;

import java.util.*;

public class testBombilla {
	
	static Scanner entrada= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Variables
		int accion;
		
//		Instanciamos la clase
		bombilla b1=new bombilla(true);
		
		do {
			
			do {
				System.out.println("-------------------------------");
				System.out.println("¿Qué desea hacer?" + "\n" + "1.-Apagar todas las bombillas" + "\n" + "2.-Apagar bombilla" + 
						"\n" + "3.-Encender bombilla" + "\n" + "4.-Ver estado de la bombilla" + "\n" + "5.-Salir");
				System.out.println("-------------------------------");
				accion=entrada.nextInt();
			}while(accion!=1 && accion!=2 && accion!=3 && accion!=4 && accion!=5);
				
				switch(accion) {
				
				case 1:
					
					b1.interruptorGeneral();
					
					break;
					
				case 2:
					
					b1.apagarBombilla();
					
					break;
					
				case 3:
					
					b1.encenderBombilla();
					
					break;
					
				case 4:
					
					b1.estadoBombilla();
					
					break;
					
				}
				
			
		}while(accion!=5);
		
		System.out.println("Saliendo...");

	}

}
