package ejercicio17;

public class Cliente {
	
//	Atributos
	
	private String nombre;
	private String apellido;
	private String dni;
	private Cuenta[] c;

	
//	Constructor
	
	
	public Cliente(String nombre, String apellido, String dni, Cuenta[] c) {
		this.c=c;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

//	Metodos
	
	public void ingresarDinero (Cuenta[] c,int nCuenta) {
		
		c[nCuenta].ingresarSaldo();
	}
	
	public void retirarDinero(Cuenta[] c, int nCuenta) {
		
		c[nCuenta].retirarSaldo();
	}
	
	public void consultarCuenta(Cuenta[] c, int nCuenta) {
		
		c[nCuenta].consultarSaldo();
	}




}
