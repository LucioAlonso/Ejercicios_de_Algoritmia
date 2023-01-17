public class Ejer6 {

	public static void main(String[] args) {
		String [] str = {"Odioso", "Amor", "Java", "POO", "Lucio", "Copa", "Odio"};
		String aux = null;
		int tam = str.length - 1;
		
		while(tam != 1) {
			for(int i = 0; tam > i; i++) {
				for(int j = 0; str[i].length() > j; j++) {
					System.out.println("Palabra en i: " + str[i]);
					System.out.println("Palabra en i+1: " + str[i+1]);
					System.out.println("====================");
					if(str[i].toUpperCase().charAt(j) > str[i+1].toUpperCase().charAt(j) || (str[i].length() > str[i+1].length() && (str[i].toUpperCase().charAt(j) == str[i+1].toUpperCase().charAt(j)))) {   //Verifico si la palabra tiene que ir antes o despues o si tienen el mismo tamaño y lo cambio de posicion.                   
						aux = str[i];
						str[i] = str[i+1];
						str[i+1] = aux;
						break;
					}  else {
						break;
					}
				}
			}
			tam--;
		}
		
		System.out.println("====================Lista Final====================");
		 for (String string : str) {
			 System.out.println(string);
		}
		
	}

}
