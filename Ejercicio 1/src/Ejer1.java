import java.util.Scanner;
public class Ejer1 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Coloque su Primer numero: ");
		int num_1 = scr.nextInt();
		System.out.print("Coloque su Segundo numero: ");
		int num_2 = scr.nextInt();
		System.out.print("Coloque su Tercer numero: ");
		int num_3 = scr.nextInt();
		
		if(num_1 >= num_2) {
			if(num_1 >= num_3) {
				System.out.print("El numero mas grande es " + num_1);
			} else System.out.print("El numero mas grande es " + num_3);
		} else if (num_2 >= num_3) {
			System.out.print("El numero mas grande es " + num_2);
		} else System.out.print("El numero mas grande es " + num_3);
		
	}

}
