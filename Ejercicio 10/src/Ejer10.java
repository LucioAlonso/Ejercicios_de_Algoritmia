import java.util.Scanner;
public class Ejer10 {
	public static void main(String[] args) {
		System.out.println("Coloque un numero: ");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		String numInv = "";
		while(num > 0) {
			numInv += num % 10;
			num = num / 10;
		}
		Integer.parseInt(numInv);
		System.out.println(numInv);
	}
}
