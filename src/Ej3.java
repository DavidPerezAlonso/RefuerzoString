import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int[] contador = new int[100];
		
		// Pedimos un número de enteros que se van a introducir
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número de enteros que vas a pedir");
		int num = sc.nextInt();
		
		// Pide enteros entre 1 y 100
		for(int i=0; i<num;i++ ) {
			//Cada número entero es el índice de un array donde llevaremos la cuenta de su apàrición
			System.out.println("Introduce número entre 1 y 100");
			int num2 = sc.nextInt();
			contador[num2-1] = contador[num2-1] +1;
		}
		
		// Imprime tantos * como valor tenga el array
		for(int i=0; i< 100; i++) {
			if(contador[i] != 0) {
				System.out.print((i+1) +" : ");
				for(int j=0;j<contador[i];j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}
	}

}
