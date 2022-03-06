package ejercicio10Corregido;

public class testBombilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Instanciamos las clases
		bombilla bombillaSalon=new bombilla();
		bombilla bombillaDormitorio =new bombilla();
		
		bombillaSalon.enciende();
		bombillaDormitorio.apaga();
		
		System.out.println("Salón:");
		bombillaSalon.muestraEstado();
		System.out.println("Dormitorio: ");
		bombillaDormitorio.muestraEstado();
		
		bombilla.setInterruptorGeneral(false);
		
		System.out.println("Salón:");
		bombillaSalon.muestraEstado();
		System.out.println("Dormitorio: ");
		bombillaDormitorio.muestraEstado();
		

		
		
		
	}

}
