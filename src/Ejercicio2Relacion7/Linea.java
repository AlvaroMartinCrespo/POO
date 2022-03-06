package Ejercicio2Relacion7;

import java.util.Objects;

public class Linea {

//	Atributos 

	Punto puntoA;
	Punto puntoB;

//	Constructor

	public Linea(Punto puntoA, Punto puntoB) throws LineaException {

		if (puntoA.equals(puntoB)) {
			throw new LineaException("Error. No se puede crea la línea ya que los puntos son iguales");
		}

		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}

//	Metodos

	public void moverDerecha(double movimiento) throws LineaException {

		comprobarMovimientoCorrecto(movimiento);

		puntoA.setEjeX(puntoA.getEjeX() + movimiento);
		puntoB.setEjeX(puntoB.getEjeX() + movimiento);

	}

	public void moverIzquierda(double movimiento) throws LineaException {

		comprobarMovimientoCorrecto(movimiento);

		puntoA.setEjeX(puntoA.getEjeX() - movimiento);
		puntoB.setEjeX(puntoB.getEjeX() - movimiento);

	}

	public void moverArriba(double movimiento) throws LineaException {

		comprobarMovimientoCorrecto(movimiento);

		puntoA.setEjeY(puntoA.getEjeX() + movimiento);
		puntoB.setEjeY(puntoB.getEjeX() + movimiento);

	}

	public void moverAbajo(double movimiento) throws LineaException {

		comprobarMovimientoCorrecto(movimiento);

		puntoA.setEjeY(puntoA.getEjeX() - movimiento);
		puntoB.setEjeY(puntoB.getEjeX() - movimiento);

	}

	public void comprobarMovimientoCorrecto(double movimiento) throws LineaException {

		if (movimiento <= 0) {

			throw new LineaException("No se puede mover con dato negativo o cero");

		}
	}

//	Getters Y Setters

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

//	Equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linea other = (Linea) obj;
		return Objects.equals(puntoA, other.puntoA) && Objects.equals(puntoB, other.puntoB);
	}

}
