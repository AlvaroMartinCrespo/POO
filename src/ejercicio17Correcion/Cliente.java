package ejercicio17Correcion;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String dni;
	private Cuenta[] arrayCuentas;
	
	
//	Constructor
	
	public Cliente(String nombre, String apellido, String dni, Cuenta[] arrayCuentas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.arrayCuentas = arrayCuentas;
	}

	public double consultarSaldo(int indiceCuenta) {
		return arrayCuentas[indiceCuenta].getSaldo();
	}
	
	public void ingresarDinero(int indiceCuenta, double cantidad) {
		arrayCuentas[indiceCuenta].ingresarDinero(cantidad);
	}
	
	public void retirarDinero(int indiceCuenta, double cantidad) {
		arrayCuentas[indiceCuenta].retirarDinero(cantidad);
	}
	
	
	
	
	
}
