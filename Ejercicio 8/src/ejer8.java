import java.util.Scanner;
public class ejer8 {

	public static void main(String[] args) {
		
		System.out.print("Coloque el numero de mes: ");
		Scanner leer = new Scanner(System.in);
		int i = leer.nextInt() ;
		String [] arrayDays = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		System.out.print("El mes es " + arrayDays[i-1] + " y posee ");
		
		if(i == 2) {  //corresponde a febrero
			System.out.print("28 dias.");
		} else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
			System.out.print("31 dias.");
		} else {
			System.out.print("30 dias.");
		}
		
		
	}

}
