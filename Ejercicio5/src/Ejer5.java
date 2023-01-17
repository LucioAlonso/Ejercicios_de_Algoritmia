import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Introduzca una letra: ");
		char letra = scr.next().charAt(0);
		
		if(letra == 'a' || letra == 'A') {
			System.out.println(7);
		} else if (letra == 'b' || letra == 'B') {
			System.out.println(9);
		} else if (letra == 'c' || letra == 'C') {
			System.out.println(101);
		} else {
			System.out.println("La letra colocada es INVALIDA");
		}
		

	}

}
