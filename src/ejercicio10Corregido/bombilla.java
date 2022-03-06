package ejercicio10Corregido;

public class bombilla {
	
//	Atributos
	
	private boolean interruptor;
	private static boolean interruptorGeneral=true;
	
	
//	Constructor
	
	public bombilla() {
		this.interruptor=false;
	}
	
//	Métodos
	
	public void enciende() {
		this.interruptor=true;
	}
	
	public void apaga() {
		this.interruptor=false;
	}
	
	public void muestraEstado() {
		if(this.interruptor && bombilla.interruptorGeneral) {
			System.out.println("La bombilla esta encendida");
		}else {
			System.out.println("La bombilla esta apagada");
		}
	}
	
//	Getter y Setter

	public static void setInterruptorGeneral(boolean interruptorGeneral) {
		bombilla.interruptorGeneral = interruptorGeneral;
	}
	
	
	

}
