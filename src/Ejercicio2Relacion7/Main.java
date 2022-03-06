package Ejercicio2Relacion7;

import java.util.*;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) throws LineaException {

//		Variables
		int accion;
		double movimiento, ejes;
		double ejeXa, ejeXb, ejeYa, ejeYb;

//		Introducimos los ejes por teclado e instanciamos los puntos

		System.out.println("---Punto A---");
		Punto puntoA = crearPuntos();

		System.out.println("---Punto B---");
		Punto puntoB = crearPuntos();

//		Instanciamos la clase linea

//		Linea linea1 = CrearLinea();
		
		Linea linea1= new Linea(puntoA, puntoB);

//		Comparamos si son iguales

		do {

			System.out.println("-------------------");
			System.out.println(
					"¿Que desea hacer?" + "\n" + "1. Mover linea" + "\n" + "2. Mostrar linea" + "\n" + "3. Salir");
			accion = entrada.nextInt();

			switch (accion) {

			case 1:

				do {

					System.out.println(" ");
					System.out.println("¿Que movimiento desea hacer?" + "\n" + "1. Mover linea a la derecha" + "\n"
							+ "2. Mover linea la a izquierda" + "\n" + "3. Mover linea a arriba" + "\n"
							+ "4. Mover linea abajo" + "\n" + "5. Salir");
					accion = entrada.nextInt();

					switch (accion) {

					case 1:
						System.out.println("¿Cuanto quieres mover la linea a la derecha?");
						movimiento = entrada.nextDouble();
						linea1.moverDerecha(movimiento);
						break;

					case 2:
						System.out.println("¿Cuanto quieres mover la linea a la izquierda?");
						movimiento = entrada.nextDouble();
						linea1.moverIzquierda(movimiento);
						break;

					case 3:
						System.out.println("¿Cuanto quieres mover la linea arriba?");
						movimiento = entrada.nextDouble();
						linea1.moverArriba(movimiento);
						break;

					case 4:
						System.out.println("¿Cuanto quieres mover la linea abajo?");
						movimiento = entrada.nextDouble();
						linea1.moverAbajo(movimiento);
						break;

					case 5:
						System.out.println("Saliendo...");
						break;

					}

				} while (accion != 5);

				break;

			case 2:

				System.out.println("Punto A:" + puntoA.toString());
				System.out.println("Punto B:" + puntoB.toString());
				break;

			case 3:
				System.out.println("Saliendo...");
				break;

			}

		} while (accion != 3);

	}
	
	public static Linea CrearLinea() throws LineaException {
		
		Linea linea1;
		Punto PuntoA, PuntoB;
		
		PuntoA=crearPuntos();
		PuntoB=crearPuntos();
		
		linea1=new Linea(PuntoA, PuntoB);
		
		return linea1;
		
	}

	public static Punto crearPuntos() {

//		Variables
		double x;
		double y;

		System.out.println("Introduce X: ");
		x = entrada.nextDouble();

		System.out.println("Introduce Y: ");
		y = entrada.nextDouble();

		Punto p = new Punto(x, y);

		return p;

	}

}
