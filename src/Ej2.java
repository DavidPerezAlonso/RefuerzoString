import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej2 {
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		//Solicitar cadena
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una cadena");
		String cadena = sc.nextLine();
		
		//
		int contador = 0;			
		StringTokenizer str;
		str = new StringTokenizer(cadena);
		while (str.hasMoreTokens()) {
			String palabra = str.nextToken();
			String aux;
			if(palabra.length() > 2)
				aux = palabra.substring(palabra.length()-2, palabra.length());
			else
				aux = palabra;
			
			if(aux.equals("ar") || aux.equals("er") || aux.equals("ir") )
					contador++;
		}
			
		System.out.println("Hay " + contador + "posibles verbos en infinitivo");
		
	}

}
