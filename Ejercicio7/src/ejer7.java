import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int hora = -1;
		int min = -1;
		int seg = -1;
		boolean err = false;
		
		do{
			System.out.print("Coloque la Hora: ");	
			hora = leer.nextInt();
			if(hora < 0 || hora > 23) {
				err = true;
				System.out.println("Hora Ingresada INVALIDA");	
			} else {
				err = false;
			}
		}while(err == true);

		do{
			System.out.print("Coloque los Minutos: ");	
			min = leer.nextInt();
			if(min < 0 || min > 59) {
				err = true;
				System.out.println("Minuto Ingresado INVALIDO");	
			} else {
				err = false;
			}
		}while(err == true);
		
		do{
			System.out.print("Coloque los Segundos: ");	
			seg = leer.nextInt();
			if(seg < 0 || seg > 59) {
				err = true;
				System.out.println("Segundo Ingresado INVALIDO");	
			} else {
				err = false;
			}
		}while(err == true);
		
		
		leer.close();
		System.out.println(hora + ":" + min + ":" + seg);		
	}

}
