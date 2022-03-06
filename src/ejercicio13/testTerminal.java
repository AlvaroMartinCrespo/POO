package ejercicio13;

public class testTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Instanciamos las clases
		
		terminal t1=new terminal("678 11 22 33");
		terminal t2=new terminal("644 74 44 69");
		terminal t3=new terminal("622 32 89 09");
		terminal t4=new terminal("664 73 98 18");
		
		System.out.println(t1);
		System.out.println(t2);
		
		t1.llama(t2, 320);
		t1.llama(t3, 200);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);

	}

}
