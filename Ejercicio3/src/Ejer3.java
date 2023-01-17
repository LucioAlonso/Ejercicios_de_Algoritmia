import java.util.Scanner;
public class Ejer3 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Coloque su Primer numero: ");
		int num_1 = scr.nextInt();
		
		System.out.print("Coloque su Segundo numero: ");
		int num_2 = scr.nextInt();
		
		System.out.print("Coloque - o +: ");
		char action = scr.next().charAt(0);
		
		if(action == '+') {
			System.out.print("El resultado de la suma es: " + (num_1 + num_2));
		}else if(action == '-'){
			System.out.print("El resultado de la suma es: " + (num_1 - num_2));
		}

	}

}
