package ejercicio9;

public class radio {
	
//	Atributos
	private double frecuencia;
	
	
	
//  Constructores
	public radio(double frecuenciaInicial) {
		if(frecuenciaInicial<80) {
			this.frecuencia=80;
		}else if(frecuenciaInicial>108) {
			this.frecuencia=108;
		}else {
			this.frecuencia=frecuenciaInicial;
		}
	}
	
	public radio() {
		this.frecuencia=80;
	}
	
//	Metodos
	
	public void down() {
		
		frecuencia-=0.5;
		if(frecuencia<80) {
			System.out.println("La frecuencia es menor de 80 Mhz" + "\n" + "[+] Se establece: 108 Mhz");
			frecuencia=108;
		}else {
			System.out.println("Se ha bajado 0.5 Mhz");
		}
		
		
	}
	
	public void subir() {
		
		frecuencia+=0.5;
		if(frecuencia>108) {
			System.out.println("La frecuencia es mayor de 108 Mhz" + "\n" + "[+] Se establece: 80 Mhz");
			frecuencia=80;
		}else {
			System.out.println("Se ha subido 0.5 Mhz");
		}
		
	}
	
	public void display() {
		
		System.out.println("La frecuencia es: " + frecuencia + " Mhz");
		
	}
	
	

}
