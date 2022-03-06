package RE6_Ejercicio1;

import java.util.*;

public class testRectangulo {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Variables
		int ancho;
		int longitud;
		rectangulo r1;
		
		
		try {
		System.out.println("Introduce el ancho del rectangulo");
		ancho=entrada.nextInt();
		 
		System.out.println("Introduce la longitud del rectangulo");
		longitud=entrada.nextInt();
		
		r1=new rectangulo(ancho, longitud);
		
		System.out.println("Perimetro");
		r1.perimetro();
		System.out.println("Area");
		r1.area();
		
		}catch(MedidaException e) {
			System.out.println(e.getMessage());
		}
		
		
		

		

	}

}
