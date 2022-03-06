package Ejercicio4RE7;

public class Jarra {

//	ATRIBUTOS Y CONSTANTES

	final int JARRAPORDEFECTO = 0;

	private int capacidad;
	private int variacionAgua;
	private static int totalAgua;

//	CONSTRUCTOR

	public Jarra(int capacidad) throws JarraException {
		this.capacidad = capacidad;
		
		if(capacidad<0) {
			
			throw new JarraException("No puedes crear una jarra con valor negativo");
			
		}
		
		this.variacionAgua = JARRAPORDEFECTO;
	}

//	GETTERS Y SETTERS

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getVariacionAgua() {
		return variacionAgua;
	}

	public void setVariacionAgua(int variacionAgua) {
		this.variacionAgua = variacionAgua;
	}
	
	public static int getTotalAgua() {
		return totalAgua;
	}

	public static void setTotalAgua(int totalAgua) {
		Jarra.totalAgua = totalAgua;
	}

//	METODOS

	public void llenarJarra() throws JarraException {
		
		int aguaConsumida;

		if (getVariacionAgua() == getCapacidad()) {

			throw new JarraException("La jarra ya esta llena");

		}

		setVariacionAgua(getCapacidad());
		
		aguaConsumida= capacidad - variacionAgua;
		totalAgua += aguaConsumida;
		variacionAgua=capacidad;
		
		
		System.out.println(".:JARRA LLENADA CORRECTAMENTE:.");

		System.out.println(toString());

	}

	public void vaciarJarra() throws JarraException {

		if (getVariacionAgua() == 0) {

			throw new JarraException("La jarra ya esta vacia");

		}

		setVariacionAgua(0);

		System.out.println(".:JARRA VACIADA CORRECTAMENTE:.");

		System.out.println(toString());

	}

	public static void volcarJarraAenB(Jarra a, Jarra b) throws JarraException {

		if (a.getVariacionAgua() > b.getCapacidad()) {

			throw new JarraException("No se puede volcar la Jarra A en B ya que no cabe todo su contenido");

		}

		if (a.getVariacionAgua() == 0) {

			throw new JarraException("La jarra A está vacia");

		}

		if ((a.getVariacionAgua() + b.getVariacionAgua()) > b.getCapacidad()) {

			throw new JarraException("No cabe el agua");

		}

		a.setVariacionAgua(0);
		b.setVariacionAgua(a.getCapacidad());

		a.toString();
		b.toString();

	}

	public static void volcarJarraBenA(Jarra a, Jarra b) throws JarraException {

		if (b.getVariacionAgua() > a.getVariacionAgua()) {

			throw new JarraException("No se puede volcar la jarra B en A ya que no cabe todo su contenido");

		}

		if (b.getVariacionAgua() == 0) {

			throw new JarraException("La jarra B está vacía");

		}

		if ((b.getVariacionAgua() + a.getVariacionAgua()) > a.getCapacidad()) {

			throw new JarraException("No cabe el agua");

		}

		b.setVariacionAgua(0);
		a.setVariacionAgua(b.getCapacidad());

		a.toString();
		b.toString();

	}

	public static void verEstadoJarras(Jarra a, Jarra b) {

		System.out.println("JARRA A: " + a.toString());
		System.out.println("JARRA B: " + b.toString());

	}

//	TOSTRING

	@Override
	public String toString() {
		return "Jarra [capacidad=" + capacidad + ", variacionAgua=" + variacionAgua + "]";
	}

}
