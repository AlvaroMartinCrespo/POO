package ejercicio11;

public class testCaballo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		caballo caballo1=new caballo("marron", 300, 1.4, "Macho", true );

		
		System.out.println(caballo1.toString());
		
		caballo1.setAltura(1.5);
		caballo1.setColor("Verde");
		caballo1.setManchas(false);
		caballo1.setPeso(400);
		caballo1.setSexo("Hembra");
		
		System.out.println(caballo1.toString());
		
		caballo1.galopar();
		caballo1.relincha();
		
		
		
	}

}
