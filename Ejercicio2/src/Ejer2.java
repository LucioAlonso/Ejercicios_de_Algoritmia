import java.util.Scanner;
public class Ejer2 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int cont = 0;
		System.out.print("Coloque una frase: ");
		String frase = scr.nextLine();
		
		System.out.print("Coloque una letra: ");
		char letra = scr.next().charAt(0);
		
		for (int i = 0; i < frase.length(); i++) {
			if(letra == frase.charAt(i)) {
				cont++;
			}
		}
		
		System.out.print("La letra se repite en la frase " + cont + " veces.");
		
	}

}
