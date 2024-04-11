package tiendajuegos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MAIN {
static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("Bienvenido a JAC'Games'");
		lector.nextLine();
		
		System.out.println("Regístrate para entrar en nuestra web");
		lector.nextLine();
		System.out.println("Introduce tu gmail");
		String gmail = lector.nextLine();
		
		
		Pattern p = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher m = p.matcher(gmail);
		if(m.matches()) {
			System.out.println("Introduce tu contraseña");
			String contraseña = lector.nextLine();
			
			
			
			System.out.println("EXCELSIOR!");
			
			System.out.println("¿Qué desea hacer?");
		} else {
			System.err.println("Ese usuario no existe");
		}
		
		
		
		
		
		
		
		
=======
		System.out.println("MENU");
		System.out.println("HOLA");
		System.out.println("BUENAS");
		System.out.println("Holiwis");
>>>>>>> dc5d1fbd60a1073e7e31ca973d935713855461f0

	}

}
