package ejercicio9;

import java.util.*;

public class testRadio {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		
//		Variables
//		radio radio1=new radio(80);
		radio radio1=new radio();
		int accion;
		
		
		
//		Programa
		do {
			
			System.out.println("¿Que desea hacer?" + "\n" + "1.-Subir frecuencia" + "\n" + "2.-Bajar frecuencia" + "\n" + "3.-Display" + "\n" + "Otro numero.-Salir");
			accion=entrada.nextInt();
			
			switch(accion) {
			
			case 1:
				
				radio1.subir();
				break;
				
			case 2:
				
				radio1.down();
				break;
				
			case 3:
	
				radio1.display();
				break;
	
			
			}
			
		}while(accion==1 || accion==2 || accion==3);
		
//		Saliendo
		System.out.println("Saliendo...");

	}

}
