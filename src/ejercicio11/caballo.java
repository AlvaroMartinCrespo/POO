package ejercicio11;

public class caballo {
	
//	Atributos
	private String color;
	private int peso;
	private double altura;
	private String sexo;
	private boolean manchas;
	
//	Constructor
	public caballo(String color, int peso, double altura, String sexo, boolean manchas	) {
		this.color=color;
		this.peso=peso;
		this.altura=altura;
		this.sexo=sexo;
		this.manchas=manchas;
	}
	
//	Métodos
	
	public void galopar() {
		
		System.out.println("El caballo galopa");
		
	}
	
	public void relincha() {
		
		System.out.println("El caballo relincha");
		
	}

//	Getter y Setter
	

	public void setColor(String color) {
		this.color = color;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setManchas(boolean manchas) {
		this.manchas = manchas;
	}
	
//	ToString
	
	@Override
	public String toString() {
		return "caballo [color=" + color + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + ", manchas="
				+ manchas + "]";
	}


	
	
	
	
	

}
