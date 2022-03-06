package persona;

public class persona {
	
//	Atributos
	private String nombre;
	private int edad;
	private String dni;
	
	private static int año=2022;

//	Constructores

	public persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}

	public persona(String dni) {
		this.dni = dni;
	}
	
//	MÃ©todos
	
	public void correr() {
		System.out.println("Soy " + this.nombre + " y estoy corriendo");
	}
	
	public void correr(int km) {
		System.out.println("Soy " + this.nombre + " y voy a correr " + km + " kms");
	}

//	Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public static int getAño() {
		return año;
	}

	public static void setAño(int año) {
		persona.año = año;
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	





	
	
	
	
	
	

}
