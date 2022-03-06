package persona;

public class testPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		persona p1=new persona("Pepe", 21);
		
		p1.setDni("123456789B");
		System.out.println(p1.getDni());
		
		persona p2=new persona("12345678A");
		
		System.out.println("El nombre de la persona2 es: " + p2.getNombre());
		System.out.println("La edad de la persona2 es: " + p2.getEdad());
		System.out.println("El dni de la persona2 es: " + p2.getDni());
		
		p1.correr();
		p1.correr(100);
		
		System.out.println(p1);
		

	}

}
