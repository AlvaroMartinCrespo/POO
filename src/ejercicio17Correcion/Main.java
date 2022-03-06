package ejercicio17Correcion;

import java.util.*;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Variables
		String nombre, apellido, dni;
		int numeroCuenta, indiceCuenta;
		double saldo, cantidad;
		Cuenta[] arrayCuentas;
		Cliente objetoCliente;

//		Datos

		System.out.println("Introduzca el nombre del cliente");
		nombre = entrada.nextLine();

		System.out.println("Introduzca el apellido del cliente");
		apellido = entrada.nextLine();

		System.out.println("Introduzca el dni del cliente");
		dni = entrada.nextLine();

//		Cuenta

		System.out.println("Introduzca el numero de cuentas que tiene el cliente");
		int nCuentas = entrada.nextInt();

//		Creamos la array de objetos de cuenta

		arrayCuentas = new Cuenta[nCuentas];

//		introducimos lo datos de la cuenta con el for

		for (int i = 0; i < arrayCuentas.length; i++) {

			System.out.println("A continuación solicitaremos los datos para la cuenta " + (i + 1) + ":");
			System.out.println("Introduzca el número de cuenta:");
			numeroCuenta = entrada.nextInt();
			System.out.println("Introduzca el saldo inicial de la cuenta");
			saldo = entrada.nextDouble();

			arrayCuentas[i] = new Cuenta(numeroCuenta, saldo);

		}

//		Instanciamos la clase cliente

		objetoCliente = new Cliente(nombre, apellido, dni, arrayCuentas);

//		Menu

		int opcion;

		do {

			System.out.println("");
			System.out.println("--MENU--");
			System.out.println("1.- Ingresar dinero en la cuenta");
			System.out.println("2.- Retirar dinero de la cuenta");
			System.out.println("3.- Consultar estado de la cuenta");
			System.out.println("4.- Salir");
			System.out.println("Introduzca la opcion deseado");

			opcion = entrada.nextInt();

			if (opcion <= 0 || opcion > 4) {
				System.out.println("Opcion no válida. Por favor vuelva a introducir una opción");
			} else {

				switch (opcion) {

				case 1:

					System.out.println("Introduzca el numero de cuenta");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscarNumeroCuenta(arrayCuentas, numeroCuenta);
					if (indiceCuenta == -1) {
						System.out.println("Error. El número de cuenta no existe");
					} else {

						System.out.println("Introduzca la cantidad de dinero a ingresar");
						cantidad = entrada.nextDouble();

						objetoCliente.ingresarDinero(indiceCuenta, cantidad);

						System.out.println("Dinero ingresado correctamente" + "\n" + "Saldo disponble: "
								+ objetoCliente.consultarSaldo(indiceCuenta));
					}
					break;

				case 2:

					System.out.println("Introduzca el numero de cuenta");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscarNumeroCuenta(arrayCuentas, numeroCuenta);
					if (indiceCuenta == -1) {
						System.out.println("Error. El número de cuenta no existe");
					} else {

						System.out.println("Introduzca la cantidad de dinero a retirar");
						cantidad = entrada.nextDouble();

						objetoCliente.retirarDinero(indiceCuenta, cantidad);

						System.out.println("Saldo disponble: " + objetoCliente.consultarSaldo(indiceCuenta));
					}
					break;

				case 3:

					System.out.println("Introduzca el numero de cuenta");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscarNumeroCuenta(arrayCuentas, numeroCuenta);
					if (indiceCuenta == -1) {
						System.out.println("Error. El número de cuenta no existe");
					} else {

						System.out.println("Saldo disponble: " + objetoCliente.consultarSaldo(indiceCuenta));
					}
					break;
					
				case 4:
					
					System.out.println("Gracias por utilizar nuestros servicios. Hasta pronto");
					break;

				}

			}

		} while (opcion != 4);

	}

	public static int buscarNumeroCuenta(Cuenta arrayC[], int numeroCuenta) {

		int i = 0;
		int indiceCuenta = 0;
		boolean encontrado = false;

		while (i < arrayC.length && !encontrado) {
			if (arrayC[i].getNumCuenta() == numeroCuenta) {
				encontrado = true;
				indiceCuenta = i;
			}
			i++;
		}

		if (!encontrado) {
			indiceCuenta = -1;
		}

		return indiceCuenta;
	}

}
