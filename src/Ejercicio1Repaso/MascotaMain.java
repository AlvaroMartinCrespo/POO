package Ejercicio1Repaso;

import java.util.*;

public class MascotaMain {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		VARIABLES
		int accionMenu, tiempo;
		boolean salir=false;

//		CREACIÓN DE MASCOTAS

		try {

			System.out.println(".:PRIMERA MASCOTA:.");
			Mascota p1 = crearMascota();
			System.out.println(".:SEGUNDA MASCOTA:.");
			Mascota p2 = crearMascota();

//			MENU
			do {

				mostrarMenu();
				accionMenu = accionMenu();
				tratarMenu(accionMenu, p1, p2);

//				COMPROBAMOS EL TIEMPO

				tiempo = comprobarTiempoMaximo(p1) + comprobarTiempoMaximo(p2);
				
//				System.out.println(tiempo);
				
				if(accionMenu==6 || tiempo>=100) {
					
					salir=true;
					
				}

			} while (!salir);

			if (tiempo > 100) {

				System.out.println("Las mascotas tienen sueño... Se van a dormir ZZZZ");

			}

			System.out.println("Saliendo...");

		} catch (MascotaException e) {

			System.out.println(e.getMessage());

		}

	}

	public static Mascota crearMascota() throws MascotaException {

//		VARIABLES
		String nombre, mascota;
		int tipoMascota;

//		INTRODUCIMOS LOS VALORES NECESARIOS

		System.out.println("¿Que nombre desea ponerle a la mascota?");
		nombre = entrada.next();

		System.out.println("Introduce que tipo de mascota quieres: (1 - PERRO, 2 - GATO)");
		tipoMascota = entrada.nextInt();

		if (tipoMascota != 1 && tipoMascota != 2) {

			throw new MascotaException("No existe esa opción");

		}

		if (tipoMascota == 1) {

			mascota = "PERRO";

		} else {

			mascota = "GATO";

		}

//		CREAMOS LA MASCOTA

		Mascota nuevaMascota = new Mascota(nombre, mascota);

		return nuevaMascota;

	}

	public static void mostrarMenu() {

		System.out.println(" ");
		System.out.println(".:MENU:.");
		System.out.println(
				"1.- Dar comida a la mascota \n2.- Comprar comida \n3.- Jugar \n4.- Cambiar nombre a la mascota \n5.- Información de mascotas \n6.- Salir");

	}

	public static int accionMenu() {

//		VARIABLES
		int accion;

		System.out.println("¿Que desea hacer?");
		accion = entrada.nextInt();

		return accion;

	}

	public static void tratarMenu(int accion, Mascota p1, Mascota p2) throws MascotaException {

//		VARIABLES
		int numMascota;
		String nuevoNombre;

		switch (accion) {

		case 1:

			System.out.println("A que mascota quieres darle de comer (1-2)");
			numMascota = entrada.nextInt();

			if (numMascota != 1 && numMascota != 2) {

				throw new MascotaException("Esa opcion existe");

			}

			if (numMascota == 1) {
				p1.darComerMascota();
			} else {
				p2.darComerMascota();
			}

			break;

		case 2:

			System.out.println("A que mascota le quieres comprar comida (1-2)");
			numMascota = entrada.nextInt();

			if (numMascota != 1 && numMascota != 2) {

				throw new MascotaException("Esa opcion existe");

			}

			if (numMascota == 1) {
				p1.comprarComida();
			} else {
				p2.comprarComida();

			}

			break;

		case 3:

			System.out.println("Con que mascota quieres jugar (1-2)");
			numMascota = entrada.nextInt();

			if (numMascota != 1 && numMascota != 2) {

				throw new MascotaException("Esa opcion existe");

			}

			if (numMascota == 1) {
				p1.jugar();
			} else {
				p2.jugar();

			}

			break;

		case 4:

			System.out.println("A que mascota quieres cambiarle el nombre (1-2)");
			numMascota = entrada.nextInt();

			if (numMascota != 1 && numMascota != 2) {

				throw new MascotaException("Esa opcion existe");

			}

			System.out.println("Introduce el nuevo nombre que le quieras poner");
			nuevoNombre = entrada.next();

			if (numMascota == 1) {
				p1.setNombre(nuevoNombre);
			} else {
				p2.setNombre(nuevoNombre);

			}

			break;

		case 5:

			System.out.println(p1.toString());
			System.out.println(p2.toString());

			break;

		case 6:
			System.out.println("Espero que haya disfrutado");

		}

	}

	public static int comprobarTiempoMaximo(Mascota mascota) {

		return mascota.getTiempo();

	}

}
