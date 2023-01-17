import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String userValid = "lucioalonso";
		String pwsValid = "1234";
		String user, pws;
		int contadorIntentos = 3;
		
		
		while(contadorIntentos > 0 && contadorIntentos != -1) {
			System.out.print("Coloque su usuario: ");
			user = scr.nextLine();
			
			System.out.print("Coloque su contraseña: ");
			pws = scr.nextLine();	
			
			if(!userValid.equals(user) && !pwsValid.equals(pws)) {
				contadorIntentos--;
				System.out.println("Usuario o contraseña INVALIDOS. [" + contadorIntentos + " restantes]");
			} else {
				System.out.println("INGRESO EXITOSO");
				contadorIntentos = -1;
			}
		}
		
		
		
		

	}

}
