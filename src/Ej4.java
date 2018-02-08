import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		int [] contador = new int[6];

		// Pedir n�mero de veces que vamos a tirar un dado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce n�mero de veces que vamos a tirar el dador");
		int num = sc.nextInt();
		
		// Llevamos la cuenta de las veces que ha salido cada una de las caras
		for(int i=0; i<num;i++ ) {
			//Cada n�mero entero es el �ndice de un array donde llevaremos la cuenta de su ap�rici�n
			System.out.println("Tiramos el dado");
			int num2 = simulaundado();
			contador[num2] = contador[num2] +1;
		}
		
		// Mostramos resultado
		for(int i = 0; i<6;i++) {
			double aux = (double)(contador[i]*100/num);
			System.out.println("El n�mero " + (i+1) + " ha salido " + contador[i] + " veces, lo que es el " + aux);
		}
		
		
	}
	
	// Devuelve un n�mero del 1 al 6 con la misma probabilidad
	private static int simulaundado() {
		int dado = (int)(Math.random()*6);
		System.out.println(dado);
		return dado;
	}

}
