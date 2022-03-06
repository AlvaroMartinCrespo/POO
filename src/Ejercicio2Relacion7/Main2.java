package Ejercicio2Relacion7;

import java.util.*;

public class Main2 {
	
	static Scanner sc=new Scanner(System.in);

		public static void main(String[] args) throws LineaException {
			int opcion;
			Linea linea;
			
			try {
				linea = crearLinea();
					do {
						mostrarMenu();
						opcion = elegirOpcion();
						tratarMenu(opcion, linea);
					} while (opcion!=3);
			}catch (LineaException e) {
				System.out.println(e.getMessage());
			};

		}

		public static Linea crearLinea() throws LineaException {
			Linea linea1;
			Punto puntoA, puntoB;

			puntoA = crearPunto("Primer punto: ");
			puntoB = crearPunto("Segundo punto: ");

			linea1 = new Linea(puntoA, puntoB);
			return linea1;
		}

		public static Punto crearPunto(String mensaje) {
			double coordenadaX, coordenadaY;
			Punto punto;

			System.out.println("Introduzca la coordenada X: ");
			coordenadaX = sc.nextDouble();
			System.out.println("Introduce la coordenada Y: ");
			coordenadaY = sc.nextDouble();

			punto = new Punto(coordenadaX, coordenadaY);

			return punto;
		}

		public static void mostrarMenu() {
			System.out.println(" ");
			System.out.println("--MENÚ--");
			System.out.println("1. Mueve línea.");
			System.out.println("2. Mostrar línea.");
			System.out.println("3. Salir");

		}

		public static int elegirOpcion() {
			int opcion;
			do {
				System.out.println("Introduzca la opcion deseada: ");
				opcion = sc.nextInt();
			} while (opcion < 1 || opcion > 3);
			return opcion;
		}

		public static void tratarMenu(int opcion, Linea linea1) throws LineaException {
			char direccionMovimiento;
			double movimiento;

			switch (opcion) {
			case 1:
				System.out.println("Introduzca el movimiento que desea realizar: A-Arriba," + "\n"
						+ "B-Abajo, D-Derecha o I-Izquierda");
				direccionMovimiento = sc.next().charAt(0);

				System.out.println("Introduzca cuanto desea mover: ");
				movimiento = sc.nextDouble();

				switch (direccionMovimiento) {
				case 'A':
					linea1.moverArriba(movimiento);
					break;
				case 'B':
					linea1.moverAbajo(movimiento);
					break;
				case 'D':
					linea1.moverDerecha(movimiento);
					break;
				case 'I':
					linea1.moverIzquierda(movimiento);
					break;
				default:
					System.out.println("Movimiento no válido");
					break;
				}
			case 2:
				System.out.println(linea1);
				break;
			default:
				System.out.println("Gracias por utilizar nuestras líneas.");
				break;
			}
		}
		
	}
	

