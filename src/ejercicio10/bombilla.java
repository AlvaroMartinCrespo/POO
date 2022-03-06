package ejercicio10;

public class bombilla {
	
//	Atributos
	
	private boolean interruptor;
	private static boolean interruptorGeneral;
	
	
//	Constructor
	
	public bombilla(boolean interruptor) {
	this.interruptor = interruptor;
}
	
	
	
//	Métodos
	public void interruptorGeneral() {
		
		if(interruptor==true) {
			interruptor=false;
		}else if(interruptor==false) {
			interruptor=true;
		}
		
	}

	public void estadoBombilla() {
		
		if(interruptor==true) {
			System.out.println("La bombilla esta encendida");
			
		}else if(interruptor==false) {
			System.out.println("La bombilla esta apagada");
		}
		
	}
	
	public void encenderBombilla() {
		
		interruptor=true;
		
	}
	
	public void apagarBombilla() {
		
		interruptor=false;
		
	}
	
//	Getters y Setters
	
	public static boolean isInterruptorGeneral() {
		return interruptorGeneral;
	}

	public static void setInterruptorGeneral(boolean interruptorGeneral) {
		bombilla.interruptorGeneral = interruptorGeneral;
	}

	
	
}
