package ejercicio12;

public class pizza {
	
//	Atributos 
	private String tama�o;
	private String tipo;
	private String estado="pedida";
	private static int pedidas=0;
	private static int servidas=0;
	
	
//	Construtor
	
	public pizza(String tama�o, String tipo) {
		this.tama�o = tama�o;
		this.tipo = tipo;
		this.pedidas++;
	}
	
	
//	Metodos
	public void sirve() {
		
		if(estado.equals("servida")) {
			System.out.println("Esa pizza ya esta servida");
		}else {
			estado="servida";
			this.servidas++;
		}
		
		
	}
	
//	Getters

	public static int getPedidas() {
		return pedidas;
	}


	public static int getServidas() {
		return servidas;
	}
	
//	ToString
	
	@Override
	public String toString() {
		return "pizza [tamaño=" + tama�o + ", tipo=" + tipo + ", estado=" + estado + "]";
	}


	



	

}
