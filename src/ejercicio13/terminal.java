package ejercicio13;

public class terminal {
	
//	Atributos
	private String numero;
	private int tiempo;

	
//	Constructor
	
	public terminal(String numero) {
		this.numero = numero;
	}
	
//	Metodos
	
	public void llama(terminal t, int tiempo) {
		
		this.tiempo+=tiempo;
		t.tiempo+=tiempo;
		
	}
	
//	Getters
	
	
	
//	ToString
	
	@Override
	public String toString() {
		return "terminal [numero=" + numero + ", tiempo=" + tiempo + "s de conversacion]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
