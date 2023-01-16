import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		
		int contNeg = 0;
		int contCeros = 0;
		int num = 0;
		
		System.out.println("Introduzca un numero (-25 para salir):");
		Scanner scr = new Scanner(System.in);
		
		while(num != -25) {
			num = scr.nextInt();
			if(num < 0 && num != -25) {
				contNeg++;
			} else if (num == 0 && num != -25) {
				contCeros++;
			}
		}
		
		System.out.println("Se introdujeron " + contNeg + " numeros negativos y " + contCeros + " ceros.");
		
	}
}
