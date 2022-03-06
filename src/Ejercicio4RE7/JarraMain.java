package Ejercicio4RE7;

import java.util.*;

public class JarraMain {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		VARIABLES

		int accionMenu;
		boolean bandera = true;



//		MENU

		do {

			try {

				do {
					
//					CREAMOS LA JARRAS
					System.out.println(".:JARRA A:.");
					Jarra A = creacionJarras();
					System.out.println(".:JARRA B:.");
					Jarra B = creacionJarras();

					mostrarMenu();
					accionMenu = accionMenu();
					tratarMenu(accionMenu, A, B);

				} while (accionMenu != 6);

				bandera = true;

			} catch (JarraException e) {

				System.out.println(e.getMessage());
				bandera = false;

			}

		} while (!bandera);

	}

	public static Jarra creacionJarras() throws JarraException {

//		VARIABLES
		int capacidadJarra;

		System.out.println("Introduce la capacidad de la jarra:");
		capacidadJarra = entrada.nextInt();

		Jarra nuevaJarra = new Jarra(capacidadJarra);

		return nuevaJarra;

	}

	public static void mostrarMenu() {

		System.out.println(" ");
		System.out.println(".:MENU;.");
		System.out.println(
				"1.- Llenar jarra \n2.- Vaciar jarra \n3.- Volcar jarra A en B \n4.- Volvar jarra B en A \n5.- Ver estado de las jarras \n6.- Salir");

	}

	public static int accionMenu() {

//		VARIABLES
		int accion;

		System.out.println("¿Que desea hacer?");
		accion = entrada.nextInt();

		return accion;

	}

	public static void tratarMenu(int accionMenu, Jarra A, Jarra B) throws JarraException {

//		VARIABLES
		char jarra;
		int totalAgua = 0;

		switch (accionMenu) {

		case 1:

			System.out.println("¿Que jarra desea llenar: A o B");
			jarra = entrada.next().charAt(0);

			if (jarra != 'A' && jarra != 'B') {

				throw new JarraException("No existe esa opción");

			}

			if (jarra == 'A') {

				A.llenarJarra();
				totalAgua += sumarAgua(A);

			} else {

				B.llenarJarra();
				totalAgua += sumarAgua(B);

			}

			break;

		case 2:

			System.out.println("¿Que jarra desea vaciar: A o B");
			jarra = entrada.next().charAt(0);

			if (jarra != 'A' && jarra != 'B') {

				throw new JarraException("No existe esa opción");

			}

			if (jarra == 'A') {

				A.vaciarJarra();

			} else {

				B.vaciarJarra();

			}

			break;

		case 3:

			Jarra.volcarJarraAenB(A, B);

			break;

		case 4:

			Jarra.volcarJarraBenA(A, B);

			break;

		case 5:

			Jarra.verEstadoJarras(A, B);
			break;

		case 6:

			System.out.println("El total de agua que se ha gastado llenando jarras es " + totalAgua + " litros");
			break;

		}

	}

	public static int sumarAgua(Jarra jarra) {

		return jarra.getTotalAgua();

	}

}
