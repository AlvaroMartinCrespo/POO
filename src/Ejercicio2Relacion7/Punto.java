package Ejercicio2Relacion7;

import java.util.Objects;

public class Punto {

//	Atributos

	private double ejeX;
	private double ejeY;

//	Constructor

	public Punto(double ejeX, double ejeY) {
		this.ejeX = ejeX;
		this.ejeY = ejeY;
	}

//	Getters Y Setters

	public double getEjeX() {
		return ejeX;
	}

	public void setEjeX(double ejeX) {
		this.ejeX = ejeX;
	}

	public double getEjeY() {
		return ejeY;
	}

	public void setEjeY(double ejeY) {
		this.ejeY = ejeY;
	}


//	ToString

	@Override
	public String toString() {
		return " [ejeX=" + ejeX + ", ejeY=" + ejeY + "]";
	}

//  Equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(ejeX) == Double.doubleToLongBits(other.ejeX)
				&& Double.doubleToLongBits(ejeY) == Double.doubleToLongBits(other.ejeY);
	}

}
