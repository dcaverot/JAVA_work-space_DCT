package m72_exercici2;

import java.util.Scanner;

public class M71_Exercici2 {

	public static void main(String[] args) {
		/*
		Fes un programa que mostri el següent per pantalla:

		****

		***

		**

		*
	
		El nombre de l�nies formades per "*"�� vindr� donat per un n�mero que l'��usuari introduir� per consola.
		Condici�: En tot el codi del programa nom�s hi pot haver un *
		Tamb�, a poder ser, no utilitzis cap m�tode com repeat() o substring() de la classe String
		*/

		
		Scanner sc = new Scanner(System.in);
		int lines;
		
		do {
		System.out.println("Quantes l�nies vols?");
		lines = sc.nextInt();
		if (lines<0) {
			System.out.println("El n�mero de l�nies no pot ser negatiu!");
			System.out.println();
		}
		}while(lines<0);
		
		for (int i = 1; i <= lines; i++) {
			System.out.println();
			for (int j =0; j <=lines-i;j++) {				
				System.out.print("*");
			}
			System.out.println();

		}	
		
	}

}
