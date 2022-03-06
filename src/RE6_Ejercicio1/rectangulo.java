package RE6_Ejercicio1;

public class rectangulo {

//	Atributos
	private int ancho;
	private int longitud;

//	Constructor
	public rectangulo(int ancho, int longitud) throws MedidaException {
		setAncho(ancho);
		setLongitud(longitud);
	}

//	Getters y Setters

//	Metodo getter, nos devuelve un valor
	public int getAncho() {
		return ancho;
	}

//	Método setter, modifica los atributos del objeto
	public void setAncho(int ancho) throws MedidaException {

		if (ancho < 0 || ancho > 20) {

			throw new MedidaException("La medida ancho no es correcta");

		}

		this.ancho = ancho;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) throws MedidaException {

		if (ancho < 0 || ancho > 20) {

			throw new MedidaException("La medida longitud no es correcta");

		}

		this.longitud = longitud;
	}

//	Metodos

	public void area() {

//		Variables
		int area;

//		Calculamos el area
		area = longitud * ancho;
		System.out.println("El area de rectangulo es: " + area);
	}

	public void perimetro() {

//		Variables
		int perimetro;

//		Calculamos el perimetros
		perimetro = ancho * 4;
		System.out.println("El perimetro es " + perimetro);

	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ancho;
		result = prime * result + longitud;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		rectangulo other = (rectangulo) obj;
		if (ancho != other.ancho)
			return false;
		if (longitud != other.longitud)
			return false;
		return true;
	}

}
