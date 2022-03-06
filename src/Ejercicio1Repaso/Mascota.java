package Ejercicio1Repaso;

import java.util.*;

public class Mascota {

	static Scanner entrada = new Scanner(System.in);

//	ATRIBUTOS Y CONSTANTES
	final static int PRECIOALIMENTO = 30;
	final static int PUNTOSPORMINUTO = 3;
	final static int ALIMENTOSDEFECTO=2;
	final static int PUNTOSDEFECTO=0;
	final static int TIEMPODEFECTO=0;

	private String nombre;
	private String tipo;
	private int puntos;
	private int alimentos;
	private int tiempo;

//	CONSTRUCTOR

	public Mascota(String nombre, String tipo) {

		this.nombre = nombre;
		this.tipo = tipo;
		this.puntos = PUNTOSDEFECTO;
		this.alimentos = ALIMENTOSDEFECTO;
		this.tiempo=TIEMPODEFECTO;
	}

//	GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(int alimentos) {
		this.alimentos = alimentos;
	}
	
	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

//	METODOS

	public void darComerMascota() {

//		MENSAJE COMIDA
		System.out.println("Le ha dado de comer a la mascota");

//		SE LE RESTA UNO A LA COMIDA
		setAlimentos(getAlimentos()-1);

	}

	public void comprarComida() throws MascotaException {

//		VARIABLES
		int cantidadComida, precio;

//		INGRESAMOS DATOS

		System.out.println("¿Introduzca la cantidad de alimentos que desesa comprar:");
		cantidadComida = entrada.nextInt();

//		COMPROBAMOS SI TIENE SUFICIENTES PUNTOS PARA COMPRAR LA COMIDA Y SI ES ASI SE LE RESTARAN A LOS PUNTOS

		precio = cantidadComida * PRECIOALIMENTO;

		if (this.puntos < precio) {

			throw new MascotaException("No tiene puntos suficientes para comprar la comida");

		}

		this.puntos -= precio;

	}

	public void jugar() throws MascotaException {

//		VARIABLES
		int minutos, sumaPuntos;

//		INTRODUCIMOS VALORES

		System.out.println(
				"Introduzca la cantidad de minutos que quieres jugar (No puedes introducir mas de 20 minutos)");
		minutos = entrada.nextInt();
		
//		LLAMAMOS A LA FUNCIÓN PARA QUE VAYA ALMACENANDO EL TIEMPO
		
		setTiempo(getTiempo()+minutos);

//		COMPROBAMOS

		if (minutos > 20) {

			throw new MascotaException("No puede introducir mas de 20 minutos");

		}

//		SUMAMOS PUNTOS

		sumaPuntos = minutos * PUNTOSPORMINUTO;

		this.puntos += sumaPuntos;
		
		

	}
	

//	TOSTRING

	@Override
	public String toString() {

//		VARIABLES
		String tipoAlimento;

		if (this.tipo.equals("PERRO")) {

			tipoAlimento = "Huesos";

		} else {

			tipoAlimento = "Pescado";

		}

		return "Mascota [nombre=" + nombre + ", tipo=" + tipo + ", puntos=" + puntos + "," + tipoAlimento + "="
				+ alimentos + ", tiempoJugado=" + tiempo + "]";
	}

//	EQUALS

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(tipo, other.tipo);
	}

}
