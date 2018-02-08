import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		//Pedir cadena de texto
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una cadena");
		String cadena = sc.nextLine();
		
		// Convertir todo a mayúsculas o minúsculas
		String cadena2 = cadena.toLowerCase();
				
		//Chequear que las palabras del abecedario están o no en la cadena
		String abc = "abcdefghijklmnñopqrstuvwxyz";
		for (int i = 0; i < abc.length(); i++) {
			int j;
			for(j= 0; j<cadena2.length();j++) {
				if(abc.charAt(i) == cadena2.charAt(j)) {
					break;
				}
			}
			
			if(j==cadena2.length())
				System.out.println(abc.charAt(i));
					
		}		
		
	}

}
