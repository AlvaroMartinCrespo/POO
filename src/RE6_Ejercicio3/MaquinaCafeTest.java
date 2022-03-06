package RE6_Ejercicio3;

import java.util.*;

public class MaquinaCafeTest {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		variables
		int accion;
		
//		Instanciamos la clase
		MaquinaCafe mc1=new MaquinaCafe(1, 50, 80, 20);
		
//		Menu
		
		do {
			
			do {
				
				System.out.println("---------------");
				System.out.println("¿Que desea hacer?" + "\n" + "1.-Servir cafe solo (1 euro)" + "\n" + "2.-Servir leche (0.8 euros)" + "\n" + "3.-Servir cafe con leche (1.5 euros)" + 
				"\n" + "4.-Consultar estado máquina. Aparecen los datos de los depósitos y del monedero" + "\n" + "5.-Rellenas los depositos" + "\n" + "6.-Vaciar Monedero" + "\n" +
						"7.-Apagar la maquina y salir");
				accion=entrada.nextInt();
				
				if(accion!=1 && accion!=2 && accion!=3 && accion!=4 && accion!=5 && accion!=6 && accion!=7) {
					System.out.println("Esa opcion no esta, vuelva a introducir lo que desea hacer");
				}
				
			}while(accion!=1 && accion!=2 && accion!=3 && accion!=4 && accion!=5 && accion!=6 && accion!=7);
			
			switch(accion) {
			
			case 1:
				
				mc1.pedirCafe();
				break;
				
			case 2:
				
				mc1.pedirLeche();
				break;
				
			case 3:
	
				mc1.pedirCafeConLeche();
				break;
				
			case 4:
				
				System.out.println(mc1);
				break;
				
			case 5:
				
				mc1.recargarDeposito();
				System.out.println("Depositos recargados");
				break;
				
			case 6:
				
				mc1.vaciarMonedero();
				break;
			
			}
			
		}while(accion!=7);
		
		System.out.println("Saliendo....");
		

	}

}
